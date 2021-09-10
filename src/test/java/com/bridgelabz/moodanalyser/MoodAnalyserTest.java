package com.bridgelabz.moodanalyser;

import org.junit.Test;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class MoodAnalyserTest {
	
	@Test
	public void  givenMessage_WhenSad_ShouldReturnSad() throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");

		String mood = moodAnalyser.analyseMood();
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}

	@Test
	public void givenMessage_WhenNotSad_ShouldReturnHappy() throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");

		String mood = moodAnalyser.analyseMood();
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}
	
	@Test
	public void givenMessage_WhenNull_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser(null);
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
			System.out.println(e.getMessage());
		}
	}
	
	@Test
	public void givenMessage_WhenEmpty_ShouldReturnHappy() {
		MoodAnalyser moodAnalyser = new MoodAnalyser("");
		try {
			moodAnalyser.analyseMood();
		} catch (MoodAnalysisException e) {
			Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, e.type);
			System.out.println(e.getMessage());
		}
	}


}
