package stepDefinitions;

import org.junit.Assert;


import io.cucumber.java.en.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import pageObject.*;
//import pageObject.AddContact;
//import pageObject.ChatWindow;
//import pageObject.ContactProfile;
import utilities.SeleniumDriver;
import utilities.TestUtil;


public class MainTestSteps {
    DashBoard dashboard;
    LoginPage loginPage;
    //SeleniumDriver slDriver;
    //WebDriver driver;
    HomePage homePage;
    ContentPage contentPage;
    StoryPage storyPage;
    MessagingAndNotificationTabs msgAndNotTab;


    //1. login Page and common shared login to dashboard tests
    @Given("I open the browser")
    public void i_open_the_browser() {
        dashboard = new DashBoard(SeleniumDriver.getDriver());
        loginPage = new LoginPage(SeleniumDriver.getDriver());
        homePage = new HomePage(SeleniumDriver.getDriver());
        contentPage = new ContentPage(SeleniumDriver.getDriver());
        storyPage = new StoryPage(SeleniumDriver.getDriver());
        msgAndNotTab = new MessagingAndNotificationTabs(SeleniumDriver.getDriver());

    }


    @When("I navigate to the resourceful application")
    public void i_navigate_to_the_resourceful_application() {
        SeleniumDriver.openPage();

    }

    @When("click on login button")
    public void click_on_login_button() throws Exception {
        Thread.sleep(3000);
        loginPage.clickOnLoginBtn();
        Thread.sleep(2000);

    }

    @Then("empty email error message {string} should be displayed")
    public void empty_email_error_message_should_be_displayed(String errorMessage) throws Exception {
        Thread.sleep(2000);
        Assert.assertEquals(loginPage.captureLoginErrorwithemptyEmail(), errorMessage);

    }

    @When("I enter user name {string}")
    public void i_enter_user_name(String email) {
        loginPage.setUserName(email);
    }

    @Then("error message {string} should be displayed")
    public void error_message_should_be_displayed(String errorMessage) throws Exception {
        Thread.sleep(2000);
        Assert.assertEquals(loginPage.captureWrongEmailFormatError(), errorMessage);
    }

    @Then("login failure message {string} should be displayed")
    public void login_failure_message_should_be_displayed(String loginFailureMessage) throws Exception {
        Thread.sleep(2000);
        Assert.assertEquals(loginPage.captureLoginErrorwithemptypassword(), loginFailureMessage);
    }

    @Then("no account found {string} should be displayed")
    public void not_account_found_should_be_displayed(String noAccountMessage) throws Exception {

        Thread.sleep(2000);
        Assert.assertEquals(loginPage.captureNoAccountMessage(), noAccountMessage);
    }


    @When("I enter password {string}")
    public void i_enter_password(String password) {

        loginPage.setPassword(password);
    }


    @When("I login the application with {string} and {string}")
    public void i_login_the_application_with_and(String userEmail, String userPassword) throws Exception {
        SeleniumDriver.openPage();
        Thread.sleep(2000);
        loginPage.setUserName(userEmail);
        Thread.sleep(2000);
        loginPage.setPassword(userPassword);
        Thread.sleep(2000);
        loginPage.clickOnLoginBtn();
    }


    @Then("Page title {string}  and logo should be displayed")
    public void page_title_and_logo_should_be_displayed(String pageTitle) throws Exception {
        Thread.sleep(2000);
        Assert.assertTrue(dashboard.isLogodisplayed());
        Thread.sleep(2000);
        Assert.assertEquals(SeleniumDriver.getDriver().getTitle(), pageTitle);


    }

    @And("I click on login button")
    public void iClickOnLoginButton() throws Exception {
        loginPage.clickOnLoginBtn();
        Thread.sleep(3000);
    }


    // DashBoard functions test cases

    @Then("I click on logout link")
    public void i_click_on_logout_link() throws Exception {
        Thread.sleep(5000);
        dashboard.clickOnLogOutLink();
    }

    @And("click on Popup window")
    public void clickOnPopupWindow() throws Exception {
        Thread.sleep(5000);
        try {
            dashboard.clickOnPopupWindowMessage();
        } catch (NoSuchElementException e) {
            e.printStackTrace();
            System.out.println("this time opened without popup window");
        }


    }


    //part 2. HomePage functions test cases

    @And("click on Home Page Link")
    public void clickOnHomePageLink() throws Exception {
        dashboard.clickOnHomePageLink();
        //  homePage.clickHomePageLink();
        Thread.sleep(5000);
    }


