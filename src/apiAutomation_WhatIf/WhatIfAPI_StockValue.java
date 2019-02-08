package apiAutomation_WhatIf;

import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.internal.*;
import io.restassured.path.json.JsonPath;

import org.codehaus.groovy.*;
import org.apache.commons.lang.*;
import groovy.json.*;


public class WhatIfAPI_StockValue {
	
	@Test
	public void T01_CalculateStockPurchaseValueOfAGvivenStock_AAPL()
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://stock-whatif.herokuapp.com/whatif"; 

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.get("/AAPL");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);

	}
	
	@Test
	public void T01_CalculateStockPurchaseValueOfAGvivenStock_FB()
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://stock-whatif.herokuapp.com/whatif"; 

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.get("/FB");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);

	}
	
	@Test
	public void T01_CalculateStockPurchaseValueOfAGvivenStock_HD()
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://stock-whatif.herokuapp.com/whatif"; 

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.get("/HD");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);

	}
	
	@Test
	public void T01_CalculateStockPurchaseValueOfAGvivenStock_MSFT()
	{   
		// Specify the base URL to the RESTful web service
		RestAssured.baseURI = "https://stock-whatif.herokuapp.com/whatif"; 

		RequestSpecification httpRequest = RestAssured.given();

		Response response = httpRequest.get("/MSFT");

		String responseBody = response.getBody().asString();
		System.out.println("Response Body is =>  " + responseBody);

	}
	

	
	
	
	


}