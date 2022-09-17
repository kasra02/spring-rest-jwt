package com.bezkoder.spring.login.repository;

import com.bezkoder.spring.login.models.entity.ProductVariant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductVariantRepository extends JpaRepository<ProductVariant, Long> {
}