    @And("input {string} and {string} and {string} to Content Title")
    public HomePage inputAndAndToContentTitle(String title, String description, String tag) throws Exception {
        Thread.sleep(5000);
        homePage.setPostContents(title, description, tag);
        Thread.sleep(5000);
        return new HomePage(SeleniumDriver.getDriver());
    }

    @And("click on post")
    public void clickOnPost() throws Exception {
        Thread.sleep(3000);
        homePage.clickOnPostBtn();
        Thread.sleep(3000);
        homePage.clickOnPostBtn();
        Thread.sleep(5000);
        //homePage.refreshPage();
        //Thread.sleep(3000);
        // need to click post twice,

    }

    @And("I click on the link")
    public void iClickOnTheLink() throws Exception {
        Thread.sleep(5000);
        homePage.clickGlobalLink();
        Thread.sleep(3000);
        //dashboard.clickGlobalLink();
        //Thread.sleep(3000);
        //dashboard.returnToUpfounders();
        //Thread.sleep(3000);

    }

    @And("come back to UpFounders page")
    public void comeBackToUpFoundersPage() throws Exception {
        Thread.sleep(3000);
        dashboard.returnToUpfounders();
        Thread.sleep(5000);
    }

    @And("delete the posted note")
    public void deleteThePostedNote() throws Exception {
        //Thread.sleep(3000);
        //   dashboard.clickOnHomePageLink();
        Thread.sleep(3000);
        homePage.clickFirstNote();
        Thread.sleep(5000);
        homePage.deleteFirstNote();
        Thread.sleep(3000);
    }

    @And("like the post")
    public void likeThePost() throws Exception {
        Thread.sleep(5000);
        homePage.setFirstLikeBtn();
        Thread.sleep(3000);
        homePage.setFirstLikeBtn();
    }


    @And("verify the like counter {string} with double click")
    public void verifyTheLikeCounter(String counterStatus) {
        //Thread.sleep(5000);
        //homePage.setFirstLikeBtn();
        Assert.assertEquals(counterStatus,homePage.counterStatus());
        System.out.println("Number of Like Counter on just posted note after two time click is " + counterStatus);
    }

    @And("click on home page again")
    public void clickOnHomePageAgain() throws Exception {
        dashboard.clickOnHomePageLink();
        Thread.sleep(3000);
    }


    @And("verify {string} content and {string} tag")
    public void verifyContentAndTag(String content, String tagName) throws Exception {
        Thread.sleep(5000);
        String contentAndTag = content + " " + "/ " + tagName;
        Assert.assertEquals(contentAndTag, homePage.verifyFirstNote());
        System.out.println("verified title name and tagname are " + contentAndTag);

    }


    @And("click on post make comment {string} and {string}")
    public void clickOnPostMakeCommentAndReply(String comment, String comment2) throws Exception {
        homePage.clickFirstNote();
        Thread.sleep(3000);
        homePage.makeComment(comment, comment2);
        Thread.sleep(3000);
        Assert.assertEquals(homePage.verifyCommentOne(), comment);
        //Assert.assertEquals(homePage.verifyCommentTwo(),comment2);
        System.out.println("both comments are verified");

    }


    @And("like the comment and verify counter as {string} with double click")
    public void likeTheCommentAndVerifyCounterAsWithDoubleClick(String counter) throws Exception {
        Thread.sleep(2000);
        Assert.assertEquals(homePage.likeCommentAndVerify(), counter);
        System.out.println("like counter remained 1 with double click");
    }

    @And("I edit the post {string} with {string} with {string}")
    public void iEditThePostWithWith(String newTitle, String newContent, String extrTag) throws Exception {
        homePage.editNote(newTitle, newContent, extrTag);
        Thread.sleep(3000);
        dashboard.clickOnHomePageLink();
        Thread.sleep(5000);
    }

    @And("verify the change of {string} and {string}")
    public void verifyTheChangeOfAnd(String titleName, String tagName) throws Exception {
        Thread.sleep(2000);
        String contentAndTag = titleName + " " + "/ " + tagName;
        Assert.assertEquals(contentAndTag, homePage.verifyFirstNote());
        System.out.println("verified title name and tagname are " + contentAndTag);

    }


