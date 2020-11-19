package com.emart.productservice;

import com.emart.productservice.entity.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

//Not sure where the mongorepository class should be located so I have it 'top level' for now
@Repository
public interface MongoConnect extends MongoRepository<Product, String> {}

