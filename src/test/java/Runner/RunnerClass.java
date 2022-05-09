package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature", glue = { "ruthe" }, monochrome = true,
//tags= "@tag1",
//tags = "@tag2",
//tags = "@tag3",
//tags = "@tag4",
//tags = "@tag5",
//tags = "@tag6",
//tags = "@tag7",
		plugin = { "pretty", "html:target/reports/index.html", "pretty", "json:target/reports/cucumber.json", "pretty",
				"junit:target/reports/cucumber.xml", "pretty", "testng:target/reports/cucumber.xml" })

public class RunnerClass {

}
