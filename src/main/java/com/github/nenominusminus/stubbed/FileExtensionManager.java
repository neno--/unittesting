package com.github.nenominusminus.stubbed;

public class FileExtensionManager implements ExtensionManager {

	@Override
	public boolean isValid(String fileName) {
		return false; // whatever, we are focused on stubs here...
	}
}
