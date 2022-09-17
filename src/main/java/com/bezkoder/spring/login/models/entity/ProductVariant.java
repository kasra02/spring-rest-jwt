package com.bezkoder.spring.login.models.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@ToString()
@Entity
@Table(name = "product_variant")
public class ProductVariant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;


    @Column(name = "width")
    private String width;

    @Column(name = "height")
    private String height;

    @Column(name = "composition")
    private String composition;

    @Column(name = "price")
    private Float price;

    @Column(name = "cargo_price")
    private Float cargoPrice;

    @Column(name = "tax_percent")
    private Float taxPercent;

    @Column(name = "image")
    private String image;

    @Column(name = "thumb")
    private String thumb;

    @Column(name = "stock")
    private Integer stock;

    @Column(name = "sell_count")
    private Integer sellCount;

    @Column(name = "live")
    private Integer live;

}