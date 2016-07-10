package com.github.nenominusminus.logan2;

public interface Logger {
	public void logError(String description, String fileName) throws LoggerException;
}
