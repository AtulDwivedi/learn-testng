package com.atuldwivedi.testng.beginner.annotation.beforeandafter.method;

import java.lang.reflect.Method;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 * 
 * @author Atul Dwivedi 2016
 */
public class GetExecutingTestMethodName {

	@BeforeMethod
	public void beforeMethod(Method method){
		System.out.println();
		System.out.println(">> beforeMethod running before "+method.getName());
	}

	@Test
	public void testMethod1(){
		System.out.println(">> testMethod1");
		Assert.fail();
	}

	@Test
	public void testMethod2(){
		System.out.println(">> testMethod2");		
	}

	@Test
	public void testMethod3(){
		System.out.println(">> testMethod3");
	}

	@AfterMethod
	public void afterMethod(Method method, ITestResult testResult){
		System.out.println(">> afterMethod running after "+method.getName());
	}
}
