package com.bezkoder.spring.login.models.dto.response;

import lombok.Data;

import java.io.Serializable;

@Data
public class ProductVariantDto implements Serializable {
    private final Long id;
    private final Float price;
}
