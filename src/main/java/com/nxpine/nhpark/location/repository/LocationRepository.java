package com.nxpine.nhpark.location.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nxpine.nhpark.location.domain.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    // Standard CRUD methods are automatically provided by JpaRepository
}
