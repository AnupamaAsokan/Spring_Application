package com.luv2code.springdemo;

public class FootballCoach implements Coach{

//define a private field for injection
private FortuneService fortuneService;

/**
 * @param fortuneService
 */
public FootballCoach(FortuneService thefortuneService) {
	super();
	this.fortuneService = thefortuneService;
}
	
//added methods from the interface	
	public String getDailyWorkout() {
		return "Run as much as you can";
	}

	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
// define init-method
		public void startingMethod(){
			System.out.println("Im inside init-method");
		}
		
// define destroy-method	
		public void destroyingMethod(){
			System.out.println("Im inside destroy-method");
		}

}
