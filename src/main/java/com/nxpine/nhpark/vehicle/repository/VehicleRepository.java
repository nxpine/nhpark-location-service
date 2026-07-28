package com.nxpine.nhpark.vehicle.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nxpine.nhpark.vehicle.domain.Vehicle;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {

	List<Vehicle> getVehicleByCustomerId(Long customerId);
}
