package stepDefinitions;


import java.io.IOException;


import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriverException;
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
            try {
                byte[] screenshotBytes = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
                String testName = scenario.getName();
                scenario.attach(screenshotBytes, "image/png",testName);
                //scenario.write(testName);
            } catch (WebDriverException we){
                System.err.println(we.getMessage());
            } catch (ClassCastException e){
                e.printStackTrace();
            }
        }
        customeExtentReport.createTest(scenario, screenShotFile);
        customeExtentReport.writeToReport();
        SeleniumDriver.tearDown();
    }

}
