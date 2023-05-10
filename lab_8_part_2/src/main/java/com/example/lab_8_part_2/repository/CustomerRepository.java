package com.example.lab_8_part_2.repository;

import com.example.lab_8_part_2.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
