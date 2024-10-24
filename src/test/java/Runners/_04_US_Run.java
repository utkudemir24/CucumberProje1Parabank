package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = {"src/test/java/FeatureFiles/US04.feature"},
        glue = {"StepDefinitions"}
)
public class _04_US_Run extends AbstractTestNGCucumberTests {

}
