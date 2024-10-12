package model;

import jakarta.persistence.*;

@Entity
public class FlightBooking {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer bookingId;

    @ManyToOne
    @JoinColumn(name = "flightId")
    private Flight flight;

    @ManyToOne
    @JoinColumn(name = "customerId")
    private Customer customer;


    public FlightBooking() {
    }

    public FlightBooking(Flight flight, Customer customer) {
        this.flight = flight;
        this.customer = customer;
    }

    public Integer getBookingId() {
        return bookingId;
    }

    public void setBookingId(Integer bookingId) {
        this.bookingId = bookingId;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
