package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query(value = "select * from product where is_delete = false", nativeQuery = true)
    List<Product> findByIsDelete();

    @Query(value = "select * from product where is_delete = false and id = ?1", nativeQuery = true)
    Optional<Product> findById(Long id);
}
