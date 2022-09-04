package com.example.e.demoJS.repository;

import com.example.e.demoJS.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    Product findByName(String name);
}
