package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import org.hamcrest.Matcher;
import org.junit.Assert;

import com.mysql.jdbc.Driver;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBodyExtractionOptions;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Utils {

	
	public static RequestSpecification req;
	public RequestSpecification requestSpecification() throws IOException
	{
		
		if(req==null) {
		PrintStream log = new PrintStream(new FileOutputStream("Logging2.txt"));
			
		 req=new RequestSpecBuilder().setBaseUri(getGlobalValue("InstaBaseURL"))
				 .addFilter(RequestLoggingFilter.logRequestTo(log))
				 .addFilter(ResponseLoggingFilter.logResponseTo(log))
		.setContentType(ContentType.JSON).build();
		 return req;
		}
		
		return req;
		
	}
	
	
	public static String getGlobalValue(String key) throws IOException
	{
		Properties prop =new Properties();
		FileInputStream fis =new FileInputStream(Iconstanpath.globalpath);
		prop.load(fis);
		return prop.getProperty(key);
	
		
		
	}
	
	
	public String getJsonPath(Response response,String key)
	{
		  String resp=response.asString();
		JsonPath   js = new JsonPath(resp);
		return js.get(key).toString();
	}
	
  public void mysqlconnector(String query,String Value) throws SQLException {
	 Driver d=new Driver();
	 Connection connection = DriverManager.getConnection(null, null, null);
	 Statement statement = connection.createStatement();
	 ResultSet resultset = statement.executeQuery(query);
	 resultset.next();
	 resultset.getString(Value);
	 statement.close();
	 connection.close();
	  
  }



	
}
	
	
	
	
	
	
	
	
	
	
	
	

