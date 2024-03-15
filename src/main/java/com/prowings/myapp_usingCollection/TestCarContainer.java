package com.prowings.myapp_usingCollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCarContainer {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		
		Car c = context.getBean(Car.class , "car");
		
		System.out.println(c);
	}

}
