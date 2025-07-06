package sprint_annotation_autowire_field_injection;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	
	private int id;
	private String name;
	
	@Autowired
	public Address address;
	@Autowired
	public Address one;
	
	public Student() {
		System.out.println("Student object created....");
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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	

}
