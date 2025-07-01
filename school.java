package com.byjus;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class school {
	
	

	public static void main(String[] args) {
		
		ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\Adinath Chavan\\Desktop\\java programming\\Spring Framework\\setterdependencyinjection\\setter.xml");
		
		System.out.println();
		System.out.println("Data after the object creation.........");
		
	Student one = (Student)container.getBean("student1");
	Address two = (Address)container.getBean("address1");		
	System.out.println(one.getId());
	System.out.println(one.getName());
	System.out.println(two.getAddress());
	
	System.out.println("Data after Hierarchical dependency injection ... address->studentinfo->school");
		
		StudentInfo data = (StudentInfo)container.getBean("studentdata");
		
		System.out.println();
		System.out.println(data.getInfo().getId());
		System.out.println(data.getInfo().getName());

		System.out.println(data.getAddr().getAddress());
	}

}
