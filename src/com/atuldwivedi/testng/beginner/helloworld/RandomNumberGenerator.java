package com.atuldwivedi.testng.beginner.helloworld;

public class RandomNumberGenerator {
	
	public int generateFourDigitPin(){
		return (int)(Math.random() * 10000);
	}
}
