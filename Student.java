package com.infoysis;

public class Student {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("Setter method called : "+id);
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("Setter method called : "+name);
		this.name = name;
	}
	
}
