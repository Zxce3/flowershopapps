package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.OrderDetail;

@Repository
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long>{
    @Query(value = "select * from order_detail where is_delete = false", nativeQuery = true)
    List<OrderDetail> findByIsDelete();

    @Query(value = "select * from order_detail where is_delete = false and id = ?1", nativeQuery = true)
    Optional<OrderDetail> findById(Long id);
}
