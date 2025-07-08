package com.qualifier;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMethod {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(ConfigurationBean.class);
		
		Payment paymentGet = (Payment) container.getBean("paymentOptions");
		
		System.out.println(paymentGet.getPayment().getUpiPayment());
		
		
		
		System.out.println(paymentGet.getCardPayment().getCreditCard());
		

	}

}
