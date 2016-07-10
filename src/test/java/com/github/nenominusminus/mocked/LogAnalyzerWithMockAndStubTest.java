package com.github.nenominusminus.mocked;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class LogAnalyzerWithMockAndStubTest {
	@Test
	public void Analyze_TooShortFileName_CallsWebService() {
		FakeWebService mockService = new FakeWebService();
		LogAnalyzerWithWebService log = new LogAnalyzerWithWebService(mockService);
		String tooShortFileName = "abc.ext";
		log.analyze(tooShortFileName);
		Assert.assertThat(mockService.lastError, CoreMatchers.containsString("Filename too short:abc.ext"));
	}
}