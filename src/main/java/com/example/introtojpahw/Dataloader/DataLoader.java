package com.example.introtojpahw.Dataloader;

import com.example.introtojpahw.Service.CustomerService;
import com.example.introtojpahw.Service.FlightBookingService;
import com.example.introtojpahw.Service.FlightService;
import com.example.introtojpahw.model.Customer;
import com.example.introtojpahw.model.CustomerStatus;
import com.example.introtojpahw.model.Flight;
import com.example.introtojpahw.model.FlightBooking;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final CustomerService customerService;

    private final FlightService flightService;

    private final FlightBookingService flightBookingService;

    public DataLoader(CustomerService customerService, FlightService flightService, FlightBookingService flightBookingService) {
        this.customerService = customerService;
        this.flightService = flightService;
        this.flightBookingService = flightBookingService;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Customer> customers = createCustomers();
        saveCustomers(customers);
        List<Customer> customersRetrieved = findCustomers();

        List<Flight> flights = createFlights();
        saveFights(flights);
        List<Flight> fightsRetrieved = findFlights();

        // we create flight bookings
        // we mix customers and flights so
        // a customer one have 2 flights and
        // customer two have also 2 flights
        Flight flightOne = fightsRetrieved.get(0);
        Flight flightTwo = fightsRetrieved.get(1);
        Customer customerOne = customersRetrieved.get(0);
        Customer customerTwo = customersRetrieved.get(1);
        createFlightBooking(flightOne, customerOne);
        createFlightBooking(flightOne, customerTwo);
        createFlightBooking(flightTwo, customerOne);
        createFlightBooking(flightTwo, customerTwo);
    }

    private void createFlightBooking(Flight flightOne, Customer customerOne) {
        FlightBooking flightBooking = new FlightBooking();
        flightBooking.setFlight(flightOne);
        flightBooking.setCustomer(customerOne);
        flightBookingService.save(flightBooking);
    }

    private void saveCustomers(List<Customer> customers) {
        System.out.println("Saving customers list : " + customers.size());
        customerService.addAll(customers);
        countCustomers();
    }

    private void countCustomers() {
        System.out.println(customerService.count() + " saved customers to the DB" );
    }

    private List<Customer> findCustomers() {
        System.out.println("Retrieving customers from the DB");
        List<Customer> customers = customerService.findAll();
        System.out.println(customers.size() + " retrieved from the DB" );
        System.out.println(customers);
        return customers;
    }

    private static List<Customer> createCustomers() {
        return List.of(
                new Customer("Amorine", 15423, CustomerStatus.Gold),
                new Customer("Antoine", 4587, CustomerStatus.Silver),
                new Customer("Rafika", 12356, CustomerStatus.Gold),
                new Customer("Jean", 87521, CustomerStatus.Null),
                new Customer("Laurie", 5874566, CustomerStatus.Gold),
                new Customer("Martin", 454544, CustomerStatus.Null),
                new Customer("Christine", 4433, CustomerStatus.Gold)
        );
    }

    private static List<Flight> createFlights() {
        return List.of(
                new Flight("Boeing 777", "101", 150,10_000),
                new Flight("Boeing 888", "102", 200, 50_000),
                new Flight("Boeing 999", "103", 300, 100_000),
                new Flight("Airbus 301", "104", 150, 13_000),
                new Flight("Airbus 201", "105", 200,90_000),
                new Flight("Airbus 101", "106", 300,100_000)
        );
    }

    private void saveFights(List<Flight> flights) {
        System.out.println("Saving flights list : " + flights.size());
        flightService.saveAll(flights);
        countFlights();
    }

    private void countFlights() {
        System.out.println(flightService.count() + " saved flights to the DB" );
    }

    private List<Flight> findFlights() {
        System.out.println("Retrieving flights from the DB");
        List<Flight> flights = flightService.findAll();
        System.out.println(flights.size() + " retrieved from the DB" );
        System.out.println(flights);
        return flights;
    }
}