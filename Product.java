package com.morgan;

public class Product {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setter method called from Product - id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setter method called from Product - name");
		this.name = name;
	}
	

}
