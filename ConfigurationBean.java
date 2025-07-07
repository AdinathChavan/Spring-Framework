package com.qualifier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.*")
@Configuration
public class ConfigurationBean {
	
	@Bean("credit1")
	public CreditCard getCredit() {
		
		CreditCard one = new CreditCard();
		one.setCreditCard("Payment through Credit card");
		return one;
	}
	
	@Bean("credit2")
	public CreditCard getCreditCard() {
		return new CreditCard();
	}
	
	@Bean("payment")
	public UpiPayment getUpi() {
		return new UpiPayment();
	}
	

}
