package via.sep3.databaseserver.service;

import io.grpc.stub.StreamObserver;
import org.lognet.springboot.grpc.GRpcService;
import via.sep3.databaseserver.model.User;
import via.sep3.databaseserver.model.Location;
import via.sep3.databaseserver.model.Reservation;
import via.sep3.databaseserver.model.Ride;


import via.sep3.databaseserver.protobuff.*;
import via.sep3.databaseserver.repository.UserRepository;
import via.sep3.databaseserver.repository.ReservationRepository;
import via.sep3.databaseserver.repository.RideRepository;

import java.util.*;
import java.util.stream.Collectors;

@GRpcService
public class RidesServiceGrpcImpl extends RidesGrpc.RidesImplBase
{

    private RideRepository rideRepository;
    private ReservationRepository reservationRepository;

    private UserRepository userRepository;

    public RidesServiceGrpcImpl(RideRepository repository, ReservationRepository reservationRepository, UserRepository userRepository)
    {
        rideRepository = repository;
        this.reservationRepository = reservationRepository;
        this.userRepository = userRepository;
    }


    @Override
    public void getRides(EpochTimelineMessage request, StreamObserver<RidesCollection> responseObserver)
    {
        int userId = request.getUserId();
        List<Reservation> reservationsOfTheUser = reservationRepository.findAllByUserId(userId);

        Set<Integer> ridesIds = new HashSet<>();

        for(Reservation reservation : reservationsOfTheUser)
        {
            ridesIds.add(reservation.getRide().getId());
        }


        List<Ride> iterable;
        if(request.hasEpochLowerBound() && request.hasEpochUpperBound())
        {
            iterable = rideRepository.findAllByStartTimeIsBetweenAndCapacityIsGreaterThanAndStartTimeIsGreaterThanAndIsCancelledFalse(request.getEpochLowerBound(), request.getEpochUpperBound(), 0, request.getEpochNow());
        }
        else
        {
            iterable = rideRepository.findAllByCapacityIsGreaterThanAndStartTimeIsGreaterThanAndIsCancelledFalse(0, request.getEpochNow());

        }

        iterable = iterable.stream()
                .filter(ride -> !ridesIds.contains(ride.getId()))
                .collect(Collectors.toList());

        List<RideMessage> rides = new ArrayList<>();
        for (Ride ride : iterable)
        {
            RideMessage rideMessage = createRideMessage(ride);
            rides.add(rideMessage);
        }
        RidesCollection ridesCollection = RidesCollection.newBuilder().addAllRides(rides).build();
        responseObserver.onNext(ridesCollection);
        responseObserver.onCompleted();
    }

    @Override
    public void joinRide(JoinRideMessage request, StreamObserver<ConfirmationMessage> responseObserver)
    {
        try
        {
            int rideId = request.getRideId();
            int passengerId = request.getUserId();

            Optional<User> userOptional = userRepository.findById(passengerId);
            Optional<Ride> rideOptional = rideRepository.findById(rideId);
            if (rideOptional.isPresent() && userOptional.isPresent())
            {
                Ride ride = rideOptional.get();
                Reservation reservation = new Reservation(ride, userOptional.get());
                reservationRepository.save(reservation);
                ConfirmationMessage confirmation = ConfirmationMessage.newBuilder().setConfirmationMessage("Reservation was saved into database").build();
                responseObserver.onNext(confirmation);
                responseObserver.onCompleted();
            } else
            {
                throw new Exception("There is no ride or user with such id");
            }


        } catch (Exception e)
        {
            ConfirmationMessage confirmation = ConfirmationMessage.newBuilder().setConfirmationMessage(e.getMessage()).build();
            responseObserver.onNext(confirmation);
            responseObserver.onCompleted();
        }
    }

