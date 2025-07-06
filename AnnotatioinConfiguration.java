package sprint_annotation_autowire_field_injection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnnotatioinConfiguration {
	
	@Bean("student")
	public Student getStudent() {
		Student one = new Student();
		one.setId(12);
		one.setName("adinath chavan");
		return  one;
	}
	
	@Bean
	public Address getAddress() {
		Address one = new Address();
		one.setArea("kolhapur");
		one.setPincode(416123);
		return one;
	}
	

}
