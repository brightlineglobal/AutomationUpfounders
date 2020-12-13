package stepDefinitions;


import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import utilities.CustomeExtentReport;
import utilities.SeleniumDriver;

public class Hooks {

    private static CustomeExtentReport customeExtentReport;
    private static boolean isReporterRunning;


    @Before(order=1)
    public static void setUp() {
        SeleniumDriver.setUp();
    }

    @Before
    public void beforeScenario(Scenario scenario) {
        if(!isReporterRunning) {
            customeExtentReport = new CustomeExtentReport("target\\ExtentReport.html");
            isReporterRunning = true;
        }
    }

    @After
    public void afterScenario(Scenario scenario) throws IOException {
        WebDriver driver=SeleniumDriver.getDriver();
        String screenShotFile = "target" + scenario.getName().replaceAll("", "") + ".jpg";
        if(scenario.isFailed()) {
            byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshotBytes, "image/png");
        }

        customeExtentReport.createTest(scenario, screenShotFile);
        customeExtentReport.writeToReport();
        SeleniumDriver.tearDown();
    }

}