    @Override
    public void createRide(CreateRideMessage createRideMessage, StreamObserver<RideMessage> rideMessage)
    {
        try
        {
            LocationMessage startLocation = createRideMessage.getStartLocation();
            LocationMessage destination = createRideMessage.getDestination();
            long startDate = createRideMessage.getStartDate();
            int driverId = createRideMessage.getDriverId();
            int capacity = createRideMessage.getCapacity();

            Location startLocationTemp = new Location(startLocation.getCountry(), startLocation.getCity(), startLocation.getStreet(), startLocation.getZipcode(),
                    startLocation.getCoordinateX(), startLocation.getCoordinateY());
            Location destinationTemp = new Location(destination.getCountry(), destination.getCity(), destination.getStreet(), destination.getZipcode(),
                    destination.getCoordinateX(), destination.getCoordinateY());
            User userTemp = null;
            Optional<User> optionalDriver = userRepository.findById(driverId);

            userTemp = optionalDriver.get();



            Ride ride = new Ride(startLocationTemp, destinationTemp, startDate, userTemp, capacity);
            rideRepository.save(ride);

            RideMessage rideMessage1 = createRideMessage(ride);
            rideMessage.onNext(rideMessage1);
            rideMessage.onCompleted();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getRidesByDriverId(UserIdMessage request, StreamObserver<RidesCollection> responseObserver) {
        try {
            List<Ride> iterable = rideRepository.findAllByUserId(request.getUserId());

            List<RideMessage> rides = new ArrayList<>();
            for (Ride ride : iterable)
            {
                RideMessage rideMessage = createRideMessage(ride);
                rides.add(rideMessage);
            }
            RidesCollection ridesCollection = RidesCollection.newBuilder().addAllRides(rides).build();
            responseObserver.onNext(ridesCollection);
            responseObserver.onCompleted();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void getRideById(RideIdMessage request, StreamObserver<RideMessage> responseObserver) {

        try {
            Optional<Ride> optionalRide = rideRepository.findById(request.getRideId());
            if(optionalRide.isPresent()){
                Ride ride = optionalRide.get();
                RideMessage rideMessage = createRideMessage(ride);
                responseObserver.onNext(rideMessage);
                responseObserver.onCompleted();
            }
            else{
                throw new Exception("There is no ride with such id");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void changeRideStatus(ChangeRideStatusMessage request, StreamObserver<ConfirmationMessage> responseObserver) {
        try {
            Optional<Ride> optionalRide = rideRepository.findById(request.getId());
            if(optionalRide.isPresent()){
                Ride ride = optionalRide.get();
                if(request.getStatus().equals("Cancelled"))
                {
                    ride.setCancelled(true);
                }
                rideRepository.save(ride);
                List<Reservation> reservations = reservationRepository.findAllByRideId(request.getId());
                for(Reservation reservation : reservations)
                {
                    reservation.setStatus("Cancelled by driver");
                    reservation.setAccepted(null);
                    reservationRepository.save(reservation);
                }
                ConfirmationMessage message = ConfirmationMessage.newBuilder().setConfirmationMessage("Ok").build();
                responseObserver.onNext(message);
                responseObserver.onCompleted();
            }
            else{
                throw new Exception("There is no ride with such id");
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
            ConfirmationMessage message = ConfirmationMessage.newBuilder().setConfirmationMessage("Error").build();
            responseObserver.onNext(message);
            responseObserver.onCompleted();
        }
    }

    private RideMessage createRideMessage(Ride ride)
    {
        Location destination = ride.getDestination();
        Location startLocation = ride.getStartLocation();
        User user = ride.getDriver();
        DriverMessage driverMessage = DriverMessage.newBuilder().setId(user.getId()).setName(user.getName()).setPhone(user.getPhone() + "").build();
        LocationMessage startLocationMessage = LocationMessage.newBuilder().
                setCity(startLocation.getCity()).
                setCountry(startLocation.getCountry()).
                setCoordinateX(startLocation.getCoordinateX()).
                setCoordinateY(startLocation.getCoordinateY()).
                setStreet(startLocation.getStreetName()).
                setZipcode(startLocation.getZipCode()).build();
        LocationMessage destinationMessage = LocationMessage.newBuilder().
                setCity(destination.getCity()).
                setCountry(destination.getCountry()).
                setCoordinateX(destination.getCoordinateX()).
                setCoordinateY(destination.getCoordinateY()).
                setStreet(destination.getStreetName()).
                setZipcode(destination.getZipCode()).build();


        RideMessage rideMessage = RideMessage.newBuilder().
                setCapacity(ride.getCapacity()).
                setStartDate(ride.getStartTime()).
                setDriver(driverMessage).
                setDestination(destinationMessage).
                setStartLocation(startLocationMessage).setId(ride.getId()).
                setIsCancelled(ride.isCancelled()).
                build();

        return rideMessage;
    }
}
