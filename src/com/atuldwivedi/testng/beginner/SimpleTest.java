package com.atuldwivedi.testng.beginner;

import org.testng.annotations.*;

public class SimpleTest {

	@BeforeClass
	public void setUp1() {
		// code that will be invoked when this test is instantiated
		System.out.println("Before class");
	}

	@AfterClass
	public void setUp2() {
		System.out.println("After class");
	}


	@Test(groups = { "fast" })
	public void aFastTest() {
		System.out.println("Fast test");
	}

	@Test(groups = { "slow" })
	public void aSlowTest() {
		System.out.println("Slow test");
	}

}
