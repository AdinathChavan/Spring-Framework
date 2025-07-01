package com.spring;


public class Order {
	private String productName;
	private int productId;
	private Product productl;
	
	
	

	public Order() {
		System.out.println("default constructor called ...Order");
	}
	
	public Order(String productName, int productId, Product productl) {
		System.out.println("Parameterized constructor called....Order ");
		this.productId=productId;
		this.productName=productName;
		this.productl=productl;
	}

	public String getProductName() {
		return productName;
	}

	public int getProductId() {
		return productId;
	}

	public Product getProductl() {
		return productl;
	}

	
	
	

}
