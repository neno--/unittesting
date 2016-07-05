package com.github.nenominusminus;

import junit.framework.Assert;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static java.lang.System.out;

public class LogAnalyzerSetupTeardownTests {
	LogAnalyzer analyzer;

	@BeforeClass
	public static void preset() {
		out.println("preset");
	}

	@Before
	public void setup() {
		analyzer = new LogAnalyzer();
		out.println("setup");
	}

	@After
	public void teardown() {
		analyzer = null;
		out.println("teardown");
	}

	@AfterClass
	public static void finalTeardown() {
		out.println("finalTeardown");
	}

	public LogAnalyzerSetupTeardownTests() {
		out.println("constructor");
	}

	@Test
	public void IsValidLogFileName_BadExtension_ReturnsFalse() {

		boolean result = analyzer.isValidLogFileName("filewithbadextension.foo");

		Assert.assertFalse(result);
	}

	@Test
	public void IsValidLogFileName_GoodExtensionLowercase_ReturnsTrue() {
		LogAnalyzer analyzer = new LogAnalyzer();

		boolean result = analyzer.isValidLogFileName("filewithgoodextension.slf");

		Assert.assertTrue(result);
	}

	@Test
	public void IsValidLogFileName_GoodExtensionUppercase_ReturnsTrue() {
		LogAnalyzer analyzer = new LogAnalyzer();

		boolean result = analyzer.isValidLogFileName("filewithgoodextension.SLF");

		Assert.assertTrue(result);
	}
}
