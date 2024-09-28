package com.ironhack.lab304.dataloader;

import com.ironhack.lab304.model.Customer;
import com.ironhack.lab304.model.CustomerStatus;
import com.ironhack.lab304.service.CustomerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {

    private final CustomerService customerService;

    public DataLoader(CustomerService customerService) {
        this.customerService = customerService;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Customer> customers = createCustomers();
        saveCustomers(customers);
        List<Customer> customersRetrieved = findCustomers();
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
                new Customer("Salvatore", 11123, CustomerStatus.Gold),
                new Customer("Julie", 1234, CustomerStatus.None),
                new Customer("Victoria", 5678, CustomerStatus.Silver),
                new Customer("Adriana", 98765, CustomerStatus.Gold),
                new Customer("Ana", 32112, CustomerStatus.Gold),
                new Customer("Maria", 5544, CustomerStatus.None),
                new Customer("Joseph", 4433, CustomerStatus.Silver),
                new Customer("Jose", 7766, CustomerStatus.Silver),
                new Customer("Lucia", 6677, CustomerStatus.Silver),
                new Customer("Helena", 22111, CustomerStatus.Gold)
        );
    }
}
