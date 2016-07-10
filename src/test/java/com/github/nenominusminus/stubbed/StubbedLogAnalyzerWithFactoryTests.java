package com.github.nenominusminus.stubbed;

import org.junit.Test;

import org.junit.Assert;

public class StubbedLogAnalyzerWithFactoryTests {
	@Test
	public void IsValidLogFileName_NameSupportedExtension_ReturnsTrue() {
		ExtensionManagerFactory.setManager(new FakeExtensionManager(true));
		StubbedLogAnalyzerWithFactory analyzer = new StubbedLogAnalyzerWithFactory();

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