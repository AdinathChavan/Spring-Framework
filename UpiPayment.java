package com.qualifier;

import org.springframework.stereotype.Component;

@Component
public class UpiPayment {

	private String upiPayment;
	
	public UpiPayment() {
		System.out.println("Upi Payment Object created....");
	}

	public String getUpiPayment() {
		return upiPayment;
	}

	public void setUpiPayment(String upiPayment) {
		this.upiPayment = upiPayment;
	}
}
