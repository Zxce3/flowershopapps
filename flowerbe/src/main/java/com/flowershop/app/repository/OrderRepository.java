package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long>{
    @Query(value = "select * from order where is_delete = false", nativeQuery = true)
    List<Order> findByIsDelete();

    @Query(value = "select * from order where is_delete = false and id = ?1", nativeQuery = true)
    Optional<Order> findById(Long id);
}
