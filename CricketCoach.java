package com.luv2code.springdemo;

public class CricketCoach implements Coach{
	
private FortuneService fortuneService;
private String emailAddress;
private String team;

public CricketCoach(){
System.out.println("Im in constructor");
}

public String getEmailAddress() {
	return emailAddress;
}

public String getTeam() {
	return team;
}

public void setEmailAddress(String emailAddress) {
	System.out.println("Im inside emailAddress");
	this.emailAddress = emailAddress;
}

public void setTeam(String team) {
	System.out.println("Im inside team");
	this.team = team;
}


public void setFortuneService(FortuneService fortuneService) {
	System.out.println("Im inside setter");
	this.fortuneService = fortuneService;
}


public String getDailyWorkout() {
	return "Practise fast bowling fro 15 minutes";
}

public String getDailyFortune() {
	return fortuneService.getFortune();
}	


}
