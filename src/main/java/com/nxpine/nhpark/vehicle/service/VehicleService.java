package com.nxpine.nhpark.vehicle.service;

import java.util.List;

import com.nxpine.nhpark.vehicle.domain.Location;

public interface VehicleService {

    List<Location> getAllLocations();

    Location getLocationById(Long id);

    Location createLocation(Location newLocation);

    Location updateLocation(Long id, Location updatedLocation);

	void deleteLocation(Long id);

}
	