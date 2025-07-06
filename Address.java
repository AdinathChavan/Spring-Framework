package sprint_annotation_autowire_field_injection;

public class Address {
	
	private int pincode;
	private String area;
	
	public Address() {
		System.out.println("Address object created...");
	}
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
	

}
