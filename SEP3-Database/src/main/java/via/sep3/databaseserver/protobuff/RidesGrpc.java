package via.sep3.databaseserver.protobuff;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.39.0)",
    comments = "Source: Rides.proto")
public final class RidesGrpc {

  private RidesGrpc() {}

  public static final String SERVICE_NAME = "Rides";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.EpochTimelineMessage,
      via.sep3.databaseserver.protobuff.RidesCollection> getGetRidesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRides",
      requestType = via.sep3.databaseserver.protobuff.EpochTimelineMessage.class,
      responseType = via.sep3.databaseserver.protobuff.RidesCollection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.EpochTimelineMessage,
      via.sep3.databaseserver.protobuff.RidesCollection> getGetRidesMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.EpochTimelineMessage, via.sep3.databaseserver.protobuff.RidesCollection> getGetRidesMethod;
    if ((getGetRidesMethod = RidesGrpc.getGetRidesMethod) == null) {
      synchronized (RidesGrpc.class) {
        if ((getGetRidesMethod = RidesGrpc.getGetRidesMethod) == null) {
          RidesGrpc.getGetRidesMethod = getGetRidesMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.EpochTimelineMessage, via.sep3.databaseserver.protobuff.RidesCollection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRides"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.EpochTimelineMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.RidesCollection.getDefaultInstance()))
              .setSchemaDescriptor(new RidesMethodDescriptorSupplier("getRides"))
              .build();
        }
      }
    }
    return getGetRidesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.JoinRideMessage,
      via.sep3.databaseserver.protobuff.ConfirmationMessage> getJoinRideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "joinRide",
      requestType = via.sep3.databaseserver.protobuff.JoinRideMessage.class,
      responseType = via.sep3.databaseserver.protobuff.ConfirmationMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.JoinRideMessage,
      via.sep3.databaseserver.protobuff.ConfirmationMessage> getJoinRideMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.JoinRideMessage, via.sep3.databaseserver.protobuff.ConfirmationMessage> getJoinRideMethod;
    if ((getJoinRideMethod = RidesGrpc.getJoinRideMethod) == null) {
      synchronized (RidesGrpc.class) {
        if ((getJoinRideMethod = RidesGrpc.getJoinRideMethod) == null) {
          RidesGrpc.getJoinRideMethod = getJoinRideMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.JoinRideMessage, via.sep3.databaseserver.protobuff.ConfirmationMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "joinRide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.JoinRideMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.ConfirmationMessage.getDefaultInstance()))
              .setSchemaDescriptor(new RidesMethodDescriptorSupplier("joinRide"))
              .build();
        }
      }
    }
    return getJoinRideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.CreateRideMessage,
      via.sep3.databaseserver.protobuff.RideMessage> getCreateRideMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "createRide",
      requestType = via.sep3.databaseserver.protobuff.CreateRideMessage.class,
      responseType = via.sep3.databaseserver.protobuff.RideMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.CreateRideMessage,
      via.sep3.databaseserver.protobuff.RideMessage> getCreateRideMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.CreateRideMessage, via.sep3.databaseserver.protobuff.RideMessage> getCreateRideMethod;
    if ((getCreateRideMethod = RidesGrpc.getCreateRideMethod) == null) {
      synchronized (RidesGrpc.class) {
        if ((getCreateRideMethod = RidesGrpc.getCreateRideMethod) == null) {
          RidesGrpc.getCreateRideMethod = getCreateRideMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.CreateRideMessage, via.sep3.databaseserver.protobuff.RideMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "createRide"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.CreateRideMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.RideMessage.getDefaultInstance()))
              .setSchemaDescriptor(new RidesMethodDescriptorSupplier("createRide"))
              .build();
        }
      }
    }
    return getCreateRideMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.UserIdMessage,
      via.sep3.databaseserver.protobuff.RidesCollection> getGetRidesByDriverIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRidesByDriverId",
      requestType = via.sep3.databaseserver.protobuff.UserIdMessage.class,
      responseType = via.sep3.databaseserver.protobuff.RidesCollection.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.UserIdMessage,
      via.sep3.databaseserver.protobuff.RidesCollection> getGetRidesByDriverIdMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.UserIdMessage, via.sep3.databaseserver.protobuff.RidesCollection> getGetRidesByDriverIdMethod;
    if ((getGetRidesByDriverIdMethod = RidesGrpc.getGetRidesByDriverIdMethod) == null) {
      synchronized (RidesGrpc.class) {
        if ((getGetRidesByDriverIdMethod = RidesGrpc.getGetRidesByDriverIdMethod) == null) {
          RidesGrpc.getGetRidesByDriverIdMethod = getGetRidesByDriverIdMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.UserIdMessage, via.sep3.databaseserver.protobuff.RidesCollection>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRidesByDriverId"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.UserIdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.RidesCollection.getDefaultInstance()))
              .setSchemaDescriptor(new RidesMethodDescriptorSupplier("getRidesByDriverId"))
              .build();
        }
      }
    }
    return getGetRidesByDriverIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.RideIdMessage,
      via.sep3.databaseserver.protobuff.RideMessage> getGetRideByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getRideById",
      requestType = via.sep3.databaseserver.protobuff.RideIdMessage.class,
      responseType = via.sep3.databaseserver.protobuff.RideMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.RideIdMessage,
      via.sep3.databaseserver.protobuff.RideMessage> getGetRideByIdMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.RideIdMessage, via.sep3.databaseserver.protobuff.RideMessage> getGetRideByIdMethod;
    if ((getGetRideByIdMethod = RidesGrpc.getGetRideByIdMethod) == null) {
      synchronized (RidesGrpc.class) {
        if ((getGetRideByIdMethod = RidesGrpc.getGetRideByIdMethod) == null) {
          RidesGrpc.getGetRideByIdMethod = getGetRideByIdMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.RideIdMessage, via.sep3.databaseserver.protobuff.RideMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getRideById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.RideIdMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.RideMessage.getDefaultInstance()))
              .setSchemaDescriptor(new RidesMethodDescriptorSupplier("getRideById"))
              .build();
        }
      }
    }
    return getGetRideByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.ChangeRideStatusMessage,
      via.sep3.databaseserver.protobuff.ConfirmationMessage> getChangeRideStatusMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ChangeRideStatus",
      requestType = via.sep3.databaseserver.protobuff.ChangeRideStatusMessage.class,
      responseType = via.sep3.databaseserver.protobuff.ConfirmationMessage.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.ChangeRideStatusMessage,
      via.sep3.databaseserver.protobuff.ConfirmationMessage> getChangeRideStatusMethod() {
    io.grpc.MethodDescriptor<via.sep3.databaseserver.protobuff.ChangeRideStatusMessage, via.sep3.databaseserver.protobuff.ConfirmationMessage> getChangeRideStatusMethod;
    if ((getChangeRideStatusMethod = RidesGrpc.getChangeRideStatusMethod) == null) {
      synchronized (RidesGrpc.class) {
        if ((getChangeRideStatusMethod = RidesGrpc.getChangeRideStatusMethod) == null) {
          RidesGrpc.getChangeRideStatusMethod = getChangeRideStatusMethod =
              io.grpc.MethodDescriptor.<via.sep3.databaseserver.protobuff.ChangeRideStatusMessage, via.sep3.databaseserver.protobuff.ConfirmationMessage>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ChangeRideStatus"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.ChangeRideStatusMessage.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  via.sep3.databaseserver.protobuff.ConfirmationMessage.getDefaultInstance()))
              .setSchemaDescriptor(new RidesMethodDescriptorSupplier("ChangeRideStatus"))
              .build();
        }
      }
    }
    return getChangeRideStatusMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RidesStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RidesStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RidesStub>() {
        @java.lang.Override
        public RidesStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RidesStub(channel, callOptions);
        }
      };
    return RidesStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RidesBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RidesBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RidesBlockingStub>() {
        @java.lang.Override
        public RidesBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RidesBlockingStub(channel, callOptions);
        }
      };
    return RidesBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RidesFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RidesFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RidesFutureStub>() {
        @java.lang.Override
        public RidesFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RidesFutureStub(channel, callOptions);
        }
      };
    return RidesFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RidesImplBase implements io.grpc.BindableService {

    /**
     */
    public void getRides(via.sep3.databaseserver.protobuff.EpochTimelineMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.RidesCollection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRidesMethod(), responseObserver);
    }

    /**
     */
    public void joinRide(via.sep3.databaseserver.protobuff.JoinRideMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ConfirmationMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinRideMethod(), responseObserver);
    }

    /**
     */
    public void createRide(via.sep3.databaseserver.protobuff.CreateRideMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.RideMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateRideMethod(), responseObserver);
    }

    /**
     */
    public void getRidesByDriverId(via.sep3.databaseserver.protobuff.UserIdMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.RidesCollection> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRidesByDriverIdMethod(), responseObserver);
    }

    /**
     */
    public void getRideById(via.sep3.databaseserver.protobuff.RideIdMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.RideMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetRideByIdMethod(), responseObserver);
    }

    /**
     */
    public void changeRideStatus(via.sep3.databaseserver.protobuff.ChangeRideStatusMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ConfirmationMessage> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getChangeRideStatusMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetRidesMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.EpochTimelineMessage,
                via.sep3.databaseserver.protobuff.RidesCollection>(
                  this, METHODID_GET_RIDES)))
          .addMethod(
            getJoinRideMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.JoinRideMessage,
                via.sep3.databaseserver.protobuff.ConfirmationMessage>(
                  this, METHODID_JOIN_RIDE)))
          .addMethod(
            getCreateRideMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.CreateRideMessage,
                via.sep3.databaseserver.protobuff.RideMessage>(
                  this, METHODID_CREATE_RIDE)))
          .addMethod(
            getGetRidesByDriverIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.UserIdMessage,
                via.sep3.databaseserver.protobuff.RidesCollection>(
                  this, METHODID_GET_RIDES_BY_DRIVER_ID)))
          .addMethod(
            getGetRideByIdMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.RideIdMessage,
                via.sep3.databaseserver.protobuff.RideMessage>(
                  this, METHODID_GET_RIDE_BY_ID)))
          .addMethod(
            getChangeRideStatusMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                via.sep3.databaseserver.protobuff.ChangeRideStatusMessage,
                via.sep3.databaseserver.protobuff.ConfirmationMessage>(
                  this, METHODID_CHANGE_RIDE_STATUS)))
          .build();
    }
  }

  /**
   */
  public static final class RidesStub extends io.grpc.stub.AbstractAsyncStub<RidesStub> {
    private RidesStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RidesStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RidesStub(channel, callOptions);
    }

    /**
     */
    public void getRides(via.sep3.databaseserver.protobuff.EpochTimelineMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.RidesCollection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRidesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void joinRide(via.sep3.databaseserver.protobuff.JoinRideMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ConfirmationMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinRideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createRide(via.sep3.databaseserver.protobuff.CreateRideMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.RideMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateRideMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRidesByDriverId(via.sep3.databaseserver.protobuff.UserIdMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.RidesCollection> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRidesByDriverIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getRideById(via.sep3.databaseserver.protobuff.RideIdMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.RideMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetRideByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void changeRideStatus(via.sep3.databaseserver.protobuff.ChangeRideStatusMessage request,
        io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ConfirmationMessage> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getChangeRideStatusMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RidesBlockingStub extends io.grpc.stub.AbstractBlockingStub<RidesBlockingStub> {
    private RidesBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RidesBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RidesBlockingStub(channel, callOptions);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.RidesCollection getRides(via.sep3.databaseserver.protobuff.EpochTimelineMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRidesMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.ConfirmationMessage joinRide(via.sep3.databaseserver.protobuff.JoinRideMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinRideMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.RideMessage createRide(via.sep3.databaseserver.protobuff.CreateRideMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateRideMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.RidesCollection getRidesByDriverId(via.sep3.databaseserver.protobuff.UserIdMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRidesByDriverIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.RideMessage getRideById(via.sep3.databaseserver.protobuff.RideIdMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetRideByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public via.sep3.databaseserver.protobuff.ConfirmationMessage changeRideStatus(via.sep3.databaseserver.protobuff.ChangeRideStatusMessage request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getChangeRideStatusMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RidesFutureStub extends io.grpc.stub.AbstractFutureStub<RidesFutureStub> {
    private RidesFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RidesFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RidesFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.RidesCollection> getRides(
        via.sep3.databaseserver.protobuff.EpochTimelineMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRidesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.ConfirmationMessage> joinRide(
        via.sep3.databaseserver.protobuff.JoinRideMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinRideMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.RideMessage> createRide(
        via.sep3.databaseserver.protobuff.CreateRideMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateRideMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.RidesCollection> getRidesByDriverId(
        via.sep3.databaseserver.protobuff.UserIdMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRidesByDriverIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.RideMessage> getRideById(
        via.sep3.databaseserver.protobuff.RideIdMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetRideByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<via.sep3.databaseserver.protobuff.ConfirmationMessage> changeRideStatus(
        via.sep3.databaseserver.protobuff.ChangeRideStatusMessage request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getChangeRideStatusMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_RIDES = 0;
  private static final int METHODID_JOIN_RIDE = 1;
  private static final int METHODID_CREATE_RIDE = 2;
  private static final int METHODID_GET_RIDES_BY_DRIVER_ID = 3;
  private static final int METHODID_GET_RIDE_BY_ID = 4;
  private static final int METHODID_CHANGE_RIDE_STATUS = 5;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RidesImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RidesImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_RIDES:
          serviceImpl.getRides((via.sep3.databaseserver.protobuff.EpochTimelineMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.RidesCollection>) responseObserver);
          break;
        case METHODID_JOIN_RIDE:
          serviceImpl.joinRide((via.sep3.databaseserver.protobuff.JoinRideMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ConfirmationMessage>) responseObserver);
          break;
        case METHODID_CREATE_RIDE:
          serviceImpl.createRide((via.sep3.databaseserver.protobuff.CreateRideMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.RideMessage>) responseObserver);
          break;
        case METHODID_GET_RIDES_BY_DRIVER_ID:
          serviceImpl.getRidesByDriverId((via.sep3.databaseserver.protobuff.UserIdMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.RidesCollection>) responseObserver);
          break;
        case METHODID_GET_RIDE_BY_ID:
          serviceImpl.getRideById((via.sep3.databaseserver.protobuff.RideIdMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.RideMessage>) responseObserver);
          break;
        case METHODID_CHANGE_RIDE_STATUS:
          serviceImpl.changeRideStatus((via.sep3.databaseserver.protobuff.ChangeRideStatusMessage) request,
              (io.grpc.stub.StreamObserver<via.sep3.databaseserver.protobuff.ConfirmationMessage>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RidesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RidesBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return via.sep3.databaseserver.protobuff.RidesOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Rides");
    }
  }

  private static final class RidesFileDescriptorSupplier
      extends RidesBaseDescriptorSupplier {
    RidesFileDescriptorSupplier() {}
  }

  private static final class RidesMethodDescriptorSupplier
      extends RidesBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RidesMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RidesGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RidesFileDescriptorSupplier())
              .addMethod(getGetRidesMethod())
              .addMethod(getJoinRideMethod())
              .addMethod(getCreateRideMethod())
              .addMethod(getGetRidesByDriverIdMethod())
              .addMethod(getGetRideByIdMethod())
              .addMethod(getChangeRideStatusMethod())
              .build();
        }
      }
    }
    return result;
  }
}
