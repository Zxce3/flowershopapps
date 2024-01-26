package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.Supplayer;

@Repository
public interface SupplayerRepository extends JpaRepository<Supplayer, Long> {
    @Query(value = "select * from supplayer where is_delete = false", nativeQuery = true)
    List<Supplayer> findByIsDelete();

    @Query(value = "select * from supplayer where is_delete = false and id = ?1", nativeQuery = true)
    Optional<Supplayer> findById(Long id);
}
