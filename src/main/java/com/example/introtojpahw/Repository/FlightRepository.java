package com.example.introtojpahw.Repository;

import com.example.introtojpahw.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer > {
}
