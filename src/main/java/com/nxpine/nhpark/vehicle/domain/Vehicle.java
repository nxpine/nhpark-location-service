package com.nxpine.nhpark.vehicle.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vehicle")
@Data
public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String make;

    @Column(nullable = false)
    private String model;

    @Column
    private Integer capacity;

    @Column
    private Integer year;

    @Column(name = "license_plate")
    private String licensePlate;

    @Column
    private String color;

    @Column(name = "customer_id")
    private Long customerId;
}