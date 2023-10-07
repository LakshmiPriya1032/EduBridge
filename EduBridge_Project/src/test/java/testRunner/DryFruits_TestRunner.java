package testRunner;

import org.junit.runner.RunWith;
/*import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;*/
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = {"src/main/java/feature/dryFruits.feature"},
	publish = true,
	glue = {"DryFruits_SetDefinition"}
	
	)

public class DryFruits_TestRunner {

}
