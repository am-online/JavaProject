package com.pkart.dao;


import com.pkart.model.Cart;
import com.pkart.model.Customer;

public interface ICustomerDao {
	
	public boolean register(Customer customer,Cart cart);

}
