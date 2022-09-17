package com.bezkoder.spring.login.models.dto.response;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Data
@Setter
@Getter
@ToString
public class ProductResponse {
    private  Long id;
    private  String name;
}
