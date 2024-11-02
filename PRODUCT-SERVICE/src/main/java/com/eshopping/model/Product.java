package com.eshopping.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "products")
public class Product {

    @Id
    private String id;

    @Column(unique = true)
    private String name;
    private String description;
    private BigDecimal price;
}
