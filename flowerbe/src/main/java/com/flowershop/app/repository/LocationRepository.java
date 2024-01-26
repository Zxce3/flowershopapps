package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.Location;

@Repository
public interface LocationRepository extends JpaRepository<Location, Long> {
    @Query(value = "select * from location where is_delete = false", nativeQuery = true)
    List<Location> findByIsDelete();

    @Query(value = "select * from location where is_delete = false and id = ?1", nativeQuery = true)
    Optional<Location> findById(Long id);
}
