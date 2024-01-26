package com.flowershop.app.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.flowershop.app.entity.Menu;

@Repository
public interface MenuRepository extends JpaRepository<Menu, Long >{
    @Query(value = "select * from menu where is_delete = false", nativeQuery = true)
    List<Menu> findByIsDelete();

    @Query(value = "select * from menu where is_delete = false and id = ?1", nativeQuery = true)
    Optional<Menu> findById(Long id);
}
