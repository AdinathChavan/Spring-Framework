package com.infoysis;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class BeanConfiguration {
	
	@Bean
	public Student getStudent() {
		Student one = new Student();
		one.setName("Adinath Chavan");
		return one;
	}
	
	@Bean("student1")
	public Student getObjectStudent() {
		Student one = new Student();
		one.setName("Dhiraj Chavan");
		return one;
	}
	
	@Bean
	public Address getAddress() {
		Address one = new Address();
		one.setArea("Kolhapur");
		one.setPincode("428993");
		return one;
	}
	
	@Primary
	@Bean("address")
	public Address getObjectAddress() {
		Address one = new Address();
		one.setArea("Pune");
		one.setPincode("889778");
		return one;
	}
	

}
