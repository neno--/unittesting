package com.github.nenominusminus.stubbed;

public class ExtensionManagerFactory {
	private static ExtensionManager customExtensionManager;

	public static ExtensionManager create() {
		if (customExtensionManager != null) {
			return customExtensionManager;
		}
		return new FileExtensionManager();
	}

	public static void setManager(ExtensionManager manager) {
		customExtensionManager = manager;
	}
}
