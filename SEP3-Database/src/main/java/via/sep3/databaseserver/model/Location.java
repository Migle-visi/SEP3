package via.sep3.databaseserver.model;

import javax.persistence.*;

@Entity
@Table(name="locations")
public class Location {

    @Id
    @SequenceGenerator(name="seq-gen",sequenceName="MY_SEQ_GEN",initialValue=205, allocationSize=12)
    @GeneratedValue(strategy= GenerationType.IDENTITY, generator="seq-gen")
    @Column(name="id")
    private Long id;
    private String country;
    private String city;
    private String streetName;
    private String zipCode;
    private double coordinateX;
    private double coordinateY;

    public Location(String country, String city, String streetName, String zipCode, double coordinateX, double coordinateY) {
        this.country = country;
        this.city = city;
        this.streetName = streetName;
        this.zipCode = zipCode;
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

     protected Location() {

    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public double getCoordinateX() {
        return coordinateX;
    }

    public void setCoordinateX(double coordinateX) {
        this.coordinateX = coordinateX;
    }

    public double getCoordinateY() {
        return coordinateY;
    }

    public void setCoordinateY(double coordinateY) {
        this.coordinateY = coordinateY;
    }
}
