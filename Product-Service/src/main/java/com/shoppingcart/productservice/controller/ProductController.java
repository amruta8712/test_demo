package com.shoppingcart.productservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.shoppingcart.productservice.model.IdGenrator;
import com.shoppingcart.productservice.model.Product;
import com.shoppingcart.productservice.repository.IdRepository;
import com.shoppingcart.productservice.repository.ProductRepository;


@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/product")
public class ProductController {
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private IdRepository idRepository;
	
	@RequestMapping(value="/all")
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	@RequestMapping(value="/{id}")
	public Optional<Product> getproduct(@PathVariable int id){
		return productRepository.findById(id);
	}
	
	@RequestMapping(value="" , method=RequestMethod.POST)
	public void addproduct(@RequestBody Product product) {
		productRepository.insert(product);
	}
	
	@RequestMapping(value="/{id}" , method=RequestMethod.PUT)
	public void updateproduct(@PathVariable int id, @RequestBody Product product) {
		productRepository.save(product);
	}
	
	@RequestMapping(value="/{id}" , method=RequestMethod.DELETE)
	public void deleteproduct(@PathVariable int id) {
		productRepository.deleteById(id);
	}
	
	/*@RequestMapping("/seq")
	public int nextId() {
		IdGenrator id=idRepository.findById("Id").get();
		id.setSeq(id.getSeq()+1);
		idRepository.save(id);
		return id.getSeq()-1;
		
	}
	*/

}
