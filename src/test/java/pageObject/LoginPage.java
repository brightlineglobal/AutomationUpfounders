package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



    public class LoginPage {
        public WebDriver driver;

        public LoginPage(WebDriver driver) {
            this.driver = driver;

            PageFactory.initElements(driver, this);
        }

        @FindBy(xpath = "//input[contains(@name,'username')]")
        WebElement email;

        @FindBy(xpath = "//input[contains(@type,'password')]")
        WebElement password;

        @FindBy(xpath = "//button[contains(@id,'submit')]")
        WebElement loginBtn;

        @FindBy(xpath = "//form/div[1]/p")
        WebElement emptyEmailErrorMessage;

        @FindBy(xpath = "/html/body/app-root/app-login/main/section/div[2]/div/div/div[1]/div[2]/form/div[1]/p")    // problem
        WebElement wrongEmailFormatErrorMessage;

        @FindBy(xpath = "//form/div[2]/p")
        WebElement wrongPasswordErrorMessage;

        @FindBy(xpath = "//form/div[2]/p")
        WebElement emptypassword;

        @FindBy(xpath = "//form/div[2]/p")
        WebElement notFound;

        public void setUserName(String userEmail) {

            email.sendKeys(userEmail);
        }

        public void setPassword(String userPassword) {

            password.sendKeys(userPassword);
        }

        public String captureLoginErrorwithemptyEmail() throws Exception {
            Thread.sleep(5000);
            return emptyEmailErrorMessage.getText();
        }

        public String captureLoginErrorwithemptypassword() throws Exception {
            Thread.sleep(5000);
            return emptypassword.getText();
        }
        public String captureWrongEmailFormatError() throws Exception {
            Thread.sleep(5000);

            return wrongEmailFormatErrorMessage.getText();
        }

        public String captureFailedLoginMessage() throws Exception {
            Thread.sleep(5000);
            return wrongPasswordErrorMessage.getText();
        }

        public void clickOnLoginBtn() {
            loginBtn.click();

        }

        public String captureNoAccountMessage() throws Exception {
            Thread.sleep(2000);
            return notFound.getText();
        }
    }