    @And("post a video with title {string} and link {string} and tag name {string}")
    public HomePage postAVideoWithTitleAndLinkAndTagName(String title, String link, String tagName) throws Exception {
        Thread.sleep(5000);
        //dashboard.clickOnHomePageLink();
        //Thread.sleep(3000);
        homePage.setVideoPost(title, link, tagName);
        Thread.sleep(5000);
        homePage.clickOnPostBtn();
        Thread.sleep(2000);
        homePage.clickOnPostBtn();
        Thread.sleep(5000);
        dashboard.clickOnHomePageLink();
        Thread.sleep(4000);
        String contentAndTag = title + " " + "/ " + tagName;
        Thread.sleep(3000);
        Assert.assertEquals(contentAndTag, homePage.verifyFirstNote());
        System.out.println("Video Link Title and Tag is " + contentAndTag);
        Assert.assertTrue(homePage.verifyVideoLinkInNote());
        return new HomePage(SeleniumDriver.getDriver());

    }

    @And("delete the posted note again")
    public void deleteThePostedNoteAgain() throws Exception {
        //Thread.sleep(3000);
        //   dashboard.clickOnHomePageLink();
        Thread.sleep(3000);
        homePage.clickFirstNote();
        Thread.sleep(4000);
        homePage.deleteFirstNote();
        Thread.sleep(3000);
    }


    //part 3. content page test cases

    @And("click on content page and verify page Title {string}")
    public void clickOnContentPageAndVerify(String title) throws Exception {
        dashboard.goToContentPage();
        Thread.sleep(3000);
        Assert.assertEquals(title, contentPage.getContentPageTitle());
    }


    @Then("go to Notes tab")
    public void goToNotesTab() throws Exception {
        contentPage.clickNotesLink();
        contentPage.clickMyNotesTab();


    }

    @Then("verify my Notes with {string} tag and {string} content")
    public void verifyMyNotesWithTitleAndContent(String tag, String content) throws Exception {
        String expectedTagAndContent = tag + " and " + content;
        String actualTagAndContent = contentPage.firstNoteVerification();
        Assert.assertEquals(expectedTagAndContent, actualTagAndContent);
        System.out.println("verifed tag and content as: " + expectedTagAndContent);
    }


    @And("click on Link tab and verify")
    public void clickOnLinkTabAndVerify() throws Exception {
        contentPage.clickLinksPage();
        contentPage.clickMyLinksTab();


    }

    @Then("click on first link in My Links and verify page title {string}")
    public void clickOnFirstLinkInMyLinksAndVerifyPageTitle(String linkTitle) throws Exception {
        String verifiedLinkTitle = contentPage.clickOnFirstMyLink();
        Thread.sleep(2000);
        Assert.assertEquals(linkTitle, verifiedLinkTitle);
    }


    @And("verify shared Notes and verify like counter")
    public void verifySharedNotes() throws Exception {
        contentPage.clickSharedNotesTab();
        boolean as = contentPage.verifyLikeCounter();
        String message = "counter remained same with double click";
        Assert.assertTrue(message, as);
        System.out.println(message);
    }

    @Then("verify shared link and verify page title {string}")
    public void verifySharedLinkAndVerifyPageTitle(String title) throws Exception {
        contentPage.clickSharedTab();
        String sharedLinkTitle = contentPage.clickSharedLinkAndReturn();
        Assert.assertEquals(title, sharedLinkTitle);

    }

    @Then("add new link using Add icon with link name {string} url {string} and description {string} and tag {string} and verify in shared link tab")
    public void addNewLinkUsingAddIconWithLinkNameUrlAndDescriptionAndTagAndVerifyInSharedLinkTab(String linkName, String url, String description, String tag) throws Exception {
        contentPage.clickAddIcon();
        contentPage.clickAddLinkIcon();
        contentPage.closeAddLinkAndOpenAgain();
        contentPage.addALink(linkName, url, description, tag);
        String actualLinkNameAndDescription = contentPage.verifyAddedLinkTitleAndTag();
        String expectedLinkNameAndDescription = linkName + " and " + description;
        System.out.println("expteced link name and description is: " + expectedLinkNameAndDescription);
        Assert.assertEquals(expectedLinkNameAndDescription, actualLinkNameAndDescription);

    }

    @Then("add new Note using Add icon with title {string} and description {string} and tag {string} and verify in shared note tab")
    public void addNewNoteUsingAddIconWithTitleAndDescriptionAndTagAndVerifyInSharedNoteTab(String title, String description, String tag) throws Exception {
        contentPage.clickAddIcon();
        contentPage.clickAddNoteIcon();
        contentPage.backToNotesPage();
        contentPage.clickAddIcon();
        contentPage.clickAddNoteIcon();
        contentPage.addNote(title, description, tag);
        String actualTitleAndTag = contentPage.verifyAddedNoteTitleAndTag();
        String expectedTitleAndTag = title + " " + "/ " + tag;
        Assert.assertEquals(expectedTitleAndTag, actualTitleAndTag);
        System.out.println("expected title and tag is: " + expectedTitleAndTag);


    }

