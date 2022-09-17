package com.bezkoder.spring.login.api;

import com.bezkoder.spring.login.models.dto.request.CreateProductCategoryDto;
import com.bezkoder.spring.login.models.dto.request.CreateProductDto;
import com.bezkoder.spring.login.models.dto.response.ProductCategoryResponse;
import com.bezkoder.spring.login.models.dto.response.ProductResponse;
import com.bezkoder.spring.login.models.entity.Product;
import com.bezkoder.spring.login.models.entity.ProductCategory;
import com.bezkoder.spring.login.repository.ProductCategoryRepository;
import com.bezkoder.spring.login.repository.ProductRepository;
import com.bezkoder.spring.login.service.ProductCategoryService;
import com.bezkoder.spring.login.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/public/category")
public class ProductCategoryController extends PublicApiController  {

    private final ProductCategoryService productCategoryService;
    private final ProductRepository productRepository;
    private final ProductCategoryRepository productCategoryRepository;


    @PostMapping
    public ProductCategoryResponse createProductCategory(@RequestBody CreateProductCategoryDto createProductCategoryDto){
        return productCategoryService.saveCategory(createProductCategoryDto);
    }

    @PostMapping("/{categoryId}/product/{productId}")
    public ResponseEntity<?> assignCategoryToProduct(
            @PathVariable("productId") long productId,
            @PathVariable("categoryId") long categoryId
    ){
        Product product = productRepository
                .findById(productId)
                .orElseThrow(()-> new RuntimeException("no product with id" + productId));
        ProductCategory productCategory = productCategoryRepository.findById(categoryId).orElseThrow(() -> new RuntimeException("no category with id" + categoryId));
        product.setProductCategory(productCategory);
        Product save = productRepository.save(product);
        return ResponseEntity.ok().body("ok");
    }



}