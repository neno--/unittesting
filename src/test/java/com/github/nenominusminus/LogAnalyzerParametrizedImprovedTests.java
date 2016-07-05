package com.github.nenominusminus;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LogAnalyzerParametrizedImprovedTests {
	@Parameterized.Parameters
	public static Collection<Object[]> dataWithExpectations() {
		return Arrays.asList(new Object[][] { { "filewithgoodextension.slf", true },
				{ "filewithgoodextension.SLF", true }, { "filewithbadextension.foo", false } });
	}

	private String file;
	private boolean expected;

	public LogAnalyzerParametrizedImprovedTests(String file, boolean expected) {
		this.file = file;
		this.expected = expected;
	}

	@Test
	public void IsValidLogFileName_ValidExtensions_ChecksThem() {
		LogAnalyzer analyzer = new LogAnalyzer();

		boolean result = analyzer.isValidLogFileName(file);

		Assert.assertEquals(expected, result);
	}
}