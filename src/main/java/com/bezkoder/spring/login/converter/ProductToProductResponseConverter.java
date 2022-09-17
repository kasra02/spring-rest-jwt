package com.bezkoder.spring.login.converter;

import com.bezkoder.spring.login.models.dto.response.ProductResponse;
import com.bezkoder.spring.login.models.entity.Product;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ProductToProductResponseConverter implements Function<Product, ProductResponse> {
    @Override
    public ProductResponse apply(Product product) {
        ProductResponse productResponse = new ProductResponse();
        productResponse.setId(product.getId());
        productResponse.setName(product.getName());
        return productResponse;
    }
}
