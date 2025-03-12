package com.example.demo.repository;

import com.example.demo.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// This interface extends JpaRepository which provides basic CRUD operations
// Compare this with JDBC where you had to write all SQL queries yourself!
public interface ProductRepository extends JpaRepository<Product, Long> {
    // That's it! Spring automatically implements these methods:
    // - save(Product product)
    // - findById(Long id)
    // - findAll()
    // - deleteById(Long id)
    // and many more!
} 