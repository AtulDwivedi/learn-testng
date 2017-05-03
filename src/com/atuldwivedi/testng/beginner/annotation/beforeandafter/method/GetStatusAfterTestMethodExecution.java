package com.atuldwivedi.testng.beginner.annotation.beforeandafter.method;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GetStatusAfterTestMethodExecution {

	@BeforeMethod
	public void beforeMethod(Method method){
		Reporter.log(">> beforeMethod running before "+method.getName());
	}

	@Test
	public void testMethod1(){
		Reporter.log(">> testMethod1", true);
		Assert.fail();
	}

	@Test
	public void testMethod2(){
		Reporter.log(">> testMethod2", true);		
	}

	@Test
	public void testMethod3(){
		Reporter.log(">> testMethod3", true);
	}
	
	@AfterMethod
	public void afterMethod(Method method, ITestResult testResult){

		Reporter.log(">> afterMethod startes", true);

		Reporter.log(">> running after test "+method.getName(), true);

		/*
		 * Logs PASSED if isSuccess returns true
		 * Calling isSuccess
		 */
		if(testResult.isSuccess())
			Reporter.log("PASSED", true);
		else
			Reporter.log("NOT PASSED", true);

		/*
		 * Logs total time taken by method to complete the execution in milliseconds
		 * Calling getStartMillis getEndMillis
		 */
		Reporter.log(testResult.getEndMillis() - testResult.getStartMillis()+" Milliseconds", true);

		/*
		 * The status of this result.
		 * Calling getStatus
		 */
		switch(testResult.getStatus()){
		case 1: Reporter.log("Success", true);
		break;
		case 2: Reporter.log("Failure", true);
		break;
		case 3: Reporter.log("Skip", true);
		break;
		case 4: Reporter.log("Success percentage failure", true);
		break;
		case 16: Reporter.log("Started", true);
		break;
		default:Reporter.log("Problem in getting status", true);
		}
		
		Reporter.log(testResult.getMethod().getSuccessPercentage()+"", true);
		Reporter.log(">> afterMethod endes", true);
	}
	
	@AfterMethod
	public void newMethod(){
		Reporter.log(">> >>What are you thinking.", true);
	}
}
