package com.pkart.controller;

import java.util.List;
import java.util.Scanner;

import com.pkart.model.Product;
import com.pkart.service.IProductService;
import com.pkart.service.ProductServiceImpl;

public class AdminController {

	private static IProductService productService;

	public AdminController() {

		if (null == productService) {
			productService = new ProductServiceImpl();
		}
	}

	public void operations() {

		Scanner scanner = new Scanner(System.in);
		boolean status = true;
		while (status) {
			System.out.println("------Admin Operations----");

			System.out.println("1. Add Product \n 2.Update Product \n 3.View Product \n 4.View All Products \n 5.Exit");
			System.out.println("Enter the choice:");
			int choice = scanner.nextInt();

			switch (choice) {

			case 1:
				System.out.println("enter product id, name,price,dateOfManufacture,dateOfExpiry: ");
				int id = scanner.nextInt();
				String name = scanner.next();
				double price = scanner.nextDouble();
				String dateOfManufacture=scanner.next();
				String dateOfExpiry=scanner.next();

				Product p = new Product();
				p.setId(id);
				p.setName(name);
				p.setPrice(price);
				p.setDateOfManufacture(dateOfManufacture);
				p.setDateOfExpiry(dateOfExpiry);

				if (productService.add(p)) {
					System.out.println("Product added successfully.");
				} else {
					System.out.println("Product not added.");
				}
				break;

			case 2:
				System.out.println("Enter the product id you want to update:");
				int id0=scanner.nextInt();
				System.out.println("Enter the new name, price");
				String name0=scanner.next();
				Double price0=scanner.nextDouble();
				Product p0=new Product();
				p0.setId(id0);
				p0.setName(name0);
				p0.setPrice(price0);
				productService.update(p0,p0.getId());
				break;

			case 3:
				System.out.println("enter product id:");
				id = scanner.nextInt();
				Product product = productService.getProduct(id);
				System.out.println(product);
				break;
			case 4:
				List<Product> allProducts = productService.getAllProducts();

				for (Product prod : allProducts) {
					System.out.println(prod);
				}
				break;

			case 5:
				System.out.println("Exiting admin operations..!");
				status = false;

			}

		}

	}

}
