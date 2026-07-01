package com.nxpine.nhpark.vehicle.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxpine.nhpark.vehicle.domain.Vehicle;
import com.nxpine.nhpark.vehicle.service.VehicleService;

@RestController
@RequestMapping("vehicle")
@CrossOrigin(origins = "*")
public class VehicleController {

    private final VehicleService vehicleService;

    public VehicleController(VehicleService vehicleService) {
        this.vehicleService = vehicleService;
    }

    // GET all locations
    @GetMapping
    public List<Vehicle> getAll() {
        return vehicleService.getAllVehicles();
    }

    // GET location by ID
    @GetMapping("/{id}")
    public Vehicle get(@PathVariable Long id) {
        return vehicleService.getVehicleById(id);
    }

    // Create location
    @PostMapping
    public Vehicle create(@RequestBody Vehicle newVehicle) {
        return vehicleService.createVehicle(newVehicle);
    }

    // Update location
    @PatchMapping("/{id}")
    public Vehicle update(@PathVariable Long id, @RequestBody Vehicle updatedVehicle) {
        return vehicleService.updateVehicle(id, updatedVehicle);
    }
  //delete customer
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
    	vehicleService.deleteVehicle(id);
    }
}
