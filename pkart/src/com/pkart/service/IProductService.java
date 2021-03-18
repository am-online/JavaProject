package com.pkart.service;

import java.util.List;

import com.pkart.model.Product;

public interface IProductService {

	boolean add(Product product);

	void update(Product product);

	Product getProduct(int productId);

	List<Product> getAllProducts();

}
