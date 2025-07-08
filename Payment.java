package com.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component("paymentOptions")
public class Payment {
	
	private String type;
	
	
//	// UpiPayment beans : upiPayment, payment
//	//in the above case the bean id is match to the dependency object name then DI success.
//	@Autowired
//	private UpiPayment payment;
//	
	
	 //UpiPayment beans : upiPayment, payment  and qualifier give is payment  then nothing match qualifier should injected.
	//in this case id is not match with object name then we give @qualifier annotation to inject DI
	// @qualifier is used when the id is not match with D Object name but we have to do DI. 
	@Autowired
	private UpiPayment paymentMethod;
	
	
	// credit card bean ids : credit1, credit2
	// and property name is cardyPayment then nothing match so will give @Qualifier("credit1") then credit 1 injected in property.
	@Autowired
	private CreditCard cardPayment;
	
	
	public UpiPayment getPaymentMethod() {
		return paymentMethod;
	}


	public void setPaymentMethod(UpiPayment paymentMethod) {
		this.paymentMethod = paymentMethod;
	}


	public CreditCard getCardPayment() {
		return cardPayment;
	}


	public void setCardPayment(CreditCard cardPayment) {
		this.cardPayment = cardPayment;
	}


	public Payment() {
		System.out.println("Payment Object Created.....");
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public UpiPayment getPayment() {
		return paymentMethod;
	}


	public void setPayment(UpiPayment payment) {
		this.paymentMethod = payment;
	}

}
