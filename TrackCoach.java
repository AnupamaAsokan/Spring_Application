package com.luv2code.springdemo;

public class TrackCoach implements Coach {

public TrackCoach(){
	
}
	
//define a private field for the dependency
		private FortuneService fortuneService;
		
//define a constructor for dependency injection
		public TrackCoach (FortuneService theFortuneService){
			fortuneService = theFortuneService;
		}	
	
	public String getDailyWorkout() {
		return "Run a hard 5K";
	}

	public String getDailyFortune() {
		return "Just Do It: "+fortuneService.getFortune();
	}
	
//in-it method
	public void doMyStartupStuff() {
		System.out.println("Im inside in-it method");
	}
	
//destroy method
	public void doMydestroyStuff() {
		System.out.println("Im inside destroy method");
	}

}
