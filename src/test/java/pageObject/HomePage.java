package pageObject;


import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public WebDriver driver;


    public HomePage (WebDriver driver) {


        this.driver= driver;

        PageFactory.initElements(driver, this);


    }

    @FindBy(xpath ="/html/body/app-root/app-admin-layout/div/div[1]/app-sidebar/div[2]/ul/span[1]/li/a")
    WebElement homePageLink;


    @FindBy(xpath = "//*[@id='joyride-step-firstStep']/div/div[3]/div[2]/div/joyride-button/button")
    WebElement StoryPopupMessage;

    @FindBy(xpath = "(//i[contains(@class,'fa fa-thumbs-up pointer content_action_icon ml-3')])[1]")
    WebElement commentLikeBtn;

    @FindBy(xpath = "(//i[contains(@class,'fa fa-thumbs-up pointer content_action_icon ml-3')])[1]")
    WebElement commentLikeCounter;



    @FindBy(id="mat-input-2")
    WebElement contentInput;

    @FindBy (id="mat-input-2")
    WebElement clickableLink;

    @FindBy(xpath = "//p[contains(.,'People')]")
    WebElement peopleLink;

    @FindBy (xpath= "/html/body/app-root/app-admin-layout/div/div[1]/app-sidebar/div[2]/ul/span[4]/li/a")
    WebElement contentLink;


    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[4]/div[2]")
    WebElement emptySpaceToClick;

    @FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[2]/div/app-mycontent-item[1]/div/div/div/div[2]/div/div[1]/div[1]/div/span[1]")
    WebElement firstNote;

    @FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[2]/div/app-mycontent-item[1]/div/div/div/div[2]/div/div[1]/div[1]/div/span[2]")
    WebElement firstNoteTag;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[1]/div/form/div[1]/div/mat-form-field/div/div[1]/div/input")
   WebElement contentTitleInput;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[1]/div/form/div[2]/div[1]/quill-editor/div[2]/div[1]/p")
    WebElement descriptionInput;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[1]/div/form/div[2]/div[2]/tag-input/div/div/tag-input-form/form/input")
    WebElement tagInput;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[1]/div/form/div[2]/div[3]/button")
    WebElement postBtn;

    @FindBy(xpath = "(//i[contains(@class,'fa fa-thumbs-up pointer content_action_icon')])[1]")
    WebElement firstLikeBtn;

    @FindBy(xpath = "(//i[contains(@class,'fa fa-thumbs-up pointer content_action_icon')])[1]")
    WebElement likeCounter;

    //@FindBy(css="a[href='https://globallink.com']")
    //@FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[2]/div/app-mycontent-item[30]/div/div/div/div[2]/div/div[1]/div[1]/div/span[3]/a")
    @FindBy(xpath = "//i[contains(@class,'fa fa-external-link')]")
    WebElement globalLink;


    @FindBy(xpath = "//textarea[@placeholder='Type your Comment here']")
    WebElement commentArea;


    @FindBy(xpath = "//button[@class='btn btn-success'][contains(.,'Add Comment')]")
    WebElement addCommentBtn;

    @FindBy(xpath = "(//div[@class='col ml-5 py-3'])[1]")
    WebElement firstCommentContent;
    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[8]/div[2]/div[2]/div")
    WebElement secondCommentContent;

    @FindBy(xpath = "//i[@class='material-icons'][contains(.,'edit')]")
    WebElement editPostBtn;

    @FindBy(xpath = "//i[@class='material-icons'][contains(.,'delete')]")
    WebElement deletePostBtn;


    @FindBy(xpath = "//input[contains(@formcontrolname,'linkName')]")
    WebElement newTitleInput;

    //@FindBy (xpath="//*[@id='inlineRadio3']")
    @FindBy (id="inlineRadio3")
    WebElement privateRadio;

    //@FindBy (xpath="//*[@id='inlineRadio4']")
    @FindBy (id="inlineRadio4")
    WebElement publicRadio;

    @FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[2]/div/quill-editor/div[2]/div[1]")
    WebElement newContentInput;

    @FindBy(xpath = "//input[contains(@class,'ng2-tag-input__text-input ng-untouched ng-pristine ng-valid')]")
    WebElement extraTagInput;

    @FindBy(xpath = "//button[contains(.,'Save')]")
    WebElement saveEditBtn;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[3]/div/tag-input/div/div/tag/div/div/delete-icon")
    WebElement tagDelete;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[1]/div/form/div[2]/div[1]/quill-editor/div[1]/span/button[3]")
    WebElement videoBtn;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[1]/div/form/div[2]/div[1]/quill-editor/div[2]/div[3]/input")
    WebElement videoLinkInput;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[1]/div/form/div[2]/div[1]/quill-editor/div[2]/div[3]/a[2]")
    WebElement videoLinkSaveBtn;


    //@FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[2]/div/app-mycontent-item[1]/div/div/div[2]/div[2]/div/div[2]/div[1]/iframe")
    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[2]/div/app-mycontent-item[1]/div/div/div/div[2]/div/div[2]/div[1]")
    WebElement videoElementInNote;



    public void clickOnPopupWindowMessage() {

        StoryPopupMessage.click();

    }

    public void setPostContents(String title, String description, String tag)throws Exception {

        contentTitleInput.sendKeys(title);
        descriptionInput.sendKeys(description);
        tagInput.sendKeys(tag);
        Thread.sleep(3000);

    }
    public void clickOnPostBtn() {

        postBtn.click();


    }

    public HomePage refreshPage(){
          driver.navigate().refresh();
          return new HomePage(driver);
    }

    public HomePage clickGlobalLink() throws Exception {

        String parentPageHandle= driver.getWindowHandle();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
       JavascriptExecutor js= (JavascriptExecutor)driver;
       js.executeScript("window.scrollBy(0,1500)");
       Thread.sleep(3000);
       js.executeScript("window.scrollBy(0,1500)");
       Thread.sleep(3000);
       js.executeScript("window.scrollBy(0,1500)");
       Thread.sleep(3000);
        js.executeScript("window.scrollBy(0,1500)");
        Thread.sleep(2000);



        //js.executeScript("arguments[0].scrollIntoView();",globalLink);
        //Thread.sleep(3000);
        try {
            js.executeScript("arguments[0].scrollIntoView();",globalLink);
            Thread.sleep(2000);
            js.executeScript("arguments[0].click()",globalLink);
            Thread.sleep(3000);
            //globalLink.click();
        } catch (ElementNotInteractableException e) {
            e.printStackTrace();
            System.out.println("This element is not interactable");
        }
        for(String winHandle: driver.getWindowHandles()){
            driver.switchTo().window(winHandle);
        }System.out.println(driver.getTitle());
        // driver.close();
        Thread.sleep(3000);
        driver.switchTo().window(parentPageHandle);
        Thread.sleep(3000);
        return new HomePage(driver);

    }

    public String verifyFirstNote() throws Exception{
        Thread.sleep(6000);
        String content =firstNote.getText();
        Thread.sleep(3000);
        String tagName=firstNoteTag.getText();
        String contentAndTag =content+" "+tagName;
        System.out.println(contentAndTag);
       return contentAndTag;
    }
    


    public void clickFirstNote(){
        firstNote.click();
    }

    public void deleteFirstNote(){
        deletePostBtn.click();
    }

    public void setFirstLikeBtn(){
        firstLikeBtn.click();
    }

    public String counterStatus(){
        String counterResult = likeCounter.getText();
        return counterResult;
    }

    public void makeComment(String comment1, String comment2) throws Exception {
        Thread.sleep(2000);
        commentArea.sendKeys(comment1);
        Thread.sleep(2000);
        addCommentBtn.click();
        Thread.sleep(3000);
        commentArea.sendKeys(comment2);
        Thread.sleep(2000);
        addCommentBtn.click();
        Thread.sleep(2000);

    }
    public String verifyComment() throws Exception {
        String comment1 = firstCommentContent.getText();
        Thread.sleep(3000);
        String comment2 = secondCommentContent.getText();
        String twoComments = comment1+"_"+comment2;
        return twoComments;

    }


    public String likeCommentAndVerify() throws Exception {
        commentLikeBtn.click();
        Thread.sleep(2000);
        commentLikeBtn.click();
        String counterNum = commentLikeCounter.getText();
        return counterNum;
    }

    public void editNote(String newTitle, String newContent, String extraTag) throws Exception {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        editPostBtn.click();
        newTitleInput.click();
        Thread.sleep(2000);
        newTitleInput.clear();
        newTitleInput.sendKeys(newTitle);
        Thread.sleep(2000);
        privateRadio.click();
        Thread.sleep(2000);
        publicRadio.click();
        newContentInput.click();
        Thread.sleep(2000);
        newContentInput.clear();
        Thread.sleep(2000);
        newContentInput.sendKeys(newContent);
        Thread.sleep(2000);
        js.executeScript("arguments[0].scrollIntoView();",tagDelete);
        Thread.sleep(2000);
        tagDelete.click();
        extraTagInput.sendKeys(extraTag);
        Thread.sleep(3000);
        //emptySpaceToClick.click();
        //Thread.sleep(2000);
        //emptySpaceToClick.click();
        //tagDelete.click();
        //Thread.sleep(3000);
        //emptySpaceToClick.click();
        //Thread.sleep(3000);
        privateRadio.click();
        publicRadio.click();
        Thread.sleep(2000);
        saveEditBtn.click();
        Thread.sleep(3000);

        Thread.sleep(4000);
        //driver.navigate().refresh();
        //Thread.sleep(3000);


    }

    public String verifyCommentOne() throws Exception {
        String comment1 = firstCommentContent.getText();
        Thread.sleep(3000);
        return comment1;
    }

    public String verifyCommentTwo() throws Exception {
        Thread.sleep(5000);
        String comment2 = secondCommentContent.getText();
        return comment2;
    }

    public String getParentPageTitle(){
        String pageTitle = driver.getTitle();
        System.out.println("parent page Title is: "+pageTitle);
        return pageTitle;
    }
    public String getChildTitle(){
        for(String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
        String childPageTitle = driver.getTitle();
        System.out.println(childPageTitle);
        driver.close();
        return childPageTitle;

    }

    public void setVideoPost(String title, String videoLink, String tag)throws Exception {
        Thread.sleep(5000);
        contentTitleInput.sendKeys(title);
        Thread.sleep(2000);
        videoBtn.click();
        Thread.sleep(2000);
        videoLinkInput.sendKeys(videoLink);
        Thread.sleep(2000);
        videoLinkSaveBtn.click();
        Thread.sleep(2000);
        tagInput.sendKeys(tag);
        Thread.sleep(3000);

    }

    public boolean verifyVideoLinkInNote() throws Exception{
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("window.scrollBy(0,800)");
        Thread.sleep(3000);
        //js.executeScript("window.scrollBy(0,500)");
        videoElementInNote.isDisplayed();
        return true;
    }

}
