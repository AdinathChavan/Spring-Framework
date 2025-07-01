package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class Flipkart {
	
	public Flipkart() {
		System.out.println("default constructor called .....Flipkart");
	}

	public static void main(String[] args) {
		
		ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\Adinath Chavan\\Desktop\\java programming\\Spring Framework\\dependancyinjection\\file.xml");
		
		Order one = (Order)container.getBean("order1");
		Product two = (Product) container.getBean("product1");
		
		System.out.println();
		System.out.println("actual data after object creation....");
		
		System.out.println(one.getProductId());
		System.out.println(one.getProductName());
		System.out.println("Product list..");
		System.out.println(two.getProductList());
		

	}

}
