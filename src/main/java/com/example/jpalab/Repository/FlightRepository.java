package com.example.jpalab.Repository;

import com.example.jpalab.Entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Integer> {
}

