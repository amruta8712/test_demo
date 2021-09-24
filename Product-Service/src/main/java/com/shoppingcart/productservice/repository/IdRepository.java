package com.shoppingcart.productservice.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.shoppingcart.productservice.model.IdGenrator;
import com.shoppingcart.productservice.model.Product;


public interface IdRepository extends MongoRepository<IdGenrator,String>{

	

}