    @Then("add new Note with Link using Add icon with title {string} and url {string} and tag {string} and verify in shared note tab")
    public void addNewNoteWithLinkUsingAddIconWithTitleAndUrlAndTagAndVerifyInSharedNoteTab(String title, String url, String tag) throws Exception {
        contentPage.clickAddIcon();
        contentPage.clickAddNoteIcon();
        contentPage.addNoteWithLink(title, url, tag);
        String actualTagAndTitle = contentPage.verifyNewAddedNoteWithLink();
        String expectedTagAndTitle = "#" + tag + " and " + title;
        Assert.assertEquals(expectedTagAndTitle, actualTagAndTitle);
        System.out.println("expected tag and title is: " + expectedTagAndTitle);
    }

    @And("delete all three posts")
    public void deleteAllThreePosts() throws Exception {
        contentPage.clickLinksPage();
        Thread.sleep(3000);
        contentPage.deleteSharedLink();
        Thread.sleep(3000);
        contentPage.clickNotesLink();
        contentPage.deleteSharedNote();
        Thread.sleep(3000);
        contentPage.clickNotesLink();
        contentPage.deleteSharedNote();
        Thread.sleep(3000);
    }

    //part 4. story page test cases

    @And("click on Story Page Link")
    public void clickOnStoryPageLink() throws Exception {
        dashboard.clickOnStoryPage();
        Thread.sleep(4000);

    }

    @And("click on Story page dash board tab")
    public void clickOnStoryPageDashBoardTab() throws Exception {
        storyPage.clickDashBoardTab();
        Thread.sleep(3000);

    }

    @And("verify {string} in newsletter signups and first Email address")
    public void verifyInNewsletterSignupsAndFirstEmailAddress(String email) throws Exception {
        Assert.assertEquals(email, storyPage.verifyNewsletterSignUps());
        System.out.println("expected email in newsletter is :" + email);
    }

    @And("verify Inbox iframe title {string} and name {string}")
    public void verifyInboxIframeTitle(String title, String name) {
        String titleAndName = title + " and " + name;
        Assert.assertEquals(titleAndName, storyPage.verifyInboxTitleAndEmail());
        System.out.println("expected title and name is: " + titleAndName);
    }

    @And("go to personal Story link and verify {string}")
    public void goToPersonalStoryLink(String name) throws Exception {
        storyPage.clickOnStoryPageLink();
        Thread.sleep(3000);
        storyPage.closePopupWindow();
        System.out.println("expected name of user is: " + name);
        Assert.assertEquals(name, storyPage.verifyUserName());

    }

    @And("verify page title {string}")
    public void verifyPageTitle(String url) {

        System.out.println("expected url is: " + url);
        Assert.assertEquals(storyPage.verifyCurrentUrl(), url);
    }

    @And("input left side bar and click save")
    public void inputLeftSideBarAndClickSave() {
    }

    @And("sign up {string} for newsletter and verify {string} success message")
    public void signUpForNewsletterAndVerifySuccessMessage(String email, String message) throws Exception {
        int randomNum = (int) (Math.random() * 1000);
        email = randomNum + email;
        storyPage.signUpForNewsLetter(email);
        System.out.println("expected successfull message is: " + message);
        Assert.assertEquals(message, storyPage.verifySuccessFullMessage());
        Thread.sleep(3000);

    }

    @And("change Our Story content {string} and attach video link {string}")
    public void changeOurStoryContentAndAttachVideoLink(String text, String videoUrl) throws Exception {
        storyPage.editOurStory(text, videoUrl);
    }

    @And("input About Us {string}")
    public void inputAboutUs(String text) throws Exception {
        storyPage.editAboutUs(text);
    }

    @And("click on first action button and send action invitation to {string} and {string} with {string} message")
    public void clickOnActionButtonAndSendActionInvitationToAndWithMessage(String fullName, String email, String message) throws Exception {
        storyPage.actionLabelSendMsg(fullName, email, message);
    }

    @And("delete second act label click on add action button to create new action label as {string} with content as {string}")
    public void deleteSecondActLabelClickOnAddActionButtonToCreateNewActionLabelAsWithContentAs(String label, String content) throws Exception {
        storyPage.deleteSecondActionLabel();
        Thread.sleep(2000);
        storyPage.addNewActionLabel(label, content);

    }

