package com.dilipit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class Information {

	public static void main(String[] args) {
		
		ApplicationContext container = new FileSystemXmlApplicationContext("C:\\Users\\Adinath Chavan\\Desktop\\java programming\\Spring Framework\\springautowiringbytype\\spring.xml");
		
		Hospital one = (Hospital)container.getBean("hospital1");
		
		System.out.println("***************");
		
		System.out.println(one.getName());
		System.out.println(one.getPatient().getId());
		System.out.println(one.getPatient().getName());

		
		
	}

}
