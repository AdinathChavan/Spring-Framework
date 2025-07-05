package com.component_scan;



public class Order {
	
	private int total;
	private String company;
	
	public Order() {
		System.out.println("Order object created : default constructor....");
	}
	
	public Order(int total, String company) {
		System.out.println("Order object created : parameterized constructor...");
		this.total=total;
		this.company=company;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}
	
	
	
	
}
