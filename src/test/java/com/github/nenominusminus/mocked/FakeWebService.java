package com.github.nenominusminus.mocked;

public class FakeWebService implements WebService {
	public String lastError;

	@Override
	public void logError(String message) {
		lastError = message;
	}
}
