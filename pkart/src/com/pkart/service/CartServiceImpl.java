package com.pkart.service;

import java.util.List;

import com.pkart.dao.CartDaoImpl;
import com.pkart.dao.ICartDao;
import com.pkart.model.Cart;
import com.pkart.model.Customer;
import com.pkart.model.Product;

public class CartServiceImpl implements ICartService {
	private static ICartDao cartDao;
	
	public CartServiceImpl() {
		if(cartDao==null) {
			cartDao=new CartDaoImpl();
		}
	}
	
	@Override
	public boolean add(Product product, Cart cart, Customer customer) {
		cartDao.add(product, cart, customer);
		return true;
	}

	@Override
	public List<Product> getCartItems(Customer customer) {
		return cartDao.getCartItems(customer);	
	}

	@Override
	public List<Product> showAllProducts() {
		return cartDao.showAllProducts();
	}
}
