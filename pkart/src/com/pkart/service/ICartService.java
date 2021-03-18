package com.pkart.service;

import java.util.List;

import com.pkart.model.Cart;
import com.pkart.model.Customer;
import com.pkart.model.Product;

public interface ICartService {
	
   boolean add(Product product, Cart cart, Customer customer);
	
   List<Product> getCartItems(Customer customer);
   
   List<Product> showAllProducts();
   
}
