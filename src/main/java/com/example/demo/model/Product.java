package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity  // This tells Spring this class represents a database table
@Data    // This Lombok annotation creates getters, setters, toString, etc. automatically
public class Product {
    
    @Id  // This marks the field as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Auto-generates values for new products
    private Long id;
    
    private String name;
    private String description;
    private Double price;
    private Integer quantity;
    
    // Thanks to @Data annotation, we don't need to write:
    // - Getters and Setters
    // - toString()
    // - equals() and hashCode()
    // Lombok generates them automatically!
} 