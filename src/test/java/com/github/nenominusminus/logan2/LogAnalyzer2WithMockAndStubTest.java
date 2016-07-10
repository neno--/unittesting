package com.github.nenominusminus.logan2;

import com.github.nenominusminus.mocked.FakeWebService;
import com.github.nenominusminus.mocked.LogAnalyzerWithWebService;
import com.github.nenominusminus.mocked.WebService;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Matchers;
import org.mockito.Mockito;

import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class LogAnalyzer2WithMockAndStubTest {
	@Test
	public void Analyze_TooShortFileName_CallsWebService() throws LoggerException {
		// setup stub
		Logger loggerStub = Mockito.mock(Logger.class);
		// http://stackoverflow.com/questions/2276271/how-to-make-mock-to-void-methods-with-mockito
		Mockito.doThrow(new LoggerException("some logger exception")).when(loggerStub).logError(Matchers.anyString(),
				Matchers.anyString());

		// setup mock
		WebService serviceMock = Mockito.mock(WebService.class);

		LogAnalyzer2 logan2 = new LogAnalyzer2(loggerStub, serviceMock);
		logan2.analyse("short");

		verify(serviceMock).logError(Matchers.eq("Error from logger:some logger exception"));
	}
}