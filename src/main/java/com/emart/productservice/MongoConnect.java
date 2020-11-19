package com.emart.productservice.entity;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface MongoConnect extends MongoRepository<Product, String> {

    public Product findByName(String name);

}
