package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyDemoApp {

	public static void main(String[] args) {
		
		//load the spring container
				ClassPathXmlApplicationContext context = new 
						ClassPathXmlApplicationContext ("MyDemo-applicationContext.xml");
		//Retrieve bean from the spring container	
				Coach footballCoach = context.getBean("footballCoach",Coach.class);
				System.out.println("result: " +footballCoach.getDailyWorkout());
				System.out.println("Random Fortune: " +footballCoach.getDailyFortune());
				//close the context
				context.close();

	}

}
