package com.example.introtojpahw.Service;

import com.example.introtojpahw.Repository.FlightRepository;
import com.example.introtojpahw.model.Flight;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightService {

    private final FlightRepository flightRepository;

    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public void saveAll(List<Flight> flights) {
        flightRepository.saveAll(flights);
    }

    public List<Flight> findAll() {
        return flightRepository.findAll();
    }

    public Flight findById(int id) {
        return flightRepository.findById(id).get();
    }

    public void deleteById(int id) {
        flightRepository.deleteById(id);
    }

    public void save(Flight flight) {
        flightRepository.save(flight);
    }

    public long count() {
        return flightRepository.count();
    }
}