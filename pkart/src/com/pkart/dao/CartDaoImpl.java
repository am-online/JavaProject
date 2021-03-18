package com.pkart.dao;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.newkart.model.Cart;
import com.newkart.model.Customer;
import com.newkart.model.Product;

public class CartDaoImpl implements ICartDao {
	Map<Customer,List<Product>> cartItems;
	List<Product> products=new ArrayList<Product>();
	
	public CartDaoImpl() {
	if(cartItems==null) {
		cartItems=new HashMap<Customer,List<Product>>();
	}		
	}
	
	@Override
	public void add(Product product, Cart cart, Customer customer) {
		products.add(product);
		cartItems.put(customer, products);
	}

	@Override
	public List<Product> getCartItems(Customer customer) {
		return products;
	}
	
	@Override
	public List<Product> showAllProducts(){
		return ProductDaoImpl.products();
	}

}
