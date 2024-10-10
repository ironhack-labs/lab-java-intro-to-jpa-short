package com.ironhack.lab6.repository;

import com.ironhack.lab6.model.FlightBooking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightBookingRepository extends JpaRepository<FlightBooking, Integer> {
}
