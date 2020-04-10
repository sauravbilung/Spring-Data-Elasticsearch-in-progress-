package com.learningES.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

// this annotation indicates that an instance of this class will be stored in  Elasticsearch in an index called as "products" 
@Document(indexName = "products")
public class Product {

	@Id
	private String itemId;
	private String name;
	private Integer price;
	private Integer in_stock;
	private String created;

	public Product() {
		super();
	}

	public Product(String itemId, String name, Integer price, Integer in_stock, String created) {
		super();
		this.itemId = itemId;
		this.name = name;
		this.price = price;
		this.in_stock = in_stock;
		this.created = created;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

	public Integer getIn_stock() {
		return in_stock;
	}

	public void setIn_stock(Integer in_stock) {
		this.in_stock = in_stock;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	@Override
	public String toString() {

		return "Product {itemId='" + itemId + "', name='" + name + "', price='" + price + "', in_stock='" + in_stock
				+ "', created='" + created + "'}";

	}

}
