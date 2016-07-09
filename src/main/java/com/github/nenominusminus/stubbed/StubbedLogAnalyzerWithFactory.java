package com.github.nenominusminus.stubbed;

public class StubbedLogAnalyzerWithFactory {
	private ExtensionManager extensionManager;

	//dependencies are handled by a factory
	public StubbedLogAnalyzerWithFactory() {
		this.extensionManager = ExtensionManagerFactory.create();
	}

	public boolean isValidLogFileName(String filename) {
		return extensionManager.isValid(filename);
	}
}
