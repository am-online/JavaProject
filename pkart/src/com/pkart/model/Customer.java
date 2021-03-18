package com.pkart.model;

public class Customer {
	
	private int id;
	private String name;
	private int phone;
	private String email;
	
	public Customer(){
	}
	
	Customer(int id,String name, int phone, String email){
		this.email=email;
		this.id=id;
		this.name=name;
		this.phone=phone;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", phone=" + phone + ", email=" + email + "]";
	}
}
