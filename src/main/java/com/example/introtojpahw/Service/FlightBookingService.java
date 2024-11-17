package com.example.introtojpahw.Service;

import com.example.introtojpahw.Repository.FlightBookingRepository;
import com.example.introtojpahw.model.FlightBooking;
import org.springframework.stereotype.Service;

@Service
public class FlightBookingService {

    private FlightBookingRepository flightBookingRepository;

    public FlightBookingService(FlightBookingRepository flightBookingRepository) {
        this.flightBookingRepository = flightBookingRepository;
    }

    public FlightBooking save(FlightBooking flightBooking) {
        return flightBookingRepository.save(flightBooking);
    }
}