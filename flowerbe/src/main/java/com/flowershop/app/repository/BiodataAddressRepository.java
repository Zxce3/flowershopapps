package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.BiodataAddress;

@Repository
public interface BiodataAddressRepository extends JpaRepository<BiodataAddress, Long> {
    @Query(value = "select * from biodata_address where is_delete = false", nativeQuery = true)
    List<BiodataAddress> findByIsDelete();

    @Query(value = "select * from biodata_address where is_delete = false and id = ?1", nativeQuery = true)
    Optional<BiodataAddress> findById(Long id);
}
