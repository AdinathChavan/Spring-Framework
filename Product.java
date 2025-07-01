package com.spring;

import java.util.Map;

public class Product {
	
	private Map<String, Double> productList;
	
	public Product() {
		System.out.println("default constructor called ... Product ");
	}
	
	
	public Product(Map<String, Double> productList) {
		System.out.println("Parameterized constructor called ... Product");
		this.productList=productList;
	}


	public Map<String, Double> getProductList() {
		return productList;
	}


	


	
	

}
