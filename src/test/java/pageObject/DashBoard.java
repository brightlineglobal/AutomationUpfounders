package pageObject;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DashBoard {



        public WebDriver driver;
        public WebDriverWait wait;

        public DashBoard(WebDriver driver) {

            this.driver= driver;

            PageFactory.initElements(driver, this);


        }

        @FindBy(xpath ="/html/body/app-root/app-admin-layout/div/div[1]/app-sidebar/div[2]/ul/span[1]/li/a")
        WebElement homePageLink;


        @FindBy(xpath = "(//input)[2]" )
        WebElement name;


        @FindBy(xpath = "//div/a/img")
        WebElement logoOnHomePage;

        @FindBy(xpath ="//div[contains(text(),'Invited')]")
        WebElement invitedLink;

        @FindBy(xpath = "//mat-header-cell[1]")
        WebElement inviteeTitle;

        @FindBy(id ="mat-tab-label-2-2")
        WebElement sharedLink;

        @FindBy(xpath = "//mat-header-row/mat-header-cell[1]")
        WebElement sharedTitle;

        @FindBy(xpath = "//i[@class='material-icons'][contains(.,'message')]")
        WebElement mesaggeButton;

        @FindBy(xpath = "(//h5[contains(.,'Omer Faruk')])[2]")
        WebElement chat;

        @FindBy(how = How.XPATH, using="(//button)[2]]")
        WebElement adduserBtn;

        @FindBy(xpath = "//h4")
        WebElement subtitleAddContact;

        //@FindBy(xpath = "//p[@class='pointer nav-item'][contains(.,'Log out')]")
        @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[1]/app-sidebar/div[2]/ul/li/p[2]")
        WebElement logout;

        @FindBy(xpath = "(//img[@class='userImg ng-star-inserted'])[1]")
        WebElement anyContact;

        @FindBy(xpath = "//*[@id='joyride-step-firstStep']/div/div[3]/div[2]/div/joyride-button/button")
        WebElement StoryPopupMessage;

       // @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[1]/app-sidebar/div[2]/ul/span[5]/li/a/p")
        //WebElement contentPageLink;

    @FindBy(css="a[href='/dashboard/content']")
    WebElement contentPageLink;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[1]/app-sidebar/div[2]/ul/span[4]/li")
    WebElement peoplePageLink;


   // @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[1]/app-sidebar/div[2]/ul/span[3]/li/a")
   @FindBy(xpath = "//p[contains(.,'Story')]")
    WebElement storyPageLink;



    public boolean isLogodisplayed() {
            return logoOnHomePage.isDisplayed();
        }

        public boolean isStoryPopupMessage(){
            StoryPopupMessage.isDisplayed();
            return true;
        }
        public void goToPeoplePage()throws Exception{
        peoplePageLink.click();
        Thread.sleep(3000);
        }

    public void goToContentPage() throws Exception {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].scrollIntoView()",contentPageLink);
        Thread.sleep(3000);
        js.executeScript("arguments[0].click()",contentPageLink);
        Thread.sleep(3000);
    }

        public void goToInvatedPage() throws Exception {
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[contains(text(),'Invited')]/..")));
            Thread.sleep(3000);

        }
        public String getTheinviteeTitle() {
            return inviteeTitle.getText();
        }

        public void goToSharedPage() throws Exception {
            JavascriptExecutor executor = (JavascriptExecutor) driver;
            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("//div[contains(text(),'Shared')]/..")));
            Thread.sleep(3000);

        }

        public String getSharedTitle() {

            return sharedTitle.getText();
        }

        public void clickOnMesage() {
            mesaggeButton.click();
        }

        public String getChatPersonName() {
            return chat.getText();
        }
        public void clickOnanyContact() {
            anyContact.click();
        }
        /* public AddContact gotoAddContact() throws Exception {


            JavascriptExecutor executor = (JavascriptExecutor) driver;

            executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//button)[2]")));
            Thread.sleep(3000);

            return new AddContact(driver);

        }

         */
        public void seeLogOutLink() {

            logout.isDisplayed();
        }

        public void clickOnPopupWindowMessage() throws Exception {
            JavascriptExecutor js= (JavascriptExecutor)driver;
            js.executeScript("arguments[0].click()",StoryPopupMessage);
            Thread.sleep(2000);
            //StoryPopupMessage.click();

        }
        public void clickOnLogOutLink() throws Exception {
            Thread.sleep(5000);
            JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("arguments[0].scrollIntoView();",logout);
            Thread.sleep(2000);
            js.executeScript("arguments[0].click()",logout);

           // wait = new WebDriverWait(driver,15);
            //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@class='pointer nav-item'][contains(.,'Log out')]")));
           // logout.click();
        }

        public void clickOnHomePageLink(){
            homePageLink.click();

        }

        public void logoOnDashboard() {
            logoOnHomePage.isDisplayed();

        }

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[2]/div/app-mycontent-item[1]/div/div/div[2]/div[1]/div/span[1]")
        WebElement firstNote;

        @FindBy (id="mat-input-0")
        WebElement contentTitleInput;

        @FindBy (id="mat-input-1")
        WebElement descriptionInput;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[1]/div/form/div[2]/div[2]/tag-input/div/div/tag-input-form/form/input")
        WebElement tagInput;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[1]/div/form/div[2]/div[3]/button")
        WebElement postBtn;

        @FindBy(id="mat-error-0")
        WebElement atLeastOneTagMsg;

        @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[2]/div/app-mycontent-item[1]/div/div/div[2]/div[1]/div/span[1]")
        WebElement firstPost;

        @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[2]/div/app-mycontent-item[1]/div/div/div[1]/div[1]")
        WebElement firstLikeBtn;

        @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[2]/div/app-mycontent-item[1]/div/div/div[2]/div[1]/div/span[2]")
        WebElement firstTag;

        @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[2]/div/app-mycontent-item[1]/div/div/div[2]/div[2]/div/span[1]/i")
        WebElement firstFlag;

        @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[2]/div/app-mycontent-item[1]/div/div/div[1]/div[2]")
        WebElement likeCounter;



        @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[2]/div/app-mycontent-item[2]/div/div/div[2]/div[1]/div/span[3]/a")
        WebElement globalLink;

        // get into post page No.2
        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[1]/div[1]/i")
        WebElement likeInsidePost;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[1]/div[2]")
        WebElement likeCounterInsidePost;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[5]/div/textarea")
        WebElement commentArea;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[1]/div/span")
        WebElement postTag;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[1]/h3")
        WebElement postContent;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[1]/div/a")
        WebElement allPostLink;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[6]/div/button")
        WebElement addCommentBtn;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[7]/div[2]/div[1]/div/span[1]")
        WebElement verifySenderName;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[7]/div[2]/div[2]/div")
        WebElement verifyCommentContent;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[7]/div[2]/div[3]/div/a[1]")
        WebElement selectReplyBtn;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[8]/div[2]/div[4]/div[2]/div[2]/textarea")
        WebElement replyArea;

        @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[7]/div[2]/div[3]/div/a[2]")
        WebElement flagToReply;


        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[8]/div[2]/div[4]/div[2]/div[2]/div/div/button")
        WebElement replyConfirmBtn;

        @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[8]/div[2]/div[4]/div[2]/div[2]")
        WebElement repliedContent;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[1]/div/button[2]")
        WebElement editPostBtn;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[1]/div/button[1]")
        WebElement deletePostBtn;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[7]/div[1]/div[1]/i")
        WebElement likeInsideReply;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[7]/div[1]/div[2]")
        WebElement likeCounterInsideReply;

        // from here, to edit page , no.3

        @FindBy (id="mat-input-6")
        WebElement editContentInput;  //only will add text to previous one

        @FindBy (id="inlineRadio3")
        WebElement privateStatus;

        @FindBy (id="inlineRadio4")
        WebElement publicStatus;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[2]/div/quill-editor/div[2]/div[1]")
        WebElement editPostContent;  //only will add text to previous one

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[3]/div/tag-input/div/div/tag/div/div/div")
        WebElement tagContent; //for verification

        @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-main-posts/div/div[2]/div/app-mycontent-item[1]/div/div/div[2]/div[1]/div")
        WebElement firstPostedNote;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[3]/div/tag-input/div/div/tag/div/div/delete-icon")
        WebElement deleteTag; //should return to Home Page with post delted

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[3]/div/tag-input/div/div/tag-input-form/form/input")
        WebElement newTagInput;

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[4]/div[2]/button[2]")
        WebElement backBtn; //should return to Post page, No.2

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[4]/div[2]/button[1]")
        WebElement saveBtn; // return to Content Page, Notes sub page ???

        @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[4]/div[1]/i")
        WebElement deleteBtnInsideEdit;  //delete button inside edit page, once clicked, should delte and return to page 1 Home page


        public void setPostContents(String title, String description, String tag)throws Exception {

            contentTitleInput.sendKeys(title);
            descriptionInput.sendKeys(description);
            tagInput.sendKeys(tag);
            Thread.sleep(3000);

        }
        public void clickOnPostBtn() {

            postBtn.click();

        }

        public void clickGlobalLink(){

            try{
                globalLink.click();
            } catch(ElementNotInteractableException e){
                e.printStackTrace();
                System.out.println("This element is not interactable");
            }

        }

        public void returnToUpfounders() throws Exception {
            driver.navigate().back();
            Thread.sleep(3000);
            if (logoOnHomePage.isDisplayed()) {
                System.out.println("Back to home page is nominal");
            } else if (StoryPopupMessage.isEnabled()) {
                clickOnPopupWindowMessage();
                //System.out.println("Story Popup Message did not show up while navigate back to UpFounders");
            } else
                System.out.println("ooops, something went rong");
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


    public void clickOnStoryPage() throws Exception {
            Thread.sleep(3000);
            storyPageLink.click();
    }
}
//1. post need clcik twice
//2. link still opens same page
//3. post are dynamic
//4. link not interacble, globallink, 1/4 chance




