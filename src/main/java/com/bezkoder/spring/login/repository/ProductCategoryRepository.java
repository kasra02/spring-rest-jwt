package com.bezkoder.spring.login.repository;

import com.bezkoder.spring.login.models.entity.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {
}