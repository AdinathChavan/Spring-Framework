package com.infoysis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Student {
	
	private String name;
	

	@Autowired
	private Address address12;
	
	public Student() {
		System.out.println("Student object created....");
		
		
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAddress() {
		return address12;
	}

	public void setAddress(Address address) {
		this.address12 = address;
	}

}
