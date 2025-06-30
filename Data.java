package com.infoysis;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Data {

	public static void main(String[] args) {
		
		ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\Adinath Chavan\\Desktop\\java programming\\Spring Framework\\firstspringproject\\spring.xml");
		
//		Student one = (Student) container.getBean("student1");
//		
//		System.out.println(one.getId());
//		System.out.println(one.getName());

		
		

	}

}
