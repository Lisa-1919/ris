package com.example.lab_8_part_2.service;

import com.example.lab_8_part_2.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer getById(Long id);

    void save(Customer customer);

    void delete(Long id);

    List<Customer> getAll();

}
