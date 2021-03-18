package com.pkart.service;

import com.pkart.dao.CustomerDaoImpl;
import com.pkart.dao.ICustomerDao;
import com.pkart.model.Cart;
import com.pkart.model.Customer;

public class CustomerServiceImpl implements ICustomerService {
	
	private static ICustomerDao customerDao;
	
	public CustomerServiceImpl() {
		if(customerDao==null) {
			customerDao=new CustomerDaoImpl();
		}
	}
	
	@Override
	public boolean register(Customer customer, Cart cart) {
		customerDao.register(customer, cart);
		return true;
	}
}
