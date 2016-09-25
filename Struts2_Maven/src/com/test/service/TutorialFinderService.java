package com.test.service;

public class TutorialFinderService {
	
	public String getBestTutorialWebsite(String language){
		if(language.equals("java")){
		return "Java Brains";
		}
		else {
			return "language not supported";
		}
		
	}

}
