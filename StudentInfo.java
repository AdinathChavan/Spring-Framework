package com.byjus;

public class StudentInfo {
	
	private Student info;
	private Address addr;
	
	public StudentInfo() {
		System.out.println("Default constructor called .....StudentInfo");
	}

	public Student getInfo() {
		return info;
	}

	public void setInfo(Student info) {
		this.info = info;
	}

	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	
	
	

}
