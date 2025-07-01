package com.byjus;

public class Student {
	private int id;
	private String name;
	
	public Student() {
		System.out.println("Default constructor called.....Student");
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
