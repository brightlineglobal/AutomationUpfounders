package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"Features"},
        glue = {"stepDefinitions"},
        plugin = {"json:target/cucumber.json","pretty", "html:test-out/cucumber-reports.html","junit:test-out/cucumber.xml"},
        monochrome = true,
                dryRun = false
)

public class TestRunner extends AbstractTestNGCucumberTests {

}