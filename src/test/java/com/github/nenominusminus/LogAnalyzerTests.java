package com.github.nenominusminus;

import org.junit.Test;
import org.junit.experimental.categories.Categories;

import junit.framework.Assert;

public class LogAnalyzerTests {
	@Test
	@Categories.IncludeCategory(FileExtensionTests.class)
	public void IsValidLogFileName_BadExtension_ReturnsFalse() {
		LogAnalyzer analyzer = new LogAnalyzer();

		boolean result = analyzer.isValidLogFileName("filewithbadextension.foo");

		Assert.assertFalse(result);
	}

	@Test
	@Categories.IncludeCategory(FileExtensionTests.class)
	public void IsValidLogFileName_GoodExtensionLowercase_ReturnsTrue() {
		LogAnalyzer analyzer = new LogAnalyzer();

		boolean result = analyzer.isValidLogFileName("filewithgoodextension.slf");

		Assert.assertTrue(result);
	}

	@Test
	@Categories.IncludeCategory(FileExtensionTests.class)
	public void IsValidLogFileName_GoodExtensionUppercase_ReturnsTrue() {
		LogAnalyzer analyzer = new LogAnalyzer();

		boolean result = analyzer.isValidLogFileName("filewithgoodextension.SLF");

		Assert.assertTrue(result);
	}
}