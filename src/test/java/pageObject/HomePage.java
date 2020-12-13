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

    @FindBy(xpath = "//p[@class='pointer nav-item'][contains(.,'Log out')]")
    WebElement logout;
    @FindBy(xpath = "(//img[@class='userImg ng-star-inserted'])[1]")
    WebElement anyContact;

    @FindBy(xpath = "//*[@id='joyride-step-firstStep']/div/div[3]/div[2]/div/joyride-button/button")
    WebElement StoryPopupMessage;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[7]/div[1]/div[1]/i")
    WebElement commentLikeBtn;

    @FindBy(xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[7]/div[1]/div[2]")
    WebElement commentLikeCounter;


    public boolean isLogodisplayed() {
        return logoOnHomePage.isDisplayed();
    }

    public boolean isStoryPopupMessage(){
        StoryPopupMessage.isDisplayed();
        return true;
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

    public void clickOnPopupWindowMessage() {

        StoryPopupMessage.click();

    }
    public void clickOnLogOutLink() {

        logout.click();
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

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[7]/div[2]/div[2]/div")
    WebElement firstCommentContent;
    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[8]/div[2]/div[2]/div")
    WebElement secondCommentContent;

    @FindBy (xpath="(//i[@class='fa fa-chevron-up'])[0]")
    WebElement likeFirstComment;
    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-detail-content-page-card/div/div/div[2]/div[2]/div[7]/div[1]/div[2]")
    WebElement likeCommentCounter;

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

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/mat-form-field/div/div[1]/div/input")
    WebElement newTitleInput;

    @FindBy (xpath="//*[@id='inlineRadio3']")
    WebElement privateRadio;

    @FindBy (xpath="//*[@id='inlineRadio4']")
    WebElement publicRadio;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[2]/div/quill-editor/div[2]/div[1]")
    WebElement newContentInput;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[3]/div/tag-input/div/div/tag-input-form/form/input")
    WebElement extraTagInput;

    //@FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[4]/div[2]/button[1]")
    //WebElement saveEditBtn;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[4]/div[2]/button[1]")
    WebElement saveEditBtn;

    @FindBy (xpath="/html/body/app-root/app-admin-layout/div/div[2]/app-login/section/div[2]/div/div[1]/div/form/div[3]/div/tag-input/div/div/tag/div/div/delete-icon")
    WebElement tagDelete;

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

    public String verifyFirstNote(){
        String content =firstNote.getText();
        String tagName=firstTag.getText();
       String contentAndTag =content+"_"+tagName;
        System.out.println(contentAndTag);
       return contentAndTag;
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

//1. post need clcik twice
//2. link still opens same page
//3. post are dynamic
//4. link not interacble, globallink, 1/4 chance






    /*   @FindBy (xpath ="/html/body/app-root/app-admin-layout/div/div[1]/app-sidebar/div[2]/ul/span[1]/li/a")
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

    @FindBy(xpath = "//p[@class='pointer nav-item'][contains(.,'Log out')]")
    WebElement logout;
    @FindBy(xpath = "(//img[@class='userImg ng-star-inserted'])[1]")
    WebElement anyContact;

    @FindBy(xpath = "//*[@id='joyride-step-firstStep']/div/div[3]/div[2]/div/joyride-button/button")
    WebElement StoryPopupMessage;

 public boolean isLogodisplayed() {
        return logoOnHomePage.isDisplayed();
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


    public void seeLogOutLink() {

        logout.isDisplayed();
    }

    public void clickOnPopupWindowMessage(){
        StoryPopupMessage.click();

    }

    public void clickOnLogOutLink() {

        logout.click();
    }

    public void clickOnHomePageLink(){
        homePageLink.click();

    }

    public void logoOnDashboard() {
        logoOnHomePage.isDisplayed();

    }

*/


    @FindBy(xpath = "//p[contains(.,'Home')]")
    WebElement homeLink;

    @FindBy(xpath = "//button[contains(.,'Post')]")
    WebElement postButton;

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

    public HomePage clickHomePageLink()throws Exception{

        Thread.sleep(5000);
        homePageLink.click();
        Thread.sleep(5000);
        return new HomePage(driver);
    }
    public boolean verifyAccessToHomePage(){
        return postBtn.isDisplayed();

    }


    public void setContentInput(String inputMsg) {
        try {
            contentInput.sendKeys(inputMsg);
        } catch (NullPointerException e) {
            System.out.println(("NullPointer thrown!"));
        }
    }
    public void getClickableLink(){
        clickableLink.click();
    }
    public void setClickableLink()throws Exception {
        peopleLink.click();
        Thread.sleep(5000);
    }

    public void getContentLink() throws Exception{
        Thread.sleep(5000);
        contentLink.click();
        Thread.sleep(5000);
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
        tagDelete.click();
        extraTagInput.sendKeys(extraTag);
        Thread.sleep(3000);
        emptySpaceToClick.click();
        Thread.sleep(2000);
        emptySpaceToClick.click();
        //tagDelete.click();
        //Thread.sleep(3000);
        //emptySpaceToClick.click();
        //Thread.sleep(3000);
        //saveEditBtn.click();

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
}
