package com.example.lab_8_part_2.service;

import com.example.lab_8_part_2.model.Customer;
import com.example.lab_8_part_2.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer getById(Long id) {
        //    log.info("IN CustomerServiceImpl getById {}");
        return customerRepository.findById(id).get();
    }

    @Override
    public void save(Customer customer) {
        customerRepository.save(customer);
    }

    @Override
    public void delete(Long id) {
        customerRepository.delete(customerRepository.findById(id).get());
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }
}
