package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
(
features="src/test/java/features",
glue= {"stepDefinations"},
monochrome=true,
plugin = {"pretty",
		
		"html:target/cucumber.html",
		"json:target/cucumber.json",
		
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}

)



public class TestRunner 

{

}
