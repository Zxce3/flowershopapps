package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.flowershop.app.entity.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{

    @Query(value = "select * from product_category where is_delete = false", nativeQuery = true)
    List<ProductCategory> findByIsDelete();

    @Query(value = "select * from product_category where is_delete = false and id = ?1", nativeQuery = true)
    Optional<ProductCategory> findById(Long id);
    
}
