package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
    @Query(value = "select * from customer where is_delete = false", nativeQuery = true)
    List<Customer> findByIsDelete();

    @Query(value = "select * from customer where is_delete = false and id = ?1", nativeQuery = true)
    Optional<Customer> findById(Long id);
}
