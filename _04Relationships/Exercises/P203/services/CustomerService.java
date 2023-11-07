package com.misicode._04Relationships.Exercises.P203.services;

import com.misicode._04Relationships.Exercises.P203.entities.Customer;

public class CustomerService {
    public Customer createCustomer() {
        Customer customer = new Customer();

        customer.setName("Jeremy");
        customer.setLastname("Velmont");
        customer.setIdDoc("12345");
        customer.setEmail("jere@gmail.com");
        customer.setAddress("Calle El Olvido #12");
        customer.setPhonenumber("999 999 999");

        return customer;
    }
}
