package com.prowings.Autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestPerson {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-bean-autowiring.xml");
		
		Person bean = context.getBean(Person.class ,"per");
		
		System.out.println(bean);
	}

}
