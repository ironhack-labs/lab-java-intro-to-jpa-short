package com.example.jpalab.Entity;

import com.example.jpalab.CustomerStatus;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    @Setter
    @Getter
    private String customerName;
    @Setter
    @Getter
    @Enumerated(EnumType.STRING)
    private CustomerStatus customerStatus;
    @Setter
    @Getter
    private Integer totalCustomerMileage;

    // Default constructor
    public Customer() {}

    // Parameterized constructor
    public Customer(String customerName, CustomerStatus customerStatus, Integer totalCustomerMileage) {
        this.customerName = customerName;
        this.customerStatus = customerStatus;
        this.totalCustomerMileage = totalCustomerMileage;
    }

    // Getters and Setters
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

}
