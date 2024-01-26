package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.ResetPassword;

@Repository
public interface ResetPasswordRepository extends JpaRepository<ResetPassword, Long>{
    @Query(value = "select * from reset_password where is_delete = false", nativeQuery = true)
    List<ResetPassword> findByIsDelete();

    @Query(value = "select * from reset_password where is_delete = false and id = ?1", nativeQuery = true)
    Optional<ResetPassword> findById(Long id);
}
