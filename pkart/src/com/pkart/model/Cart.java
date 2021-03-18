package com.pkart.model;

import java.util.ArrayList;

public class Cart {

	private long id;
	private ArrayList<Product> products;

	public Cart() {
		// TODO Auto-generated constructor stub
	}

	public Cart(long id, ArrayList<Product> products) {
		super();
		this.id = id;
		this.products = products;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public ArrayList<Product> getProducts() {
		return products;
	}

	public void setProducts(ArrayList<Product> products) {
		this.products = products;
	}

	@Override
	public String toString() {
		return "Cart [id=" + id + ", products=" + products + "]";
	}

}
