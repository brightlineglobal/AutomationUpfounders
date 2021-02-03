package pageObject;

import net.bytebuddy.dynamic.scaffold.MethodGraph;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.util.Date;

public class StoryPage {
    public WebDriver driver;
    public JavascriptExecutor js;

    public StoryPage(WebDriver driver) {
        this.driver =driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-story/div/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[1]")
    WebElement dashBoardTab;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-story/div/div/mat-tab-group/mat-tab-header/div[2]/div/div/div[2]")
    WebElement analyticTab;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-story/div/div/mat-tab-group/div/mat-tab-body[2]/div/div")
    WebElement analyticTabMessage;

    @FindBy(xpath="//h5[contains(text(), 'Newsletter Signups')]")
    WebElement newsLetterTitle;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-story/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/mat-table/mat-header-row/mat-header-cell[1]")
    WebElement newsletterSignUpTitle;

    //@FindBy(xpath ="/html/body/app-root/app-admin-layout/div/div[2]/app-story/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[2]/mat-table/mat-row[1]/mat-cell[1]")
    @FindBy(xpath = "(//mat-header-cell[@role='columnheader'][contains(.,'Email')])[1]")
    WebElement firstEmailNewsLetterSignUp;

    //@FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-story/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[3]/div/h5")
    @FindBy(xpath = "//h5[@class='section_title'][contains(.,'Inbox')]")
    WebElement inboxTitleText;

    //@FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-story/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[3]/mat-table/mat-row/mat-cell[1]")
    @FindBy(xpath = "//mat-cell[@role='gridcell'][contains(.,'ghlema kader')]")
    WebElement firstNameInbox;

    //@FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-story/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div[1]/a")
    @FindBy(xpath = "//img[contains(@title,'Story Designer page')]")
    WebElement storyLink;

    @FindBy(xpath="//joy-close-button[contains(@class,'joyride-step__close')]")
    WebElement storyPagePopupWindow;

    @FindBy(xpath ="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div[4]/div[1]/p")
    WebElement userName;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div[4]/div[1]/div/div[1]/input")
    WebElement fbInputElement;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div[4]/div[1]/div/div[2]/input")
    WebElement twInputElement;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div[4]/div[1]/div/div[3]/input")
    WebElement linkedInputElement;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div[4]/div[2]/p[1]/input")
    WebElement newsLetterInput;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div[4]/div[2]/p[2]/button")
    WebElement  signUpBtn;

    @FindBy (xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/div[4]/div[2]")
    WebElement successfulMessage;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/span[2]/quill-editor/div[2]/div[1]")
    WebElement ourStoryInput;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/p/span[2]/quill-editor/div[2]/div[1]")
    WebElement aboutUsInput;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/span[2]/quill-editor/div[1]/span[14]/button[3]")
    WebElement addVideoInOurStory;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/span[2]/quill-editor/div[2]/div[3]/input")
    WebElement ourStoryVideoUrlInput;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/span[2]/quill-editor/div[2]/div[3]/a[2]")
    WebElement ourStoryVideoUrlSaveBtn;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/p/span[2]/quill-editor/div[1]/span[14]/button[3]")
    WebElement attachVideoLinkInAboutUsBtn;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/p/span[2]/quill-editor/div[2]/div[3]/input")
    WebElement videoLinkAboutUsInput;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/p/span[2]/quill-editor/div[2]/div[3]/a[2]")
    WebElement videoLinkAboutUsSaveBtn;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/button")
    WebElement firstActLabel;

    @FindBy(xpath="/html/body/app-root/app-login/div[3]/div/div/form/div[1]/div[2]/div[1]/mat-form-field/div/div[1]/div/input")
    WebElement firstActLabelFullNameInput;

    @FindBy(xpath="/html/body/app-root/app-login/div[3]/div/div/form/div[1]/div[2]/div[2]/mat-form-field/div/div[1]/div/input")
    WebElement firstActLabelEmailInput;

    @FindBy(xpath="/html/body/app-root/app-login/div[3]/div/div/form/div[1]/div[3]/div/mat-form-field/div/div[1]/div/textarea")
    WebElement firstActLabelMessageInput;

    @FindBy(xpath="/html/body/app-root/app-login/div[3]/div/div/div/button")
    WebElement firstActLabelClsIcon;

    @FindBy (xpath="/html/body/app-root/app-login/div[3]/div/div/form/div[2]/button[2]")
    WebElement firstActLabelSendBtn;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/div/div[1]/i")
    WebElement firstActLabelClsBtn;

    //@FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/button")
    @FindBy(xpath = "//button[@data-toggle='modal'][contains(.,'LOOKING FOR INVESTOR')]")
    WebElement secondActLabel;

    //@FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/div/div[2]/i")
    @FindBy(xpath = "(//i[@class='fa fa-times pointer mx-1 dleteIcon ng-star-inserted'])[2]")
    WebElement secondActLabelDeleteBtn;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div[2]/button")
    WebElement addActionBtn;

    @FindBy(xpath="/html/body/app-root/app-login/div[2]/div/div/form/div[1]/div[1]/div/mat-form-field/div/div[1]/div/input")
    WebElement actLabelInput;

    @FindBy(xpath="/html/body/app-root/app-login/div[2]/div/div/form/div[1]/div[2]/div/mat-form-field/div/div[1]/div/textarea")
    WebElement actDescriptionInput;

    @FindBy(xpath="/html/body/app-root/app-login/div[2]/div/div/form/div[1]/div[4]/div/mat-form-field/div/div[1]/div/input")
    WebElement orUrlInput;

    @FindBy(xpath="/html/body/app-root/app-login/div[2]/div/div/form/div[2]/button[1]")
    WebElement addActnClsBtn;

    @FindBy(xpath="/html/body/app-root/app-login/div[2]/div/div/form/div[2]/button[2]")
    WebElement addActnSaveBtn;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/button")
    WebElement storyPageSaveBtn;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/button")
    WebElement storyPagePreviewBtn;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[3]/div/div[2]/div[3]/button")
    WebElement storyPagePublishBtn;

    //@FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div[1]/span/a")
    @FindBy(xpath = "//a[@href='https://upfounders-staging.herokuapp.com/story/gkadir']")
    WebElement publishedUrl;

    @FindBy(xpath = "(//div[contains(.,'Your story page Url: https://upfounders-staging.herokuapp.com/story/gkadir')])[7]")
    WebElement publishMsg;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div[1]")
    WebElement publishFullMsg;

    //@FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[1]/div[2]/a")
    @FindBy(xpath = "//a[@href='/dashboard/story'][contains(.,'Back')]")
    WebElement storyPageBackBtn;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[1]/div[2]/div/a")
    WebElement exitPreviewBtn;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/div[1]/span[2]/div/iframe")
    WebElement videoIframeInOurStory;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[2]/div[2]/div[1]/div/div[2]/p/span[2]/span/p")
    WebElement previewPageAboutUsContent;

    @FindBy(xpath="/html/body/app-root/app-login/div[1]/section/div[2]/div/div[1]/div/ul/li/a")
    WebElement shareYourStoryLinkBtn;

    //join waiting list page

    @FindBy(xpath="/html/body/div[3]/div/div/section/article/div/form/div[2]/div/span")
    WebElement invitationMsg;

    @FindBy(xpath="/html/body/header/div[2]/div/div/div/h1")
    WebElement signUpHeader;

    //@FindBy(xpath="/html/body/div[3]/div/div/section/article/div/form/div[3]/div/input")
    @FindBy(xpath = "//input[contains(@data-internal-id,'textbox1')]")
    WebElement nameInput;

    //@FindBy(xpath="/html/body/div[3]/div/div/section/article/div/form/div[4]/div/input")
    @FindBy(xpath = "//input[contains(@data-internal-id,'email2')]")
    WebElement emailInput;

    @FindBy(xpath ="//input[contains(@value,'Get invited')]")
    WebElement getInvitedBtn;

    @FindBy(xpath="//a[@href='https://upfounders.co']")
    WebElement upFoundersLogoLink;





    public void clickAnalyticTab(){
        js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",analyticTab);


        // analyticTab.click();
    }

    public String verifyAnalyticTabMessage(){
       String message = analyticTabMessage.getText();
       return message;

    }

    public void clickDashBoardTab() {
        js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",dashBoardTab);

        //dashBoardTab.click();
    }

    public String verifyNewsletterSignUps() throws Exception{
        Thread.sleep(3000);
        js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,250)");
        Thread.sleep(2000);
        String firstEmail = firstEmailNewsLetterSignUp.getText();
        System.out.println("actual email is: "+firstEmail);
        //String emailContent = newsletterSignUpTitle.getText();
        return firstEmail;

    }

    public String verifyInboxTitleAndEmail(){
        js=(JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,500)");
        js.executeScript("window.scrollBy(0,550)");
        js.executeScript("window.scrollBy(0,550)");
        js.executeScript("arguments[0].scrollIntoView();",inboxTitleText);
        String inboxTitle = inboxTitleText.getText();
        String inboxFirstName = firstNameInbox.getText();
        String titleAndName = inboxTitle+" and "+inboxFirstName;
        System.out.println("actual title and name is: "+titleAndName);
        return titleAndName;
    }

    public void clickOnStoryPageLink() throws Exception{
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",storyLink);
        js.executeScript("arguments[0].click();",storyLink);
        Thread.sleep(3000);
    }

    public void closePopupWindow(){
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",storyPagePopupWindow);
        js.executeScript("arguments[0].click();",storyPagePopupWindow);
    }

    public String verifyUserName()throws Exception{
        Thread.sleep(3000);
        String usersName = userName.getText();
        System.out.println("actual user name is: "+usersName);
        return usersName;
    }

    public String verifyCurrentUrl(){
        String currentUrl = driver.getCurrentUrl();
        System.out.println("actual current url is: "+currentUrl);
        return currentUrl;
    }

    public void inputSocialMedia(String fbInput, String twInput, String linkedInput) throws Exception{
        fbInputElement.clear();
        Thread.sleep(1000);
        fbInputElement.sendKeys(fbInput);
        twInputElement.clear();
        Thread.sleep(1000);
        twInputElement.sendKeys(twInput);
        Thread.sleep(1000);
        linkedInputElement.clear();
        Thread.sleep(1000);
        linkedInputElement.sendKeys(linkedInput);
        Thread.sleep(2000);
    }

    public void signUpForNewsLetter(String email) throws Exception{
                js=(JavascriptExecutor)driver;
                js.executeScript("arguments[0].scrollIntoView();",newsLetterInput);
                newsLetterInput.clear();
                newsLetterInput.sendKeys(email);
                Thread.sleep(3000);
                signUpBtn.click();
                Thread.sleep(2000);

    }
    public String verifySuccessFullMessage() {
        String succesMessage = successfulMessage.getText();
        System.out.println("actual successful message is: " + succesMessage);
        return succesMessage;
    }

    public void editOurStory(String text, String videoUrl) throws Exception{
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",ourStoryInput);
        ourStoryInput.clear();
        Thread.sleep(1000);
        ourStoryInput.sendKeys(text);
        Thread.sleep(1000);
        addVideoInOurStory.click();
        Thread.sleep(1000);
        ourStoryVideoUrlInput.sendKeys(videoUrl);
        Thread.sleep(1000);
        ourStoryVideoUrlSaveBtn.click();
        Thread.sleep(3000);

    }
    public void editAboutUs(String text)throws Exception{
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView();",aboutUsInput);
        aboutUsInput.clear();
        Thread.sleep(1000);
        aboutUsInput.sendKeys(text);

    }

    public void actionLabelSendMsg(String fullName, String email, String message)throws Exception{
        firstActLabel.click();
        Thread.sleep(1000);
        firstActLabelClsIcon.click();
        Thread.sleep(2000);
        firstActLabel.click();
        firstActLabelFullNameInput.sendKeys(fullName);
        Thread.sleep(2000);
        firstActLabelEmailInput.sendKeys(email);
        Thread.sleep(2000);
        firstActLabelMessageInput.sendKeys(message);
        Thread.sleep(2000);
        firstActLabelSendBtn.click();
        Thread.sleep(3000);

    }

    public void deleteSecondActionLabel() throws Exception {
        Thread.sleep(3000);
        js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();",secondActLabelDeleteBtn);
        //secondActLabelDeleteBtn.click();
    }

    public void addNewActionLabel(String label, String description) throws Exception {
        addActionBtn.click();
        Thread.sleep(1000);
        addActnClsBtn.click();
        Thread.sleep(1000);
        addActionBtn.click();
        Thread.sleep(1000);
        actLabelInput.sendKeys(label);
        Thread.sleep(1000);
        actDescriptionInput.sendKeys(description);
        Thread.sleep(2000);
        addActnSaveBtn.click();
    }

    public String verifyNewCreatedActionLabel(){
        String labelText = secondActLabel.getText();
        System.out.println("actual label content is: "+labelText);
        return labelText;
    }

    public void clickSave() {
        storyPageSaveBtn.click();
    }

    public void clickPreviewBtn(){
        storyPagePreviewBtn.click();
    }

    public String verifyAboutUsContent(){
        String aboutUsContent=previewPageAboutUsContent.getText();
        System.out.println("actual about us content is: "+aboutUsContent);
        return aboutUsContent;
    }

    public boolean verifyVideoIframe(){
        boolean as= videoIframeInOurStory.isDisplayed();
        return as;
    }

    public void clickExitPreview(){
        exitPreviewBtn.click();
    }
    public void clickPublish(){
        storyPagePublishBtn.click();
    }
    public String verifyPublishSuccessMessage(){
        String successMsg = publishMsg.getText();
        System.out.println("actual success message is: "+successMsg);
        return successMsg;
    }

    public void clickStoryUrl(){
        publishedUrl.click();

    }
    public void clickShareYourStory(){
        shareYourStoryLinkBtn.click();
    }

    public String verifyPageHeader(){
        String header =signUpHeader.getText();
        System.out.println("actual page header is: "+header);
        return header;
    }

    public void editInvitation(String name, String email) throws Exception{
            nameInput.sendKeys(name);
            emailInput.sendKeys(email);
            getInvitedBtn.click();
            Thread.sleep(2000);
    }


    public void clickOnUpFoundersLogoLink()throws Exception {
            upFoundersLogoLink.click();
            Thread.sleep(5000);
    }

}
