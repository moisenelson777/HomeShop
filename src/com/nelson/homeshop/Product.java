package com.nelson.homeshop;

public class Product {

	private String name, description;
	private double price;
	
	
	public Product(String name, String description, double price) {
		this.name = name;
		this.description = description;
		this.price = price;
	}

	public void look() {
		
	}
	
	public void buy(Bill bill, int quantity) {
		
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}
	
	
}
