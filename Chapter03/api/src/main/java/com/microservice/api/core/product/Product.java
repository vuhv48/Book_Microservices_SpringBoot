package com.microservice.api.core.product;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@Getter @Setter
public class Product {
    private final int productId;
    private final String name;
    private final int weight;
    private final String serviceAddress;

}
