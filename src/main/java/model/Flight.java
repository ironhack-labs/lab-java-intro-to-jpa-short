package model;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "flights")
public class Flight {

    @Id
    @Column(name = "flightId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String flightNumber;
    private String aircraft;
    private Integer totalSeats;
    private Integer flightMileage;

    @OneToMany(mappedBy = "flight")
    private Set<FlightBooking> bookings = new HashSet<>();

    public Flight() {
    }

    public Flight(String aircraft, String flightNumber, Integer totalAircraftSeats, Integer flightMileage) {
        this.aircraft = aircraft;
        this.flightNumber = flightNumber;
        this.totalSeats = totalAircraftSeats;
        this.flightMileage = flightMileage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAircraft() {
        return aircraft;
    }

    public void setAircraft(String aircraft) {
        this.aircraft = aircraft;
    }

    public Integer getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(Integer totalAircraftSeats) {
        this.totalSeats = totalAircraftSeats;
    }

    public Integer getFlightMileage() {
        return flightMileage;
    }

    public void setFlightMileage(Integer flightMileage) {
        this.flightMileage = flightMileage;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightNumber='" + flightNumber + '\'' +
                ", aircraft='" + aircraft + '\'' +
                ", totalAircraftSeats=" + totalSeats +
                ", flightMileage=" + flightMileage +
                '}';
    }
}