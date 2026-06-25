package com.nxpine.nhpark.location.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nxpine.nhpark.location.domain.Location;
import com.nxpine.nhpark.location.repository.LocationRepository;
import com.nxpine.nhpark.location.service.LocationService;

@Service
@Transactional
public class LocationServiceImpl implements LocationService {

    private final LocationRepository locationRepository;

    public LocationServiceImpl(LocationRepository locationRepository) {
        this.locationRepository = locationRepository;
    }

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @Override
    public Location getLocationById(Long id) {
        return locationRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Location not found: " + id));
    }

    @Override
    public Location createLocation(Location newLocation) {
        return locationRepository.save(newLocation);
    }

    @Override
    public Location updateLocation(Long id, Location updatedLocation) {
        return locationRepository.save(updatedLocation);
    }

}