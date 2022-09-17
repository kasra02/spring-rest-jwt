package com.bezkoder.spring.login.service;

import com.bezkoder.spring.login.converter.ProductCreateDtoToProductConverter;
import com.bezkoder.spring.login.converter.ProductToProductResponseConverter;
import com.bezkoder.spring.login.models.dto.request.CreateProductDto;
import com.bezkoder.spring.login.models.dto.response.ProductResponse;
import com.bezkoder.spring.login.models.entity.Product;
import com.bezkoder.spring.login.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductServiceImpl implements ProductService {

    private final ProductCreateDtoToProductConverter productCreateCustomConverter;
    private final ProductToProductResponseConverter productToProductResponseConverter;
    private final ProductRepository productRepository;

    @Override
    public ProductResponse saveProduct(CreateProductDto createProductDto) {
        Product product = productCreateCustomConverter.apply(createProductDto);
        Product savedProduct = productRepository.save(product);
        return productToProductResponseConverter.apply(savedProduct);
    }
}
