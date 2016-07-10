package com.github.nenominusminus.mocked;

public class LogAnalyzerWithWebService {
	private WebService webService;

	public LogAnalyzerWithWebService(WebService webService) {
		this.webService = webService;
	}

	public void analyze(String fileName) {
		if (fileName.length() < 8) {
			webService.logError("Filename too short:" + fileName);
		}
	}
}
