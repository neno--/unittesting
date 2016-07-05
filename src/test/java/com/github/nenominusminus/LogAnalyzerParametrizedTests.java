package com.github.nenominusminus;

import junit.framework.Assert;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class LogAnalyzerParametrizedTests {
	@Parameterized.Parameters
	public static Collection<Object> data() {
		return Arrays.asList(new Object[] { "filewithgoodextension.slf", "filewithgoodextension.SLF" });
	}

	private String file;

	public LogAnalyzerParametrizedTests(String file) {
		this.file = file;
	}

	@Test
	public void IsValidLogFileName_ValidExtensions_ReturnsTrue() {
		LogAnalyzer analyzer = new LogAnalyzer();

		boolean result = analyzer.isValidLogFileName(file);

		Assert.assertTrue(result);
	}
}