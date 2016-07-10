package com.github.nenominusminus.mocked;

import org.hamcrest.CoreMatchers;
import org.junit.Test;
import org.junit.experimental.categories.Categories;

import com.github.nenominusminus.FileExtensionTests;
import com.github.nenominusminus.LogAnalyzer;

import org.junit.Assert;

public class LogAnalyzerMockTest {
	@Test
	public void Analyze_TooShortFileName_CallsWebService() {
		FakeWebService mockService = new FakeWebService();
		LogAnalyzerWithWebService log = new LogAnalyzerWithWebService(mockService);
		String tooShortFileName = "abc.ext";
		log.analyze(tooShortFileName);
		Assert.assertThat(mockService.lastError, CoreMatchers.containsString("Filename too short:abc.ext"));
	}
}