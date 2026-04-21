package com.project.retailbilling.repository;

import com.project.retailbilling.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}