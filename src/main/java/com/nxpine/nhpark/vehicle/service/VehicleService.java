package com.nxpine.nhpark.vehicle.service;

import java.util.List;

import com.nxpine.nhpark.vehicle.domain.Vehicle;

public interface VehicleService {

    List<Vehicle> getAllVehicles();

    Vehicle getVehicleById(Long id);

    Vehicle createVehicle(Vehicle newVehicle);

    Vehicle updateVehicle(Long id, Vehicle updatedVehicle);

    void deleteVehicle(Long id);

    List<Vehicle> getVehicleByCustomerId(Long customerId);

}