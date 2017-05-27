package com.luv2code.springdemo;

import java.util.Random;

public class FortuneServiceImpl implements FortuneService{

// declaring array variables
	private String[] arrayOfFortunes = {"Today is your goodluck", 
			"You are going to be so lucky today", 
			"Good news is going to come your way"};
// creating a random variable	
	private Random randomFortune = new Random();

// getFortune Method implementation	
	public String getFortune() {
		int index= randomFortune.nextInt(arrayOfFortunes.length);
		String todaysFortune = arrayOfFortunes[index];
		return todaysFortune;
	}	
	
}
