package com.morgan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Customer {

	public static void main(String[] args) {
		ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\Adinath Chavan\\Desktop\\java programming\\Spring Framework\\springautowiring\\autowiring.xml");
		
		Product list = (Product)container.getBean("product1");
		
		
		System.out.println(list.getId());
		System.out.println(list.getName());
		
		Cart cart = (Cart)container.getBean("cart");
		
		System.out.println(cart.getTotalProducts());
		System.out.println(cart.getProducts().getId());
		System.out.println(cart.getProducts().getName());
		
		
		
		Order one = (Order)container.getBean("order1");
		
		System.out.println("********************");
		
		System.out.println(one.getCart().getTotalProducts());
		System.out.println(one.getCart().getProducts().toString());
		System.out.println(one.getCart().getProducts().getId());
		System.out.println(one.getCart().getProducts().getName());

	}

}
