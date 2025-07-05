package spring_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class School {
	
	public static void main(String[] args) {
		ApplicationContext container = new AnnotationConfigApplicationContext(ClassConfiguration.class);
		
		Student one = (Student) container.getBean("student1");
		
		System.out.println(one.getId());
		System.out.println(one.getName());
	}

}
