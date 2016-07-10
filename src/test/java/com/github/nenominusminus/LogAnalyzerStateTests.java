package com.github.nenominusminus;

import org.junit.Test;

import org.junit.Assert;

public class LogAnalyzerStateTests {
	@Test
	public void isValidFileName_WhenCalled_ChangesWasLastFileNameValid() {
		LogAnalyzer la = LogAnalyzer.makeAnalyzer();

		la.isValidLogFileName("badname.foo");

		Assert.assertFalse(la.isLastFileNameValid());
	}
}