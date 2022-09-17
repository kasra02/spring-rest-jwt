package com.bezkoder.spring.login.models.dto.request;

import lombok.Data;

import java.io.Serializable;

@Data
public class CreateProductCategoryDto implements Serializable {
    private final Long id;
    private final String name;
}
