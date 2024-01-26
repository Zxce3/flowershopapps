package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long>{
    @Query(value = "select * from payment where is_delete = false", nativeQuery = true)
    List<Payment> findByIsDelete();

    @Query(value = "select * from payment where is_delete = false and id = ?1", nativeQuery = true)
    Optional<Payment> findById(Long id);
}
