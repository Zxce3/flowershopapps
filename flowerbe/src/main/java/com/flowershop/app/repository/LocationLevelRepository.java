package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.LocationLevel;

@Repository
public interface LocationLevelRepository extends JpaRepository<LocationLevel, Long>{
    @Query(value = "select * from location_level where is_delete = false", nativeQuery = true)
    List<LocationLevel> findByIsDelete();

    @Query(value = "select * from location_level where is_delete = false and id = ?1", nativeQuery = true)
    Optional<LocationLevel> findById(Long id);
}
