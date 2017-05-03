package com.atuldwivedi.testng.beginner.group;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupTest {
	
	@BeforeClass
	public void deSetup(){
		//do configuration stuff here
	}
	
	@Test(groups = { "functest", "regtest" })
	public void testMethod1() {
	}

	@Test(groups = {"functest", "regtest"} )
	public void testMethod2() {
	}

	@Test(groups = { "functest" })
	public void testMethod3() {
	}
	
	@AfterClass
	public void cleanUp(){
		//do resource release and cleanup stuff here
	}
}
