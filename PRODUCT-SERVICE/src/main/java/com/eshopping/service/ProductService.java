package com.eshopping.service;

import com.eshopping.dto.ProductRequest;
import com.eshopping.model.Product;
import com.eshopping.repository.ProductRepo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@Slf4j
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    public void createProduct(ProductRequest productRequest) {
        String id= UUID.randomUUID().toString();
        Product product=Product.builder()
                .name(productRequest.getName())
                .description(productRequest.getDescription())
                .price(productRequest.getPrice())
                .build();
        product.setId(id);
        productRepo.save(product);
        log.info("Product {} is saved",product.getId());
    }

}
