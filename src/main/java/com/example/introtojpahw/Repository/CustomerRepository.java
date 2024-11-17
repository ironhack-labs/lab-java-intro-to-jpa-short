package com.example.introtojpahw.Repository;

import com.example.introtojpahw.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
}
