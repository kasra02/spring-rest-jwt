package com.bezkoder.spring.login.service;

import com.bezkoder.spring.login.models.dto.request.CreateProductDto;
import com.bezkoder.spring.login.models.dto.response.ProductResponse;

public interface ProductService {
    ProductResponse saveProduct(CreateProductDto createProductDto);

}
