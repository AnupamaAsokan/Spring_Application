package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) {
	
//load the spring container
				ClassPathXmlApplicationContext context = new 
						ClassPathXmlApplicationContext ("beanScope-applicationContext.xml");
//Retrieve bean from the spring container	
				Coach theCoach = context.getBean("myCoach",Coach.class);
				Coach alphaCoach = context.getBean("myCoach",Coach.class);
				
				boolean result = (theCoach == alphaCoach);
				System.out.println("result " +result );
				System.out.println("coach " +theCoach );
				System.out.println("alphaCoach " +alphaCoach );
				context.close();
				
	}

}
