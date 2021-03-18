package testrunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features={"src/test/resources/featurefiles/PedaSysTest.feature","src/test/resources/featurefiles/PedaSysTest01.feature"},plugin = {"pretty", "summary"},
		glue = {"stepdefinition"})
public class TestRunner {

}