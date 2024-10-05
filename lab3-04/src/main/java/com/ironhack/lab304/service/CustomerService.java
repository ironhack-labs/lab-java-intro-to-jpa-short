package com.ironhack.lab304.service;

import com.ironhack.lab304.model.Customer;
import com.ironhack.lab304.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void addAll(List<Customer> customerList) {
        customerRepository.saveAll(customerList);
    }

    public List<Customer> findAll() {
        return customerRepository.findAll();
    }

    public Customer findById(int id) {
        return customerRepository.findById(id).get();
    }

    public void deleteById(int id) {
        customerRepository.deleteById(id);
    }

    public long count() {
        return customerRepository.count();
    }
}
