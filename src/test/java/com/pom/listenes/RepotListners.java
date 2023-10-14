package com.pom.listenes;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class RepotListners implements ITestListener {

	public void onTestStart(ITestResult result) {
		System.out.println("Testcae :  " + result.getTestName()+ "started ");
		
	}

	public void onTestSuccess(ITestResult result) {
		System.out.println("Testcae :  " + result.getTestName()+ "Successed");
		
	}

	public void onTestFailure(ITestResult result) {
		System.out.println("Testcae :  " + result.getTestName()+ "Failed ");
		
	}

	public void onTestSkipped(ITestResult result) {
		
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	public void onStart(ITestContext context) {
		System.out.println("Test Started  ");
		
	}

	public void onFinish(ITestContext context) {
		System.out.println("Test Finished ");
		
	}
	
	
	

}
