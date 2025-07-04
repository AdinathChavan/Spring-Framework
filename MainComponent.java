package com.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainComponent {

	public static void main(String[] args) {

		
		ApplicationContext container= new AnnotationConfigApplicationContext(ComponentConfiguration.class);
		
		
		Student one = (Student)container.getBean("student1");
		College info= (College)container.getBean("college1");
		
		System.out.println(info.getName());
		System.out.println(one.getId());
		System.out.println(one.getName());
		
	}

}
