package com.bridgelabz.moodanalyser;

import org.junit.Test;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class MoodAnalyserTest {
	
	@Test
	public void analyseMood_SadMessage_SAD() throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");

		String mood = moodAnalyser.analyseMood();
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}

	@Test
	public void analyseMood_SadMessage_HAPPY() throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser("This is a happy message");

		String mood = moodAnalyser.analyseMood();
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}


}
