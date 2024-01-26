package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.Spesification;

@Repository
public interface SpesificationRepository extends JpaRepository<Spesification, Long>{
    @Query(value = "select * from spesification where is_delete = false", nativeQuery = true)
    List<Spesification> findByIsDelete();

    @Query(value = "select * from spesification where is_delete = false and id = ?1", nativeQuery = true)
    Optional<Spesification> findById(Long id);
}
