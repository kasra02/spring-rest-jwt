package com.bezkoder.spring.login.converter;

import com.bezkoder.spring.login.models.entity.ProductCategory;
import com.bezkoder.spring.login.models.dto.request.CreateProductCategoryDto;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class ProductCategoryDtoToProductCategoryConverter implements Function<CreateProductCategoryDto, ProductCategory> {
    @Override
    public ProductCategory apply(CreateProductCategoryDto productCategoryDto) {
        ProductCategory productCategory = new ProductCategory();
        productCategory.setName(productCategoryDto.getName());
        productCategory.setId(productCategoryDto.getId());
        return productCategory;
    }
}
