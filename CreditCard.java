package com.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Primary
@Component
public class CreditCard {
	
	private String creditCard;
	
	public CreditCard() {
		System.out.println("Credit Card Object created....");
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}
	
	public String getCreditCard() {
		return "Payment through CreditCard 3";
	}
	
	
	
	

}
