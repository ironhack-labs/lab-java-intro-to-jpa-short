package com.ironhack.lab6.repository;

import com.ironhack.lab6.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}
