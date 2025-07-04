package com.component;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@ComponentScan("com.component")
@Configuration
public class ComponentConfiguration {
	
	
	@Bean("college1")
	public College collegeObject() {
		College one = new College();
		one.setName("JJMCOE");
		return one;
	}
	
	
	
}
