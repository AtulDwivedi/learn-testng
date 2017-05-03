package com.atuldwivedi.testng.beginner.group;

import org.testng.annotations.Test;

public class GroupSyntax {

	@Test(groups = {"group1", "type1.checkintest" }, 
			dependsOnGroups = {"group2", "group3"})
	public void testMethodName() {
		//test method logic goes here
	}
}
