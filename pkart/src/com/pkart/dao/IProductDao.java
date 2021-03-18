package com.pkart.dao;

import java.util.List;

import com.pkart.model.Product;

public interface IProductDao {

	void add(Product product);

	void update(Product product);

	Product getProduct(int productId);

	List<Product> getAllProducts();

}
