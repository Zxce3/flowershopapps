package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.PaymentMethod;

@Repository
public interface PaymentMethodRepository extends JpaRepository<PaymentMethod, Long>{
    @Query(value = "select * from payment_method where is_delete = false", nativeQuery = true)
    List<PaymentMethod> findByIsDelete();

    @Query(value = "select * from payment_method where is_delete = false and id = ?1", nativeQuery = true)
    Optional<PaymentMethod> findById(Long id);
}
