package com.ironhack.lab304.service;

import com.ironhack.lab304.model.FlightBooking;
import com.ironhack.lab304.repository.FlightBookingRepository;
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
