package com.github.nenominusminus;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class LogAnalyzer {
	public boolean isValidLogFileName(String filename) {
		if (filename == null || filename.isEmpty()) {
			throw new RuntimeException("filename has to be provided");
		}

		if (!filename.substring(filename.length() - 4).equalsIgnoreCase(".slf")) {
			return false;
		}
		return true;
	}

	public static LogAnalyzer makeAnalyzer() {
		return new LogAnalyzer();
	}
}
