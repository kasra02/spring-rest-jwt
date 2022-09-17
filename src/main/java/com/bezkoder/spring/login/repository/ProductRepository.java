package com.bezkoder.spring.login.repository;

import com.bezkoder.spring.login.models.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}