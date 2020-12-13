package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumDriver {

    private static SeleniumDriver seleniumDriver;
    private static Properties prop;
    private static WebDriver driver;

    //singleton design pattern
    //singleton class: a singleton class is a class that can have only one object at a time
    //1. make constructor private
    //2. write a static method that has return type object of this singleton class( lazy initialization)

    private SeleniumDriver() {
        prop = new Properties();
        FileInputStream fis;

        try {
            fis = new FileInputStream(
                    "ConfigFiles\\config.properties");
            prop.load(fis);
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        }

        String browerType = prop.getProperty("browser");
        if(browerType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if(browerType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else if(browerType.equalsIgnoreCase("ie")) {
            WebDriverManager.iedriver().setup();
            driver = new InternetExplorerDriver();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }


    public static void openPage() {
        driver.get(prop.getProperty("url"));
    }

    public static WebDriver getDriver() {
        return driver;
    }

    // call SeleniumDriver class's constructor
    public static void setUp() {
        if(seleniumDriver==null) {
            seleniumDriver = new SeleniumDriver();
        }
    }

    public static void tearDown() {
        if(driver != null) {
            driver.close();
            driver.quit();
        }
        seleniumDriver = null;
    }

}

