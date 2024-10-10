package com.ironhack.lab6.model;

import com.ironhack.lab6.enums.CustomerStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;
    private String customerName;
    private int totalCustomerMileage;

    @Enumerated(EnumType.STRING)
    private CustomerStatus customerStatus;

}
