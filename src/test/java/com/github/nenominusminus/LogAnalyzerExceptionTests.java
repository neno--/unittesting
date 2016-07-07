package com.github.nenominusminus;

import org.hamcrest.core.StringContains;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class LogAnalyzerExceptionTests {
	private LogAnalyzer analyzer;

	@Rule
	public ExpectedException exception = ExpectedException.none();

	@Test
	public void IsValidFileName_EmptyFileName_ThrowsException() {
		analyzer = LogAnalyzer.makeAnalyzer();

		exception.expect(RuntimeException.class);
		exception.expectMessage(new StringContains("filename has to be provided"));
		analyzer.isValidLogFileName(null);
	}

	@Test
	@Ignore("blanks should be checked in production code with more robust mechanism")
	public void IsValidFileName_BlanksForFileName_ThrowsException() {
		analyzer = LogAnalyzer.makeAnalyzer();

		exception.expect(RuntimeException.class);
		exception.expectMessage(new StringContains("   "));
		analyzer.isValidLogFileName(null);
	}
}
