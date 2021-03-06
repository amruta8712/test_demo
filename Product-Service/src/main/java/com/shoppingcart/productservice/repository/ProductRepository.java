package com.shoppingcart.productservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.shoppingcart.productservice.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product,Integer> {

}
