package com.atuldwivedi.dataprovider;

import org.testng.annotations.DataProvider;

public class MyDataProvider {
	@DataProvider(name = "JsonDataProviderForTestModelA")
	public static Object[][] getJsonDataProviderForTestModelA() {

		return new Object[][]{ { new Object() } };
	}

	@DataProvider(name = "JsonDataProviderForTestModelB")
	public static Object[][] getJsonDataProviderForTestModelB() {

		return new Object[][]{ { new Object() } };
	}
}
