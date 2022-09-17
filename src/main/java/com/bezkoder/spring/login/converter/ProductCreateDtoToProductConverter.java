package com.bezkoder.spring.login.converter;

import com.bezkoder.spring.login.models.dto.request.CreateProductDto;
import com.bezkoder.spring.login.models.entity.Product;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ProductCreateDtoToProductConverter implements Function<CreateProductDto, Product> {
    @Override
    public Product apply(CreateProductDto productDto) {
        Product product = new Product();
        product.setName(productDto.getName());
        product.setId(productDto.getId());
        return product;
    }
}
