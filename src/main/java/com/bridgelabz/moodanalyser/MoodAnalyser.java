package com.bridgelabz.moodanalyser;

public class MoodAnalyser {
	private String message;

	public MoodAnalyser(String message) {
		super();
		this.message = message;
	}

	public MoodAnalyser() {
		this.message = "";
	}

	public String analyseMood() {

		try {
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";
			
		} catch (NullPointerException e) {		
			return "HAPPY";
		}
	}
}
