package com.bezkoder.spring.login.api;

import com.bezkoder.spring.login.converter.CreateProductVariantDtoToProductVariantConverter;
import com.bezkoder.spring.login.models.dto.request.CreateProductVariantDto;
import com.bezkoder.spring.login.models.entity.Product;
import com.bezkoder.spring.login.models.entity.ProductVariant;
import com.bezkoder.spring.login.repository.ProductRepository;
import com.bezkoder.spring.login.repository.ProductVariantRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/public/productsVariant")
@RequiredArgsConstructor

public class ProductVariantController extends PublicApiController  {

    private final ProductVariantRepository productVariantRepository;
    private final ProductRepository productRepository;
    private final CreateProductVariantDtoToProductVariantConverter createProductVariantDtoToProductVariantConverter;

    @PostMapping("/{productId}")
    public void createProductVariant(
            @PathVariable("productId") Long productId,
            @RequestBody CreateProductVariantDto createProductVariantDto){

        Product product1 = productRepository.findById(productId).map(product -> {

            ProductVariant productVariant =
                    createProductVariantDtoToProductVariantConverter.apply(createProductVariantDto);

            product.getProductVariants().add(productVariant);
            productVariant.setProduct(product);

            return productRepository.save(product);
        }).orElseThrow(() -> new RuntimeException("no product with id" + productId));
    }

    

}