package com.nxpine.nhpark.location.service;

import java.util.List;

import com.nxpine.nhpark.location.domain.Location;

public interface LocationService {

    List<Location> getAllLocations();

    Location getLocationById(Long id);

    Location createLocation(Location newLocation);

    Location updateLocation(Long id, Location updatedLocation);

	void deleteLocation(Long id);

}
	