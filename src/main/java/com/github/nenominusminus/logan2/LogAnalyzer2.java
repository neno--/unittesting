package com.github.nenominusminus.logan2;

import com.github.nenominusminus.mocked.WebService;

public class LogAnalyzer2 {
	private Logger logger;
	private WebService webService;
	public int minNameLength = 6;

	public LogAnalyzer2(Logger logger, WebService webService) {
		this.logger = logger;
		this.webService = webService;
	}

	public void analyse(String fileName) {
		if (fileName.length() < minNameLength) {
			try {
				logger.logError("filename is too short", fileName);
			}
			catch (LoggerException le) {
				webService.logError("Error from logger:" + le.getMessage());
			}
		}
	}
}
