package com.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@ComponentScan("com.*")
@Configuration
public class ConfigurationBean {
	
	@Bean("credit1")
	public CreditCard getCredit() {
		
		CreditCard one = new CreditCard();
		one.setCreditCard("Payment through Credit card 1");
		return one;
	}
	
	
	@Bean("credit2")
	public CreditCard getCreditCard() {
		
		CreditCard two  = new CreditCard();
		two.setCreditCard("Payment through Credit Card  2");
		return two;
	}
	
	@Primary
	@Bean("payment")
	public UpiPayment getUpi() {
		UpiPayment three = new UpiPayment();
		three.setUpiPayment("Payment through Upi ");
		return three;
	}
	

}
