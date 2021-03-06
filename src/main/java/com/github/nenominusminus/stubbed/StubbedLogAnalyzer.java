package com.github.nenominusminus.stubbed;

public class StubbedLogAnalyzer {
	private ExtensionManager extensionManager;

	// constructor injection
	public StubbedLogAnalyzer(ExtensionManager extensionManager) {
		this.extensionManager = extensionManager;
	}

	public boolean isValidLogFileName(String filename) {
		return extensionManager.isValid(filename);
	}
}
