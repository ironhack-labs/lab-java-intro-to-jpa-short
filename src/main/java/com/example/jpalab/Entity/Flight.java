package com.example.jpalab.Entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Flight {
    // Getters and Setters
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightId;

    @Column(unique = true)
    private String flightNumber;

    private String aircraft;
    private Integer totalAircraftSeats;
    private Integer flightMileage;

    // Default constructor
    public Flight() {}

    // Parameterized constructor
    public Flight(String flightNumber, String aircraft, Integer totalAircraftSeats, Integer flightMileage) {
        this.flightNumber = flightNumber;
        this.aircraft = aircraft;
        this.totalAircraftSeats = totalAircraftSeats;
        this.flightMileage = flightMileage;
    }

}

