package com.github.nenominusminus;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class LogAnalyzer {
	public boolean isValidLogFileName(String filename) {
		if (!filename.substring(filename.length() - 4).equalsIgnoreCase(".slf")) {
			return false;
		}
		return true;
	}
}
