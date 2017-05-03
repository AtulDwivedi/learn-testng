package com.atuldwivedi.testng.beginner.group;

import java.lang.reflect.Method;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Five {
	private int counter = 0;
	@Test(groups = {"group1", "group2"})
	public void testOne() {
		System.out.println("Counter value in group1:" + counter);
	}

	@Test(groups = {"group2"})
	public void testTwo() {
		counter++;
		System.out.println("Counter value in group2 :" + counter);
	}

	@BeforeMethod
	public void befMet(Method method){
		Test testClass = method.getAnnotation(Test.class);

		for (int i = 0; i < testClass.groups().length; i++) {
			System.out.println(testClass.groups()[i]);
		}
		System.out.println(testClass.groups()[0]);
	}
}
