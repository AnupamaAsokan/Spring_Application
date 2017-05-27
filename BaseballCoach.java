package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

//define a private field for the dependency
	private FortuneService fortuneService;
	
//define a constructor for dependency injection
	public BaseballCoach (FortuneService theFortuneService){
		fortuneService = theFortuneService;
	}	

	public String getDailyWorkout() {	
		return  "Spend 30 mins on batting practice";
	}

	public String getDailyFortune() {		
		//use fortuneService to tell a fortune
		return fortuneService.getFortune();
	}
	
}
