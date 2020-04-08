package com.learningES.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.learningES.model.Product;

public interface ProductRepository extends ElasticsearchRepository<Product, String> {

	Page<Product> findByProductsName(String name, Pageable pageable);

	@Query("GET /testproducts2/_search\r\n" + "{\r\n" + "  \"query\":{\r\n" + "    \"match\":{\r\n"
			+ "      \"created\":\"2019-11-23 16:34:55\"\r\n" + "    }\r\n" + "  }\r\n" + "}")
	Page<Product> findByProductsNameUsingCustomQuery(String name, Pageable pageable);

}
