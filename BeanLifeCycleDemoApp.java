package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
	
//load the spring container
				ClassPathXmlApplicationContext context = new 
						ClassPathXmlApplicationContext ("beanLifeCycle-applicationContext.xml");
//Retrieve bean from the spring container	
				Coach theCoach = context.getBean("myTrackCoach",Coach.class);

				System.out.println("coach " +theCoach.getDailyWorkout());
				context.close();
				
	}

}
