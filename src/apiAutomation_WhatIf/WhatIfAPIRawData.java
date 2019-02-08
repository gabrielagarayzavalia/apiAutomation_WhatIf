package apiAutomation_WhatIf;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WhatIfAPIRawData {

	
	@Test
	public void T02_RetrievesRawDataOfAGvivenStock_AAPL()
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://stock-whatif.herokuapp.com/whatif"; 

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.get("/AAPL/raw");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);

	}
	
	
	@Test
	public void T02_RetrievesRawDataOfAGvivenStock_FB()
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://stock-whatif.herokuapp.com/whatif"; 

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.get("/FB/raw");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);

	}
	
	
	@Test
	public void T02_RetrievesRawDataOfAGvivenStockOfAGvivenStock_HD()
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://stock-whatif.herokuapp.com/whatif"; 

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.get("/HD/raw");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);

	}
	
	@Test
	public void T02_RetrievesRawDataOfAGvivenStockOfAGvivenStock_MSFT()
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://stock-whatif.herokuapp.com/whatif"; 

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.get("/MSFT/raw");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);

	}
	
	
	
}
