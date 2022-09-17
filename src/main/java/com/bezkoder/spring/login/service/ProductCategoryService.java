package com.bezkoder.spring.login.service;


import com.bezkoder.spring.login.models.dto.request.CreateProductCategoryDto;
import com.bezkoder.spring.login.models.dto.response.ProductCategoryResponse;

public interface ProductCategoryService {
    ProductCategoryResponse saveCategory(CreateProductCategoryDto createProductCategoryDto);
}
