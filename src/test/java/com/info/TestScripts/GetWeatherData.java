package com.info.TestScripts;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;

public class GetWeatherData {

	@Test
	public void testResponsecode() {

		Response res = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

		int statuscode = res.getStatusCode();
		System.out.println("Status cod is" + statuscode);
		Assert.assertEquals(statuscode, 200);

	}

	@Test
	public void TestBody() {
		Response res = RestAssured.get("http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b6907d289e10d714a6e88b30761fae22");

		String data = res.asString();
		System.out.println("Data is" + data);
	}

}
