package com.nxpine.nhpark.location.service;

import java.util.List;

import com.nxpine.nhpark.location.domain.Location;

public interface LocationService {
    
	List<Location> getAllLocations();

	Location getLocationById(Long id);
    
}

	