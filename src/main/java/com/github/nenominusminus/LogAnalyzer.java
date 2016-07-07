package com.github.nenominusminus;

public class LogAnalyzer {
	private boolean lastFileNameValid;

	public boolean isValidLogFileName(String filename) {
		lastFileNameValid = false;
		if (filename == null || filename.isEmpty()) {
			throw new RuntimeException("filename has to be provided");
		}

		if (!filename.substring(filename.length() - 4).equalsIgnoreCase(".slf")) {
			return false;
		}
		lastFileNameValid = true;
		return true;
	}

	public boolean isLastFileNameValid() {
		return lastFileNameValid;
	}

	public void setLastFileNameValid(boolean lastFileNameValid) {
		this.lastFileNameValid = lastFileNameValid;
	}

	public static LogAnalyzer makeAnalyzer() {
		return new LogAnalyzer();
	}
}
