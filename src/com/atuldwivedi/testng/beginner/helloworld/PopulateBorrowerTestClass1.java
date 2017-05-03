package com.atuldwivedi.testng.beginner.helloworld;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PopulateBorrowerTestClass1 {
	
	//This method will provide data to any test method that declares that its Data Provider
	//is named "test1"
	@DataProvider(name = "test1")
	public Object[][] createData1() {
	 return new Object[][] {
	   { "PrimaryBorrowerBaseName1Value", "PrimaryBorrowerBaseNameValue" }
	 };
	}

	//This test method declares that its data should be supplied by the Data Provider
	//named "test1"
	@Test(dataProvider = "test1")
	public static void PopulateBorrower(String PrimaryBorrowerBaseName1, String PrimaryBorrowerBaseName)
	{       
		System.out.println(PrimaryBorrowerBaseName1 + " " + PrimaryBorrowerBaseName);
	   //your all code goes here
	 }
}
