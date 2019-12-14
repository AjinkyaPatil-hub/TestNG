package com.ajay.java.TestNG;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnerTestNG implements ITestListener{


	@Override
	public void onStart(ITestContext arg0) {
		System.out.println("Onstart() is called: "+arg0.getName());		
	}

	//2
	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("On TestStart() is called: "+arg0.getName());
		
	}

	@Override
	public void onFinish(ITestContext arg0) {
		System.out.println("On finish() is called: "+arg0.getName());
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		System.out.println("On testFailButWithinSuccessPer() is called: "+arg0.getName());		
	}

	@Override
	public void onTestFailure(ITestResult arg0) {
		System.out.println("On TestFailure() is called: "+arg0.getName());		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
		System.out.println("On TestSkipped() is called: "+arg0.getName());
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
		System.out.println("On TesstSuccess() is called: "+arg0.getName());
		
	}

}
