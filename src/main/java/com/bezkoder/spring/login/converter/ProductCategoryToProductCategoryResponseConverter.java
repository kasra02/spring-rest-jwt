package com.bezkoder.spring.login.converter;

import com.bezkoder.spring.login.models.dto.response.ProductCategoryResponse;
import com.bezkoder.spring.login.models.entity.ProductCategory;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ProductCategoryToProductCategoryResponseConverter implements Function<ProductCategory, ProductCategoryResponse> {
    @Override
    public ProductCategoryResponse apply(ProductCategory productCategory) {
        var productCategoryResponse = new ProductCategoryResponse();
        productCategoryResponse.setName(productCategory.getName());
        productCategoryResponse.setId(productCategory.getId());
        return productCategoryResponse;
    }
}
