package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/feature/CucumberExexution.feature", glue="steps", monochrome=true, publish=true)

public class RunnerClass1 extends AbstractTestNGCucumberTests{
	
	

}
