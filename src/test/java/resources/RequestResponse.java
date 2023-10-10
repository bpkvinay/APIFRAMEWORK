package resources;

import static io.restassured.RestAssured.given;

import java.io.IOException;

import io.cucumber.java.en.Given;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class RequestResponse extends Utils {
	RequestSpecification res;
	ResponseSpecification resspec;
	Response response;

	public void Requesbody(String string) throws IOException {
		res = given().log().all().spec(requestSpecification()).body(string);
	}

	public void EndPointwithHttpRequest(String EndPoint, String HttpRequest) throws IOException {

		APIResources resourceAPI = APIResources.valueOf(EndPoint);
		resspec = new ResponseSpecBuilder().expectStatusCode(200).expectContentType(ContentType.JSON).build();

		if (HttpRequest.equalsIgnoreCase("POST"))
			response = res.when().post(resourceAPI.getResource());

		else if (HttpRequest.equalsIgnoreCase("GET"))
			response = res.when().get(resourceAPI.getResource());

	}

}
