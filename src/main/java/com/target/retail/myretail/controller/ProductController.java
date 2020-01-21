package com.target.retail.myretail.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.target.retail.myretail.domain.Product;
import com.target.retail.myretail.domain.ProductRepository;

@RestController("/")
public class ProductController {
	private ProductRepository productRepository;
	@Autowired
	public ProductController(ProductRepository productRepository) {
		super();
		this.productRepository = productRepository;
	}

	@GetMapping("/products")
	public List<Product> getProducts(){
		return productRepository.findAll();
	}
	
	@GetMapping("/products/{id}")
	public Optional<Product> getProductById(@PathVariable long id){
		return productRepository.findById(id);
	}
	
	@PostMapping("/products")
	public void createProduct(@RequestBody Product product ) {
		productRepository.save(product);
	}
	
	 @PutMapping("/products") 
	 public void updateProduct(@RequestBody Product product){
		 productRepository.save(product);
	 }
	 	 
}
