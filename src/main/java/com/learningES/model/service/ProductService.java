package com.learningES.model.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.learningES.model.Product;

public interface ProductService {

	Product save(Product product);
	
	void delete(Product product);
	
	Product findOne(String id);
	
	Iterable<Product> findAll();
	
	Page<Product> findByProductsName(String name, PageRequest pageRequest);
}
