package cucumber.Options;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions
(
features="src/test/java/features",
glue= {"stepDefinations"},
//tags="@Addlead",
monochrome=true,
plugin= {"pretty",
		"html:target/cucumber.html",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"json:target/jsonReports/apijosnreport.json"
		})




public class TestRunner 

{

}
