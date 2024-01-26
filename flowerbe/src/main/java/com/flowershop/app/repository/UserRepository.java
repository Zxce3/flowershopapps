package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    @Query(value = "select * from user where is_delete = false", nativeQuery = true)
    List<User> findByIsDelete();

    @Query(value = "select * from user where is_delete = false and id = ?1", nativeQuery = true)
    Optional<User> findById(Long id);
}
