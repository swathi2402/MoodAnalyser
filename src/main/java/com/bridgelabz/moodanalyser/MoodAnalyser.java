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

	public String analyseMood() throws MoodAnalysisException {

		try {
			if (message.length() == 0)
				throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY,
						"Message can not be empty");
			if (message.contains("sad"))
				return "SAD";
			else
				return "HAPPY";

		} catch (NullPointerException e) {
			throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL,
					"Message can not be null");
		}
	}
}
