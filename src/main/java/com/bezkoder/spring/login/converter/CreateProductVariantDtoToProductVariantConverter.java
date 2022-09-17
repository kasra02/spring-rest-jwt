package com.bezkoder.spring.login.converter;

import com.bezkoder.spring.login.models.dto.request.CreateProductVariantDto;
import com.bezkoder.spring.login.models.entity.ProductVariant;
import org.springframework.stereotype.Component;

import java.util.function.Function;

@Component
public class CreateProductVariantDtoToProductVariantConverter implements Function<CreateProductVariantDto, ProductVariant> {
    @Override
    public ProductVariant apply(CreateProductVariantDto productVariantDto) {
        ProductVariant productVariant = new ProductVariant();
        productVariant.setId(productVariantDto.getId());
        productVariant.setWidth(productVariantDto.getWidth());
        productVariant.setHeight(productVariantDto.getHeight());
        productVariant.setComposition(productVariantDto.getComposition());
        productVariant.setPrice(productVariantDto.getPrice());
        productVariant.setCargoPrice(productVariantDto.getCargoPrice());
        productVariant.setTaxPercent(productVariantDto.getTaxPercent());
        productVariant.setImage(productVariantDto.getImage());
        productVariant.setThumb(productVariantDto.getThumb());
        productVariant.setStock(productVariantDto.getStock());
        productVariant.setSellCount(productVariantDto.getSellCount());
        productVariant.setLive(productVariantDto.getLive());
        return productVariant;
    }
}
