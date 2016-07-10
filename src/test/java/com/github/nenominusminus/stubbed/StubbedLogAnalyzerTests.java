package com.github.nenominusminus.stubbed;

import org.junit.Test;

import com.github.nenominusminus.LogAnalyzer;

import org.junit.Assert;

public class StubbedLogAnalyzerTests {
	@Test
	public void IsValidLogFileName_NameSupportedExtension_ReturnsTrue() {
		StubbedLogAnalyzer analyzer = new StubbedLogAnalyzer(new FakeExtensionManager(true));

		boolean result = analyzer.isValidLogFileName("short.ext");

		Assert.assertTrue(result);
	}

	class FakeExtensionManager implements ExtensionManager {
		private boolean willBeValid;

		public FakeExtensionManager(boolean willBeValid) {
			this.willBeValid = willBeValid;
		}

		public boolean isValid(String fileName) {
			return willBeValid;
		}
	}
}