package com.nxpine.nhpark.vehicle.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nxpine.nhpark.vehicle.domain.Vehicle;
import com.nxpine.nhpark.vehicle.repository.VehicleRepository;
import com.nxpine.nhpark.vehicle.service.VehicleService;

@Service
@Transactional
public class VehicleServiceImpl implements VehicleService {

    private final VehicleRepository vehicleRepository;

    public VehicleServiceImpl(VehicleRepository vehicleRepository) {
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public List<Vehicle> getAllVehicles() {
        return vehicleRepository.findAll();
    }

    @Override
    public Vehicle getVehicleById(Long id) {
        return vehicleRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Vehicle not found: " + id));
    }

    @Override
    public Vehicle createVehicle(Vehicle newVehicle) {
        return vehicleRepository.save(newVehicle);
    }

    @Override
    public Vehicle updateVehicle(Long id, Vehicle updatedVehicle) {
        return vehicleRepository.save(updatedVehicle);
    }
    @Override
	public void deleteVehicle(Long id) {
		vehicleRepository.deleteById(id);		
	}

	@Override
	public List<Vehicle> getVehicleByCustomerId(Long customerId) {
		return vehicleRepository.getVehicleByCustomerId(customerId);
	}
}
