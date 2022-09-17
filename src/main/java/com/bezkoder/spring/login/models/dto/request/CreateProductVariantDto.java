package com.bezkoder.spring.login.models.dto.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class CreateProductVariantDto implements Serializable {
    private final Long id;
    private final String width;
    private final String height;
    private final String composition;
    private final Float price;
    private final Float cargoPrice;
    private final Float taxPercent;
    private final String image;
    private final String thumb;
    private final Integer stock;
    private final Integer sellCount;
    private final Integer live;
}
