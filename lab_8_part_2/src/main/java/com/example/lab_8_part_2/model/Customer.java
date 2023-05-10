package com.example.lab_8_part_2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "customers")
@Getter
@Setter
@ToString

public class Customer extends BaseEntity {

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "zip_kod")
    private String zipCode;

    @Column(name = "city")
    private String city;

}
