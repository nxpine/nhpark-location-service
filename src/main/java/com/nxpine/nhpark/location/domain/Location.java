package com.nxpine.nhpark.location.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "location")
@Data
public class Location {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)    
    @Column(name = "loc_id")
    private Long locationId;

    @Column(name = "loc_desc")
    private String locationDescription;

    @Column(name = "addr_id")
    private Long addressId;

    @Column(name = "cust_id")
    private Long customerId;

}