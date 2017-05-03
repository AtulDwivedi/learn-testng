package com.atuldwivedi.testng.beginner;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {
	@Test
    public void test()
    {
        SoftAssert asert = new SoftAssert();
        asert.assertEquals(false, true,"failed1");
        asert.assertEquals(false, false,"failed2");
        asert.assertEquals(0, 1,"brokedown");
        asert.assertAll();
    }
}
