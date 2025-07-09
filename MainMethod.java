package com.infoysis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainMethod {
	
	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Student student= (Student) container.getBean("student1");
		
		System.out.println("***********************");
		
		System.out.println(student.getName());
		System.out.println(student.getAddress().getArea());
		System.out.println(student.getAddress().getPincode());
	}

}
