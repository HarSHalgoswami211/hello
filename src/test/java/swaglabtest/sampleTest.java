package swaglabtest;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Utility.REPORTS;

@Listeners(Utility.listeners.class)

public class sampleTest {
	ExtentReports report;
	ExtentTest test;
	
	@BeforeTest
	public void  configureReport() {
	
		report =REPORTS.createEvtentReports();
		//report =new ExtentReports();

	}
	
	@Test
	public void test1() {
		test = report.createTest("test1");
		System.out.println("test1 is passed");
	}
	
	@Test 
	public void test2() {
		test =report.createTest("test2");
		System.out.println("test2 Passed");
	}

	@Test(timeOut = 1000)
	public void test3() throws InterruptedException {
		Thread.sleep(2000);
		test = report.createTest("test3");
		System.out.println("test 3 is passed");
	}
	
	@Test(dependsOnMethods = {"test3"})
	public void test4() {
		test = report.createTest("test4");
		System.out.println("test4 passed");
	}
	
	@Test(enabled = false)
	public void test5() {
		test = report.createTest("test5");
		System.out.println("this is test5");
	}
	
	@AfterMethod
	public void publishResult(ITestResult result) {
		
		if(result.getStatus()==ITestResult.SUCCESS) 
		{
			test.log(Status.PASS, result.getName());
		}
		
		
		else if (result.getStatus()== ITestResult.FAILURE)
		{
			test.log(Status.FAIL, result.getName());
		}
		
		else
		{
			test.log(Status.SKIP, result.getName());
		}
		
	}

	@AfterTest
	public void createReport() {
		report.flush();
	}


}



