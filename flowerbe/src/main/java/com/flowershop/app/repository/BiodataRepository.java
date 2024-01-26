package com.flowershop.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.Biodata;
import java.util.List;
import java.util.Optional;

@Repository
public interface BiodataRepository extends JpaRepository<Biodata, Long> {
    
    @Query(value = "select * from biodata where is_delete = false", nativeQuery = true)
    List<Biodata> findByIsDelete();

    @Query(value = "select * from biodata where is_delete = false and id = ?1", nativeQuery = true)
    Optional<Biodata> findById(Long id);
}
