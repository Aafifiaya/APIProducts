package com.example.productsApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.productsApp.Models.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
