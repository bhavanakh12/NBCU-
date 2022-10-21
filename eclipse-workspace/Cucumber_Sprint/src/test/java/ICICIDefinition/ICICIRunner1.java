package ICICIDefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "", features = "src/test/resources/Sprint_Features/ICICI1.feature", glue = "ICICIDefinition",plugin = { "pretty", "html:target/cucumber-reportss.html" },
monochrome = true)

public class ICICIRunner1 extends AbstractTestNGCucumberTests{

}
	