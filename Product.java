package com.component_scan;

import org.springframework.stereotype.Component;

@Component
public class Product {
	private int id;
	private String name;
	
	public Product() {
		System.out.println("Product object created....");
	}
	public Product(int id, String name){	
		this.id=id;
		this.name=name;
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
	
	

}
