package com.pkart.dao;


import java.util.List;

import com.pkart.model.Cart;
import com.pkart.model.Customer;
import com.pkart.model.Product;

public interface ICartDao {

	public void add(Product product, Cart cart, Customer customer);
	
	public List<Product> getCartItems(Customer customer);
	
	public List<Product> showAllProducts();
	
}
