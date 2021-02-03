package utilities;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

public class TestUtil {

    public static String screenshotPath;
    public static String screenshotName;
    public WebDriver driver;

    public static void captureScreenshot() throws IOException {
        WebDriver driver=SeleniumDriver.getDriver();
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

        Date d = new Date();
        screenshotName = d.toString().replace(":", "_").replace(" ", "_") + ".jpg";
        try{
        FileUtils.copyFile(scrFile,
                new File( "C:\\AutomationUpFounders\\target\\surefire-reports\\html\\" + screenshotName));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }



        }

        //public WebElement waitForElementToBeVisible(By locator, int timeOut){
        //WebElement element = driver.findElement(By.(locator));


    }


