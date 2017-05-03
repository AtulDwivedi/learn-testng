package com.atuldwivedi.testng.beginner;

import org.testng.annotations.Test;

public class AssertionExtnTest {

	   @Test
	    public void test()
	    {
	        AssertionExtn asert=new AssertionExtn();
	        asert.assertEquals(false, true,"failed");
	        asert.assertEquals(false, false,"passed");
	        asert.assertEquals(0, 1,"brokedown");
	        asert.assertAll();
	    }
	}
	
