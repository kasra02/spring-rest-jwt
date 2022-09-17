package com.bezkoder.spring.login.api;

import com.bezkoder.spring.login.models.dto.request.CreateProductDto;
import com.bezkoder.spring.login.models.dto.response.ProductResponse;
import com.bezkoder.spring.login.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/public/products")
public class ProductController   {

    private final ProductService productService;

    @PostMapping
    public ProductResponse createProduct(@RequestBody CreateProductDto createProductDto){
        System.out.println(createProductDto);
        return productService.saveProduct(createProductDto);
    }




}