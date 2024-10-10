package com.ironhack.lab6.repository;

import com.ironhack.lab6.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
