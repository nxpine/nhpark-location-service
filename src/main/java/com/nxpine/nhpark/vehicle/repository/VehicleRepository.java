package com.nxpine.nhpark.vehicle.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nxpine.nhpark.vehicle.domain.vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    // Standard CRUD methods are automatically provided by JpaRepository
}
