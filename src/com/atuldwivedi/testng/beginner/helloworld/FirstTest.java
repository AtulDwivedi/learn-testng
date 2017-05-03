package com.atuldwivedi.testng.beginner.helloworld;

import org.testng.annotations.Test;

public class FirstTest {

	@Test
	public void testMethod1(String str, String str1){
		System.out.println(this.getClass().getSimpleName()+" >> testMethod");
	}
}
