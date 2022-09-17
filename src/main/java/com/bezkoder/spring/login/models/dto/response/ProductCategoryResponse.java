package com.bezkoder.spring.login.models.dto.response;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
public class ProductCategoryResponse {
    private Long id;
    private String name;
}
