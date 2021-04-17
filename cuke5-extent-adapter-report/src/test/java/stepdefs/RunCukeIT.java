package stepdefs;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		"summary" } /* , tags = "not @dialect" */ , strict = false)
public class RunCukeIT extends AbstractTestNGCucumberTests {

}
