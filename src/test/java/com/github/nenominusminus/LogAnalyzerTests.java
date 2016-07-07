package com.github.nenominusminus;

import com.sun.javaws.exceptions.InvalidArgumentException;
import junit.framework.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Categories;

public class LogAnalyzerTests {
	@Test
	@Categories.IncludeCategory(FileExtensionTests.class)
	public void IsValidLogFileName_BadExtension_ReturnsFalse() throws InvalidArgumentException {
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