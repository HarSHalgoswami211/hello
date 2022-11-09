package Utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class REPORTS {

	public static ExtentReports createEvtentReports() {
		
		ExtentReports report =new ExtentReports();
		ExtentSparkReporter sparkreporter = new ExtentSparkReporter("extentReport.html");
		report.attachReporter(sparkreporter);
		report.setSystemInfo("CreatedBy", "Harshal");
		report.setSystemInfo("testName", "Regression Testing");
	
		
      return report;
	}
}
