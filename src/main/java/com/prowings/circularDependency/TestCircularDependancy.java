package com.prowings.circularDependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCircularDependancy {

	public static void main(String[] args) {
		
		
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans-circularDependancy.xml");
		
//		A beanA = context.getBean(A.class , "a");
		
		A2 beanA2 = context.getBean(A2.class, "a2");
		
		B beanB = context.getBean(B.class, "b");
		
		
		
//		System.out.println(beanA);
		System.out.println(beanA2);
		System.out.println(beanB);

	}

}
