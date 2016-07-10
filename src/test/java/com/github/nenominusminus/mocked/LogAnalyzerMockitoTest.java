package com.github.nenominusminus.mocked;

import org.hamcrest.CoreMatchers;
import org.hamcrest.core.StringContains;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.mockito.Matchers;
import org.mockito.Mockito;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LogAnalyzerMockitoTest {
	@Rule
	public ExpectedException exception = ExpectedException.none();

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

	@Test
	public void FileNameValidation_PlayWithMocks_AlwaysReturnTheSame() {
		// mock implementation always returns the same value (true)
		FileNameRules mockRules = Mockito.mock(FileNameRules.class);
		when(mockRules.isValidFileName(Matchers.anyString())).thenReturn(true);

		Assert.assertTrue(mockRules.isValidFileName("whateva"));
	}

	@Test
	public void FileNameValidation_PlayWithMocks_ThrowException() {
		// method throws exception on use
		FileNameRules mockRules = Mockito.mock(FileNameRules.class);
		when(mockRules.isValidFileName(Matchers.anyString())).thenThrow(new RuntimeException("some exception"));

		exception.expect(RuntimeException.class);
		exception.expectMessage(new StringContains("some exception"));
		mockRules.isValidFileName("whateva");
	}
}