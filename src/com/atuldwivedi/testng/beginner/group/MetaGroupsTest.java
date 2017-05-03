package com.atuldwivedi.testng.beginner.group;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MetaGroupsTest {

	@BeforeMethod
	public void beforeMethod(){
		//before method stuffs - setup
	}

	@Test(groups = { "liux.jboss.oracle", "acceptance" })
	public void testEndToEndOnWindows() {
		//your test logic goes here
	}

	@Test(groups = {"aix.was.db2", "regression"} )
	public void testEndToEndOnLinux() {
		//your test logic goes here
	}

	@Test(groups = "acceptance")
	public void testAcceptance() {
		//your test logic goes here
	}

	@Test(groups = "regression")
	public void testRegression(){
		//your test logic goes here
	}

	@AfterMethod
	public void afterMthod(){
		//after method stuffs - cleanup
	}
}
