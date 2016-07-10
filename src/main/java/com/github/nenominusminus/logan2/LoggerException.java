package com.github.nenominusminus.logan2;

public class LoggerException extends Exception {
	private String message;

	public LoggerException(String message) {
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
