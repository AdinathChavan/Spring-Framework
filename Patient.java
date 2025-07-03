package com.dilipit;

public class Patient {
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		System.out.println("setter called : patient id");
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setter called : patient name");
		this.name = name;
	}
	
	

}
