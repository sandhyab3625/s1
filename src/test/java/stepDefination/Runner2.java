package stepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\hp\\eclipse-workspace\\cucumber\\Features\\test2.feature", glue = {
		"cucumber" }, plugin = { "pretty", "html:target/report.html" })
public class Runner2 {

}
