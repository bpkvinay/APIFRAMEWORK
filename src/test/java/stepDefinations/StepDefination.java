package stepDefinations;

import static io.restassured.RestAssured.given;

import java.io.Console;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.Assert;

import com.itextpdf.text.log.SysoCounter;

import static org.junit.Assert.*;
import static org.testng.Assert.assertEquals;

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
import resources.RequestResponse;
import resources.TestDataBuild;
import resources.Utils;

public class StepDefination extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;

	TestDataBuild data = new TestDataBuild();
	//Utils utils = new Utils();

	@Given("AddLeadAPI Payload with {string}")
	public void add_lead_api_payload_with(String string) throws IOException {
		res = given().log().all().spec(requestSpecification()).body(TestDataBuild.addlead(string));
	}

	@When("user calls endpoint {string} with {string} http request")
	public void user_calls_endpoint_with_http_request(String string, String string2) throws IOException {

		APIResources resourceAPI = APIResources.valueOf(string);
		System.out.println(resourceAPI.getResource());
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		if (string2.equalsIgnoreCase("POST"))
			response = res.when().post(resourceAPI.getResource());
		else if (string2.equalsIgnoreCase("GET"))
			response = res.when().get(resourceAPI.getResource());

	}

	@Then("the API call got success with status code {int}")
	public void the_API_call_got_success_with_status_code(Integer int1) {
		System.out.println(response.getStatusCode());
		assertEquals(response.getStatusCode(), 200);
		String re = response.getBody().asString();
		System.out.println(re);
	}

	@Then("{string} in response body is {string}")
	public void in_response_body_is(String key, String value) {
		String resp = response.asString();
		JsonPath js = new JsonPath(resp);
		assertEquals(js.get(key).toString(), value);
		System.out.println(js.get(key).toString());
	}

	@Then("the call Payload with {string} {string}")
	public void the_call_payload_with(String string, String string2) throws IOException {
		res = given().log().all().spec(requestSpecification()).body(TestDataBuild.addotpwithmobile(string, string2));
	}

	@Then("calls endpoint {string} with {string} http request")
	public void calls_endpoint_with_http_request(String string, String string2) throws IOException {

		APIResources resourceAPI = APIResources.valueOf(string);
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		if (string2.equalsIgnoreCase("POST"))
			response = res.when().post(resourceAPI.getResource());
		else if (string2.equalsIgnoreCase("GET"))
			response = res.when().get(resourceAPI.getResource());
	}

	@Given("EligibilitychecksAPI Payload with {string} {string} {string} {string}")
	public void eligibilitychecks_api_payload_with(String string, String string2, String string3, String string4)
			throws IOException {
		res = given().log().all().spec(requestSpecification())
				.body(TestDataBuild.payloadlocationeligibiltychecks(string, string2, string3, string4));
	}
	
	@When("calls Endpoint {string} with {string} http Requests")
	public void calls_endpoint_with_http_requests(String string, String string2) throws IOException {

		APIResources resourceAPI = APIResources.valueOf(string);
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		if (string2.equalsIgnoreCase("POST"))
			response = res.when().post(resourceAPI.getResource());
		else if (string2.equalsIgnoreCase("GET"))
			response = res.when().get(resourceAPI.getResource());
	}
	
	@Given("Add Business Information payload with {string} {string} {string} {string} {string}")
	public void add_business_information_payload_with(String string, String string2, String string3, String string4,
			String string5) throws IOException {
		res = given().log().all().spec(requestSpecification())
				.body(TestDataBuild.Businessinformationpayload(string, string2, string3, string4, string5));
	}

	@Given("call end point {string} and {string} the request")
	public void call_end_point_and_the_request(String string, String string2) {

		APIResources resourceAPI = APIResources.valueOf(string);
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();
		if (string2.equalsIgnoreCase("POST"))
			response = res.when().post(resourceAPI.getResource());
		else if (string2.equalsIgnoreCase("GET"))
			response = res.when().get(resourceAPI.getResource());
	}

	

	@Given("Add Business Nature Payload with values of {string}  {string} {string}")
	public void add_business_nature_payload_with_values_of(String string, String string2, String string3)
			throws IOException {
		res = given().log().all().spec(requestSpecification())
				.body(TestDataBuild.AddBusinessNature(string, string2, string3));

	}

	@Given("Add Business PAN payload with values of {string}  {string} {string} {int}")
	public void add_business_pan_payload_with_values_of(String Leadid, String PAN, String action, Integer masterid)
			throws IOException {
		res = given().log().all().spec(requestSpecification())
				.body(TestDataBuild.AddBusinessPAN(Leadid, PAN, action, masterid));

	}

	@Given("Add Business Documents payload with values of {string}  {string} {string}")
	public void add_business_documents_payload_with_values_of(String string, String string2, String string3)
			throws IOException {
		res = given().log().all().spec(requestSpecification())
				.body(TestDataBuild.AddBusinessDocument(string, string2, string3));

	}

	@Given("Add Business loan purpose payload value of {string}  {string} {string}")
	public void add_business_loan_purpose_payload_value_of(String string, String string2, String string3)
			throws IOException {
		res = given().log().all().spec(requestSpecification())
				.body(TestDataBuild.Addloanpurpose(string, string2, string3));

	}



	

}
