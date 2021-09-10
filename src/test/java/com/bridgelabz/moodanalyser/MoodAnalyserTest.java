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
		String mood = moodAnalyser.analyseMood();
		Assert.assertEquals("HAPPY", mood);
	}


}
