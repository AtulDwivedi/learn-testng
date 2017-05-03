package com.atuldwivedi.testng.beginner.helloworld;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRandomNumberGenerator {
	
	RandomNumberGenerator rng = null;
	
	@BeforeClass
	public void deSetup(){
		rng = new RandomNumberGenerator();
	}
	
	@Test
	public void testGenerateFourDigitPin(){
		int randomNumber = rng.generateFourDigitPin();
		System.out.println(randomNumber);
		Assert.assertEquals(4, String.valueOf(randomNumber).length());
	}
	
	@AfterClass
	public void doCleanup(){
		//cleanup stuff goes here
	}
}
