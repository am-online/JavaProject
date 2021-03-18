package com.pkart.dao;

import java.util.HashMap;
import java.util.Map;

import com.pkart.model.Cart;
import com.pkart.model.Customer;

public class CustomerDaoImpl implements ICustomerDao {
	
public static Map<Customer, Cart> cc;

public CustomerDaoImpl() {
	if(cc==null) {
		cc=new HashMap<Customer,Cart>();
	}
}

	@Override
	public boolean register(Customer customer,Cart cart) {
		cc.put(customer,cart);
		return true;
	}
} 