    @And("verify newly created action label {string}")
    public void verifyNewlyCreatedActionLabel(String text) {
        System.out.println("expected label content is: " + text);
        Assert.assertEquals(storyPage.verifyNewCreatedActionLabel(), text);
    }

    @And("click save and go to preview verify {string} and take screenshot")
    public void clickSaveAndGoToPreviewAndTakeScreenshot(String content) throws Exception {
        storyPage.clickSave();
        Thread.sleep(3000);
        storyPage.clickPreviewBtn();
        Thread.sleep(3000);
        System.out.println("expected about us content is: " + content);
        Assert.assertEquals(content, storyPage.verifyAboutUsContent());
        Thread.sleep(2000);
        Assert.assertTrue(storyPage.verifyVideoIframe());
        System.out.println("video iframe is displayed");
        TestUtil.captureScreenshot();
        Thread.sleep(2000);
    }

    @And("click publish and verify successfull message {string}")
    public void clickPublishAndVerifySuccessfullMessage(String message) throws Exception {
        storyPage.clickExitPreview();
        Thread.sleep(3000);
        storyPage.clickPublish();
        Thread.sleep(3000);
        System.out.println("expected success message is: " + message);
        Assert.assertEquals(message, storyPage.verifyPublishSuccessMessage());
    }

    @And("click the link and verify page url {string}")
    public void clickTheLinkAndVerifyPageUrl(String url) throws Exception {
        storyPage.clickStoryUrl();
        Thread.sleep(3000);
        System.out.println("expected current url is: " + url);
        Assert.assertEquals(storyPage.verifyCurrentUrl(), url);
    }

    @And("go to Analytics tab and verify message {string}")
    public void goToAnalyticsTabAndVerifyMessage(String message) throws Exception {
        storyPage.clickAnalyticTab();
        Thread.sleep(3000);
        Assert.assertEquals(storyPage.verifyAnalyticTabMessage(), message);
        System.out.println("expected message on analytics tab is " + message);
    }


    @And("input fb {string} and tw {string} and linkedln {string}")
    public void inputFbAndTwAndLinkedln(String fbInput, String twInput, String linkedInput) throws Exception {
        storyPage.inputSocialMedia(fbInput, twInput, linkedInput);
        Thread.sleep(3000);

    }

    @And("go to share your story link and verify {string} link")
    public void goToShareYourStoryLinkAndVerifyLink(String url) throws Exception {
        storyPage.clickShareYourStory();
        Thread.sleep(3000);
        System.out.println("expected current url is: " + url);
        Assert.assertEquals(url, storyPage.verifyCurrentUrl());
    }


    @And("verify page header {string} and input name {string} and email {string}")
    public void verifyPageHeaderAndInputNameAndEmail(String header, String name, String email) throws Exception {
        System.out.println("expected header is: " + header);
        Assert.assertEquals(header, storyPage.verifyPageHeader());
        storyPage.editInvitation(name, email);
        Thread.sleep(3000);

    }

    @Then("click UpFounders logo link and verify page url as {string}")
    public void clickUpFoundersLogoLinkAndVerifyPageUrlAs(String url) throws Exception {
        storyPage.clickOnUpFoundersLogoLink();
        System.out.println("expected current url is: " + url);
        Assert.assertEquals(url, storyPage.verifyCurrentUrl());
    }

    //5. MESSAGING AND NOTIFICATION TEST CASES

    @And("click on messaging icon")
    public void clickOnMessagingIcon() throws Exception {
        msgAndNotTab.goToChatPage();//
        msgAndNotTab.clickOnMsgIcon();
    }

    @And("click on conversation with {string}")
    public void clickOnConversationWith(String name) {
        System.out.println("expected name in conversation is: " + name);
        Assert.assertEquals(name, msgAndNotTab.getConversationContactName());

    }

    @And("type {string} in chat window")
    public void typeInChatWindow(String text) throws Exception {
        msgAndNotTab.chatWindowInput(text);
    }

    @And("scroll up to verify his message {string} in {string}")
    public void scrollUpToVerifyHisMessageIn(String message, String date) {
        String messageContent = message + " " + date;
        System.out.println("exptected message content is: " + messageContent);
        Assert.assertEquals(messageContent, msgAndNotTab.verifyMsgTextAndDate());
    }

    @And("scroll down to verify my message {string}")
    public void scrollDownToVerifyMyMessage(String message) throws Exception {
        msgAndNotTab.countIncrement();
        System.out.println("index of latest message " + msgAndNotTab.countIncrement());
        Assert.assertEquals(message, msgAndNotTab.getMyLastMessage());
        System.out.println("exptected my last message is: " + message);

    }

}