package com.bridgelabz.moodanalyser;

import org.junit.Test;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;

public class MoodAnalyserTest {
	
	@Test
	public void analyseMood_SadMessage_SAD() throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser();

		String mood = moodAnalyser.analyseMood("This is a sad message");
		Assert.assertThat(mood, CoreMatchers.is("SAD"));
	}

	@Test
	public void analyseMood_SadMessage_HAPPY() throws Exception {
		MoodAnalyser moodAnalyser = new MoodAnalyser();

		String mood = moodAnalyser.analyseMood("This is a happy message");
		Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
	}


}
