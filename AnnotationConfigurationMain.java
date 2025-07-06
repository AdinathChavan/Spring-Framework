package sprint_annotation_autowire_field_injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AnnotationConfigurationMain {

	public static void main(String[] args) {
		
		ApplicationContext container= new AnnotationConfigApplicationContext(AnnotatioinConfiguration.class);
		
		
		Student one = (Student) container.getBean("student");
		
		System.out.println("****************");
		
		System.out.println(one.getId());
		System.out.println(one.getName());
		System.out.println(one.getAddress().getPincode());
		System.out.println(one.getAddress().getArea());
	}

}
