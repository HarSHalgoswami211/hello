package Utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class listeners extends BaseClass implements ITestListener {
	
	public void onTestStart(ITestResult result) {
		System.out.println("test started "+ result.getName());		
	}
	
	public void onTestSuccess(ITestResult result)
	{
	System.out.println("test get successfull");	
	}
	
	public void onTestFailure(ITestResult result) {
		try
		{
			screenshot.clickScreenshot(driver, result.getName());
	}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	public void onTestSkipped(ITestResult result) {
		System.out.println("test is skipped");
	}

}
