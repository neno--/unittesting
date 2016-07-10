package com.github.nenominusminus.mocked;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;

public class LogAnalyzerMockitoTest {
	@Test
	public void Analyze_TooShortFileName_CallsWebService() {
		// create and configure mock
		WebService mockService = Mockito.mock(WebService.class);

		LogAnalyzerWithWebService log = new LogAnalyzerWithWebService(mockService);
		String tooShortFileName = "abc.ext";
		log.analyze(tooShortFileName);

		// check if method testing was called with the correct parameter
		verify(mockService).logError(Matchers.eq("Filename too short:abc.ext"));
	}
}