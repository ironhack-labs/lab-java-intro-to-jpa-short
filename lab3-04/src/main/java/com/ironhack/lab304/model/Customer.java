package com.ironhack.lab304.model;

import jakarta.persistence.*;

@Entity
@Table(name = "customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private CustomerStatus customer;

    private Integer totalCustomerMileAge;

    public Customer() {
    }

    public Customer(String name, Integer totalCustomerMileAge, CustomerStatus customer) {
        this.name = name;
        this.totalCustomerMileAge = totalCustomerMileAge;
        this.customer = customer;
    }

    public Integer getTotalCustomerMileAge() {
        return totalCustomerMileAge;
    }

    public void setTotalCustomerMileAge(Integer totalCustomerMileAge) {
        this.totalCustomerMileAge = totalCustomerMileAge;
    }

    public CustomerStatus getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerStatus customer) {
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", customer=" + customer +
                ", totalCustomerMileAge=" + totalCustomerMileAge +
                '}';
    }
}
