package testRunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"C://AutomationUpFounders//Features"},
        glue = {"stepDefinitions"},
        plugin = {"json:target/cucumber.json","pretty", "html:test-out/cucumber-reports.html","junit:test-out/cucumber.xml"},
        dryRun = false,
        monochrome = true

)

public class TestRunner extends io.cucumber.testng.AbstractTestNGCucumberTests {

}