package com.nxpine.nhpark.location.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nxpine.nhpark.location.domain.Location;
import com.nxpine.nhpark.location.service.LocationService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("location")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class LocationController {

    private final LocationService locationService;

    @GetMapping
    public List<Location> getAll() {
       return locationService.getAllLocations();
    }
    
    @GetMapping("/{id}")
    public Location get(@PathVariable Long id) {
    	return locationService.getLocationById(id);
    }
    
    
    
}

