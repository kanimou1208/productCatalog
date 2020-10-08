package com.productCatalog.repository;


import org.springframework.data.mongodb.repository.MongoRepository;

import com.productCatalog.models.Product;

public interface ProductRepository extends MongoRepository<Product, String>{

}
