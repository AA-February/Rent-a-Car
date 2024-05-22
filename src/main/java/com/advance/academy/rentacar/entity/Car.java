package com.advance.academy.rentacar.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name = "cars")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Car {
    @Id
    private Long id;
    private String brand;
    private String make;
    private String model;
    @Column(name = "manufacturing_year")
    private Integer year;
    private String registrationNumber;

}
