package com.example.introtojpahw.Repository;

import com.example.introtojpahw.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingRepository extends JpaRepository <FlightBooking, Integer> {
}
