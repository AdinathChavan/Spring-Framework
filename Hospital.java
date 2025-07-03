package com.dilipit;

public class Hospital {
	
	private String name;
	private Patient patient;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("setter called : hospital name");
		this.name = name;
	}
	public Patient getPatient() {
		return patient;
	}
	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	

}
