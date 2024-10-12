package service;

import model.FlightBooking;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.FlightBookingRepository;
@Service
@Transactional

public class FlightBookingService {

    private FlightBookingRepository flightBookingRepository;

    public FlightBookingService(FlightBookingRepository flightBookingRepository) {
        this.flightBookingRepository = flightBookingRepository;
    }

    public FlightBooking save(FlightBooking flightBooking) {
        return flightBookingRepository.save(flightBooking);
    }


}
