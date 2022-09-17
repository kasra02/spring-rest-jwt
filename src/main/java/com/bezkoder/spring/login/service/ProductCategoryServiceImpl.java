package com.bezkoder.spring.login.service;

import com.bezkoder.spring.login.converter.ProductCategoryDtoToProductCategoryConverter;
import com.bezkoder.spring.login.converter.ProductCategoryToProductCategoryResponseConverter;
import com.bezkoder.spring.login.models.dto.request.CreateProductCategoryDto;
import com.bezkoder.spring.login.models.dto.response.ProductCategoryResponse;
import com.bezkoder.spring.login.models.entity.ProductCategory;
import com.bezkoder.spring.login.repository.ProductCategoryRepository;
import com.bezkoder.spring.login.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ProductCategoryServiceImpl implements ProductCategoryService {

    private final ProductCategoryDtoToProductCategoryConverter productCategoryDtoToProductCategoryConverter;
    private final ProductCategoryToProductCategoryResponseConverter productCategoryToProductCategoryResponseConverter;
    private final ProductCategoryRepository productCategoryRepository;

    @Override
    public ProductCategoryResponse saveCategory(CreateProductCategoryDto createProductCategoryDto) {
        ProductCategory productCategory = productCategoryDtoToProductCategoryConverter.apply(createProductCategoryDto);
        ProductCategory save = productCategoryRepository.save(productCategory);
        return productCategoryToProductCategoryResponseConverter.apply(save);
    }

}
