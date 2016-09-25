package com.test.action;

import com.test.service.TutorialFinderService;

public class TutorialAction {
	private String result;
	private String language;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String execute() {
		TutorialFinderService tutorialFinderService = new TutorialFinderService();
		setResult(tutorialFinderService.getBestTutorialWebsite(getLanguage()));
		System.out.println(result);
		return "success";
	}
}
