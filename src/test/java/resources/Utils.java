package resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;



import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Utils {

	public static RequestSpecification req;
	public RequestSpecification requestSpecification() throws IOException
	{
		if(req==null) {
		PrintStream logs = new PrintStream(new FileOutputStream("Logging2.txt"));
		

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
	
	public static void storeconsoleoutput(String output) {
        try {
            
            FileOutputStream fileOut = new FileOutputStream("output.txt");
            PrintStream printStream = new PrintStream(fileOut);
            System.setOut(printStream);
            System.out.println(output);
            printStream.close();
            fileOut.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
