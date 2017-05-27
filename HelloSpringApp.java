package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {

	public static void main(String[] args) {
		
//load the spring container
		ClassPathXmlApplicationContext context = new 
				ClassPathXmlApplicationContext ("applicationContext.xml");
//Retrieve bean from the spring container	
		Coach theCoach = context.getBean("myCoach",Coach.class);
//Retrieve bean from the spring container	
				Coach theTrackCoach = context.getBean("myTrackCoach",Coach.class);
//Retrieve bean from the spring container	
				Coach theCricketCoach = context.getBean("myCricketCoach",Coach.class);
//Retrieve bean from the spring container	
				CricketCoach cricketCoach = context.getBean("myCricketCoach",CricketCoach.class);				
				
//call methods on the beans
		System.out.println(theCoach.getDailyWorkout());
//lets call new method for fortune
System.out.println(theCoach.getDailyFortune());
		
//call methods on the beans
				System.out.println(theTrackCoach.getDailyWorkout());
//lets call new method for fortune
				System.out.println(theTrackCoach.getDailyFortune());		
//call methods on the beans
				System.out.println(theCricketCoach.getDailyFortune());
//lets call new method for fortune
				System.out.println(theCricketCoach.getDailyWorkout());	
//call methods on the beans
				System.out.println(cricketCoach.getEmailAddress());
//lets call new method for fortune
				System.out.println(cricketCoach.getTeam());				
				
//close context
		context.close();
	}

}
