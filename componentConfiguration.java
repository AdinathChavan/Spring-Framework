package com.component_scan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan("com.component_scan")
@Configuration
public class componentConfiguration {
	
	@Bean
	public Order getOrder() {
		return new Order(12,"Flipkart");
	}

}
