package com.nxpine.nhpark.location.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxpine.nhpark.location.domain.Location;
import com.nxpine.nhpark.location.service.LocationService;

@RestController
@RequestMapping("location")
@CrossOrigin(origins = "*")
public class LocationController {

    private final LocationService locationService;

    public LocationController(LocationService locationService) {
        this.locationService = locationService;
    }

    // GET all locations
    @GetMapping
    public List<Location> getAll() {
        return locationService.getAllLocations();
    }

    // GET location by ID
    @GetMapping("/{id}")
    public Location get(@PathVariable Long id) {
        return locationService.getLocationById(id);
    }

    // Create location
    @PostMapping
    public Location create(@RequestBody Location newLocation) {
        return locationService.createLocation(newLocation);
    }

    // Update location
    @PatchMapping("/{id}")
    public Location update(@PathVariable Long id, @RequestBody Location updatedLocation) {
        return locationService.updateLocation(id, updatedLocation);
    }

}