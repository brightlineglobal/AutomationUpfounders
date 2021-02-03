package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import sun.security.pkcs11.wrapper.Constants;

import java.security.SecureRandom;

public class MessagingAndNotificationTabs<FUL_XPATH> {
    public WebDriver driver;
    public JavascriptExecutor js;
    public Action action;
    public Actions actions;
    public static int i;


    public MessagingAndNotificationTabs(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public String chatPage = "https://upfounders-staging.herokuapp.com/dashboard/chat/5f6be57afef08200177b9343";
    // notification elements
    //@FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-navbar/nav/div/div[2]/ul/li[2]")
   // WebElement notificationIcon;

    // messaging elements
    //@FindBy(css="a[href*='javascript:void(0)']")
    //WebElement messagingIcon;

    //@FindBy(xpath ="/html/body/app-root/app-admin-layout/div/div[2]/app-navbar/nav/div/div[2]/ul/li[1]/a")
    //WebElement message;
//*[@id="navbarDropdownMenuLink"]/i
    //@FindBy(xpath = "//li[@class='nav-item dropdown']")
   // WebElement message;
    //*[@id="navigation"]/ul/li[1]
    //@FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-navbar/nav/div/div[2]/ul/li[1]/div/div[3]/div[2]")
    //WebElement conversationIcon;

    //@FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-navbar/nav/div/div[2]/ul/li[1]/div/div[3]/div[2]/div[1]/div/h5")
    //WebElement nameOfMsgSender;

    //@FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-navbar/nav/div/div[2]/ul/li[1]/div/div[3]")
    //WebElement secondConversation;

    @FindBy(id="navbarDropdownMenuLink")
    WebElement msgIcon;
    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-chat/div[2]/div/div/div/div/div/div[1]/div/div[1]/div/div[2]/h5")
    WebElement conversationTitle;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-chat/div[2]/div/div/div/div/div/div[3]/div/div/textarea")
    WebElement chatWindowInput;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-chat/div[2]/div/div/div/div/div/div[2]")
    WebElement scroller;

    @FindBy(xpath = "//p[contains(.,'hELLO')]")
    WebElement helloMsg;

    @FindBy(xpath = "(//span[contains(.,'24 Sep')])[1]")
    WebElement msgDate;

    //@FindBy(xpath = "(//p[contains(.,'Hello ABC')])[12]")
   // WebElement myLastMsg;




    //2. messaing methods
    public void clickOnMsgIcon() throws Exception{
        //WebDriverWait wait = new WebDriverWait(driver,15);
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[contains(@id,'navbarDropdownMenuLink')])[1]")));

       js=(JavascriptExecutor)driver;
        //js.executeScript("arguments[0].scrollIntoView();",message);
        js.executeScript("arguments[0].click();",msgIcon);
        //js.executeScript("arguments[0].click();",message);
//        message.click();
        //Select select = new Select(messagingIcon);
        //select.selectByValue("ABC EFG E");
        //System.out.println(message.getText());
        msgIcon.click();
       Actions action = new Actions(driver);
       action.moveToElement(msgIcon).build().perform();
       action.click(msgIcon).build().perform();

        Thread.sleep(3000);
    }

   /* public String verifyNameOfSender(){
        String nameOfSender=nameOfMsgSender.getText();
        System.out.println("actual name of sender is: "+nameOfSender);
        return nameOfSender;
    }

    public void clickOnConversation() throws Exception{
       // WebDriverWait wait = new WebDriverWait(driver,15);
      //  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='navbarDropdownMenuLink']/i")));
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",secondConversation);
        Thread.sleep(3000);
    }

     */

    public void goToChatPage() throws Exception{
        driver.get(chatPage);
        Thread.sleep(3000);
    }

    public String getConversationContactName(){
        String contactName=conversationTitle.getText();
        System.out.println("actual contact name in conversation is: "+contactName);
        return contactName;
    }

    public void chatWindowInput(String text) throws Exception{
        actions = new Actions(driver);
        js= (JavascriptExecutor)driver;
        //js.executeScript("arguments[0].scrollIntoView();",chatWindowInput);
        //actions.clickAndHold(chatWindowInput).build().perform();
        js.executeScript("arguments[0].click();",chatWindowInput);
        actions.sendKeys(chatWindowInput,text).build().perform();
        //chatWindowInput.sendKeys(text);
        Thread.sleep(2000);
        //chatWindowInput.sendKeys(Keys.ENTER);
        actions.sendKeys(chatWindowInput,Keys.ENTER).build().perform();
        Thread.sleep(2000);
    }

    public String verifyMsgTextAndDate(){
        actions = new Actions(driver);
        actions.clickAndHold(scroller).build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
        String message= helloMsg.getText()+" "+msgDate.getText();
        System.out.println("actual message content is: "+message);
        return message;

    }


    public int countIncrement(){
        System.out.println(i);
        i++;
        return i;
    }

    public String getMyLastMessage() throws Exception{
        actions = new Actions(driver);
        actions.clickAndHold(scroller).build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
        Thread.sleep(4000);
        String counter = Integer.toString(i);
        //System.out.println("counter now is "+counter);
        String myMessage = driver.findElement(By.xpath("(//p[contains(.,'Hello ABC')])["+counter+"]")).getText();
        //String myMessage = driver.findElement(By.xpath("/html/body/app-root/app-admin-layout/div/div[2]/app-main-chat/div[2]/div/div/div/div/div/div[2]/div/ul/li['"+i+"']/div/div/div/p")).getText();
        System.out.println("actual my last message is : "+myMessage);
        return myMessage;
    }

    public String randomString(int len){
        String abc = "0123455332322@dfdfdfdfdfdfdfdf";
        SecureRandom sr = new SecureRandom();
        StringBuilder sb = new StringBuilder(len);
        for(int i=0; i<len; i++){
            sb.append(abc.charAt(sr.nextInt(abc.length())));
        }
        return sb.toString();

        //can we say this method will run (i) times until reach (len) times, each time will randomly select characters from the string "abc" to form  each character of new String
    }
}