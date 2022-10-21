package SprintDefinition;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
 
@CucumberOptions(tags = "", features = "src/test/resources/Sprint_Features/sprint.feature", glue = "SprintDefinition",plugin = { "pretty", "html:target/cucumber-reportss.html" },
monochrome = true)

public class SprintRunner extends AbstractTestNGCucumberTests{

 

}
