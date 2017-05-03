package com.atuldwivedi.testngbasics.groups;

import org.testng.annotations.Test;

public class EmployeeTest {

	@Test(groups={"dependent1"})
	public void testEmployeeValidity(){
		System.out.println("dependent1: "+this.getClass().getSimpleName());
	}
}
