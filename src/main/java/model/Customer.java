package model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Customers")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customerId")

    private Integer customerId;
    private String customerName;
    private CustomerStatus customerStatus;
    private Integer totalCustomerMileage;

    @OneToMany(mappedBy = "customer")

    private HashSet<FlightBooking> bookings = new HashSet<>();

    public Customer() {
    }

    public Customer(String customerName, Integer totalCustomerMileage, CustomerStatus customerStatus) {
        this.customerName = customerName;
        this.totalCustomerMileage = totalCustomerMileage;
        this.customerStatus = customerStatus;
    }

    public Integer getTotalCustomerMileAge() {
        return totalCustomerMileage;
    }

    public void setTotalCustomerMileAge(Integer totalCustomerMileage) {
        this.totalCustomerMileage = totalCustomerMileage;
    }

    public CustomerStatus getCustomerStatus() {
        return customerStatus;
    }

    public void setCustomerStatus(CustomerStatus customer) {
        this.customerStatus = customer;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer id) {
        this.customerId = id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + customerId +
                ", name='" + customerName + '\'' +
                ", customer=" + customerStatus +
                ", totalCustomerMileAge=" + totalCustomerMileage +
                '}';
    }
}