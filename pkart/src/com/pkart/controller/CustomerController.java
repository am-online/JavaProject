package com.pkart.controller;

import java.util.List;
import java.util.Scanner;

import com.pkart.model.Product;
import com.pkart.service.IProductService;
import com.pkart.service.ProductServiceImpl;


public class CustomerController {
	private static ICartService cartService;
	private static ICustomerService customerService;
	Scanner scanner = InputUtil.getScanner();
	
	CustomerController(){
		if(cartService==null) {
			cartService=new CartServiceImpl();
		}
		else if(customerService==null) {
			customerService=new CustomerServiceImpl();
		}
	}

	public Customer getCustomerDetails() {
		System.out.println("Enter your id,name,phone,email:");
		Customer c=new Customer();
		int id=scanner.nextInt();
		String name=scanner.next();
		int phone=scanner.nextInt();
		String email=scanner.next();
		c.setId(id);
		c.setName(name);
		c.setPhone(phone);
		c.setEmail(email);
		return c;
		}
	public Cart getCartDetails() {
		System.out.println("Enter your Cart id:");
		Cart ca=new Cart();
		long id=scanner.nextLong();
		ca.setId(id);
		return ca;
	}
	
	public void operations() {
		boolean status=true;
		while(status) {
			System.out.println("Customer Services:");
			System.out.println("1.Register Yourself \n 2.Add Product \n 3.View Products Available \n 4. View Cart Items \n 5.Exit from Customer Operations");
			System.out.println("Enter your choice:");
			int choice=scanner.nextInt();			
	
			switch(choice) {
			case 1:
				System.out.println("Enter your id,name,phone,email");
				Customer cu=new Customer();
				Cart cart=new Cart();
				int id0=scanner.nextInt();
				String name0=scanner.next();
				int phone0=scanner.nextInt();
				String email0=scanner.next();

				cu.setId(id0);
				cu.setName(name0);
				cu.setPhone(phone0);
				cu.setEmail(email0);
				System.out.println("Enter your cart id:");
				long idCart=scanner.nextInt();
				
				cart.setId(idCart);
				if (customerService.register(cu,cart)) {
					System.out.println("Customer registered.");
				} else {
					System.out.println("Customer couldn't be registered.");
				}
				break;
				
			case 2:
				System.out.println("enter product id, name, price:");
				int id1=scanner.nextInt();
				String name1=scanner.next();
				double price = scanner.nextDouble();
				Product p=new Product();
				p.setId(id1);
				p.setName(name1);
				p.setPrice(price);
				
				if(cartService.add(p, getCartDetails(), getCustomerDetails())){
					System.out.println("Product added in cart successfully");
				}
				else {
					System.out.println("Product not added");
				}
				break;
			case 3:
				System.out.println(cartService.showAllProducts());
				break;
				
			case 4:
				System.out.println(cartService.getCartItems(getCustomerDetails()));
				break;
				
			case 5:
				System.out.println("Exiting Customer operations.");
				status = false;
			break;
			}
		}
		scanner.close();		
	}
}
