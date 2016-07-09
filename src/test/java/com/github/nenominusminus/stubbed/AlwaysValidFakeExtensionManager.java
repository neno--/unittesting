package com.github.nenominusminus.stubbed;

public class AlwaysValidFakeExtensionManager implements ExtensionManager {
	public boolean isValid(String fileName) {
		return true;
	}
}
