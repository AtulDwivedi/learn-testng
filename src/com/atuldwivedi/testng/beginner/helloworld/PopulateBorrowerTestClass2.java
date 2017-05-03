package com.atuldwivedi.testng.beginner.helloworld;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class PopulateBorrowerTestClass2 {
	
	@Parameters({ "primary-borrower-base-name1", "primary-borrower-base-name" })
	@Test
	public static void PopulateBorrower(String PrimaryBorrowerBaseName1, String PrimaryBorrowerBaseName)
	{       
		System.out.println(PrimaryBorrowerBaseName1 + " " + PrimaryBorrowerBaseName);
	   //your all code goes here
	 }
}
