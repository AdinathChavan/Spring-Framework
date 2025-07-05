package com.component_scan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext container = new AnnotationConfigApplicationContext(componentConfiguration.class);
		
		
		//in this we not give the bean id to the object then container will give its method name as bean id of object. in camelCase.
		Order one = (Order) container.getBean("getOrder");
		
		System.out.println(one.getCompany());
		System.out.println(one.getTotal());

	}

}
