package com.pkart.service;

import com.pkart.model.Cart;
import com.pkart.model.Customer;

public interface ICustomerService {
	
	boolean register(Customer customer,Cart cart);

}
