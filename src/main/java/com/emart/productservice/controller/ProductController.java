package com.emart.productservice.controller;

import java.util.List;
import com.emart.productservice.MongoConnect;
import com.emart.productservice.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class ProductController {

    @Autowired
    private MongoConnect repository;

    //returns a big 'ol messy string with our product names/ids
    //TODO: Set up this to return JSON object
    @GetMapping("/getAllProducts")
    public String getAllProducts() {

        StringBuilder sb = new StringBuilder();

        for( Product p : repository.findAll() ) {
            sb.append(p.toString() + " ");
        }

        return sb.toString();
    }

}
