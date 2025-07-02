package com.morgan;

public class Cart {
	private int totalProducts;
	private Product products;
	
	
	public int getTotalProducts() {
		return totalProducts;
	}
	public void setTotalProducts(int totalProducts) {
		System.out.println("setter method called from Cart - totalProducts");
		this.totalProducts = totalProducts;
	}
	public Product getProducts() {
		return products;
	}
	public void setProducts(Product products) {
		System.out.println("setter method called from Cart - products");
		this.products = products;
	}
	
	

}
