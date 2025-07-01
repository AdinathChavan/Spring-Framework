package com.byjus;

import java.util.List;

public class Address {
	
	private List<String> address;
	
	public Address() {
		System.out.println("Default constructor called .... Address");
	}

	public List<String> getAddress() {
		return address;
	}

	public void setAddress(List<String> address) {
		this.address = address;
	}
	
	

}
