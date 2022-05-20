package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\hp\\eclipse-workspace\\cucumber\\Features\\tags.feature", glue = {
		"cucumber" }, tags = "@Smoketest", plugin = { "pretty", "html:target/report.html" })

public class Runnertags {

}
