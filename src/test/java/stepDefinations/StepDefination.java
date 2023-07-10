package stepDefinations;

import static io.restassured.RestAssured.given;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



import static org.junit.Assert.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import resources.APIResources;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefination extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;
	TestDataBuild data =new TestDataBuild();

	

	@Given("AddLeadAPI Payload with {string}")
	public void add_lead_api_payload_with(String string) throws IOException { 
		//RestAssured.baseURI="https://uat.advancesuite.in:3071";
		 res=given().log().all().spec(requestSpecification())
		.body(TestDataBuild.addlead(string));
	}

	@When("user calls endpoint {string} with {string} http request")
	public void user_calls_endpoint_with_http_request(String string, String string2) {
	    
		APIResources resourceAPI=APIResources.valueOf(string);
		System.out.println(resourceAPI.getResource());
		
		
		resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		if(string2.equalsIgnoreCase("POST"))
		 response=res.when().post(resourceAPI.getResource());
		else if(string2.equalsIgnoreCase("GET"))
			 response =res.when().get(resourceAPI.getResource());
		
}

	@Then("the API call got success with status code {int}")
	public void the_API_call_got_success_with_status_code(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		 System.out.println(response.getStatusCode());
		assertEquals(response.getStatusCode(),200);
		String gh = response.getBody().asString();
		
		
	    
		
	
	}
	@Then("the call Payload with {string} {string}")
	public void the_call_payload_with(String string, String string2) throws IOException {
		res=given().log().all().spec(requestSpecification())
				.body(TestDataBuild.addotpwithmobile(string, string2));
	}

	@Then("calls endpoint {string} with {string} http request")
	public void calls_endpoint_with_http_request(String string, String string2) {
		APIResources resourceAPI=APIResources.valueOf(string);
		System.out.println(resourceAPI.getResource());
		
		
		resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		if(string2.equalsIgnoreCase("POST"))
		 response=res.when().post(resourceAPI.getResource());
		else if(string2.equalsIgnoreCase("GET"))
			 response =res.when().get(resourceAPI.getResource()); 
	}

	@Then("verifyOTP call got success with status code {int}")
	public void verify_otp_call_got_success_with_status_code(Integer int1) {
		System.out.println(response.getStatusCode());
		assertEquals(response.getStatusCode(),200);
	
	}
	
	@Given("EligibilitychecksAPI Payload with {string} {string} {string}")
	public void eligibilitychecks_api_payload_with(String string, String string2, String string3) throws IOException {
		res=given().log().all().spec(requestSpecification())
				.body(TestDataBuild.payloadlocationeligibiltychecks(string,string2,string3));
	}

	@When("calls Endpoint {string} with {string} http Requests")
	public void calls_endpoint_with_http_requests(String string, String string2) {
		APIResources resourceAPI=APIResources.valueOf(string);
		System.out.println(resourceAPI.getResource());
		
		
		resspec =new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		
		if(string2.equalsIgnoreCase("POST"))
		 response=res.when().post(resourceAPI.getResource());
		else if(string2.equalsIgnoreCase("GET"))
			 response =res.when().get(resourceAPI.getResource()); 
	}
	

}
