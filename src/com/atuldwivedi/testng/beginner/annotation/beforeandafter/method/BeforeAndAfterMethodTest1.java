package com.atuldwivedi.testng.beginner.annotation.beforeandafter.method;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAndAfterMethodTest1 {

	@BeforeMethod
	public void beforeMethod(){
		System.out.println();
		System.out.println(">> beforeMethod");
	}
	
	@Test
	public void testMethod1(){
		System.out.println(">> testMethod1");
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
	public void afterMethod(){
		System.out.println(">> afterMethod");
	}
}
