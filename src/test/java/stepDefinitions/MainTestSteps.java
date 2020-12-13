package stepDefinitions;

import org.junit.Assert;


import io.cucumber.java.en.*;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import pageObject.ContentPage;
import pageObject.LoginPage;
import pageObject.HomePage;
//import pageObject.AddContact;
//import pageObject.ChatWindow;
//import pageObject.ContactProfile;
import pageObject.DashBoard;
import utilities.SeleniumDriver;


public class MainTestSteps {
   DashBoard dashboard;
        LoginPage loginPage;
      SeleniumDriver slDriver;
      WebDriver driver;
      HomePage homePage;
      ContentPage contentPage;




//1. Part: start the browser and get to the login page
        @Given("I open the browser")
        public void i_open_the_browser() {
                dashboard = new DashBoard(SeleniumDriver.getDriver());
                loginPage = new LoginPage(SeleniumDriver.getDriver());
                homePage = new HomePage(SeleniumDriver.getDriver());
                contentPage = new ContentPage(SeleniumDriver.getDriver());
        }


        @When("I navigate to the resourceful application")
        public void i_navigate_to_the_resourceful_application() {
                slDriver.openPage();

        }
//2. Part: Login
        @When("click on login button")
        public void click_on_login_button() throws Exception {
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

        @Then("not account found {string} should be displayed")
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
                slDriver.openPage();
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
                Assert.assertEquals(slDriver.getDriver().getTitle(), pageTitle);


        }

    @And("I click on login button")
    public void iClickOnLoginButton() throws Exception {
        loginPage.clickOnLoginBtn();
        Thread.sleep(3000);
    }



        //3. Part: Dashboard

    @Then("I click on logout link")
    public void i_click_on_logout_link() throws Exception {
        Thread.sleep(5000);
        dashboard.clickOnLogOutLink();
    }

        @And("click on Popup window")
        public void clickOnPopupWindow() throws Exception {
                Thread.sleep(3000);
                try {
                        dashboard.clickOnPopupWindowMessage();
                } catch (NoSuchElementException e) {
                        e.printStackTrace();
                        System.out.println("this time opened without popup window");
                }


        }



        @Then("I log out")
        public void iLogOut() {
                dashboard.clickOnLogOutLink();
        }


        @And("click on Home Page Link")
        public void clickOnHomePageLink() throws Exception {
                dashboard.clickOnHomePageLink();
                //  homePage.clickHomePageLink();
                Thread.sleep(5000);
        }

    @Then("logout")
    public void logout() {
        dashboard.clickOnLogOutLink();
    }

        //4 Part: Home Page

        @Then("input {string} to Content Title")
        public void inputToContentTitle(String contentMsg) {
                homePage.setContentInput(contentMsg);
        }

        @Then("click on the link")
        public void clickOnTheLink() throws Exception {
                Thread.sleep(5000);
                homePage.getClickableLink();
        }

        @Then("go to people page")
        public void goToPeoplePage() throws Exception {
                homePage.clickHomePageLink();
                Thread.sleep(3000);
        }



        @Then("go to Content page")
        public void goToContentPage() throws Exception {
                Thread.sleep(3000);
                homePage.getContentLink();
                Thread.sleep(5000);

        }

        @And("input {string} and {string} and {string} to Content Title")
        public HomePage inputAndAndToContentTitle(String title, String description, String tag) throws Exception {
                Thread.sleep(5000);
                homePage.setPostContents(title, description, tag);
                Thread.sleep(5000);
                return new HomePage(driver);
        }

        @And("click on post")
        public void clickOnPost() throws Exception {
                Thread.sleep(3000);
                homePage.clickOnPostBtn();
                Thread.sleep(3000);
                homePage.clickOnPostBtn();
                Thread.sleep(3000);
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
                Thread.sleep(2000);
                homePage.setFirstLikeBtn();
        }


        @And("verify the like counter {string} with double click")
        public void verifyTheLikeCounter(String counterStatus) throws Exception {
                Thread.sleep(2000);
                homePage.setFirstLikeBtn();
                Assert.assertEquals(homePage.counterStatus(), counterStatus);
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
            String contentAndTag = content+"_"+"/ "+tagName;
            Assert.assertEquals(homePage.verifyFirstNote(),contentAndTag);
        System.out.println("verified title name and tagname are "+contentAndTag);

    }


    @And("click on post make comment {string} and {string}")
    public void clickOnPostMakeCommentAndReply(String comment, String comment2) throws Exception {
        homePage.clickFirstNote();
        Thread.sleep(3000);
        homePage.makeComment(comment,comment2);
        Thread.sleep(3000);
        Assert.assertEquals(homePage.verifyCommentOne(),comment);
        //Assert.assertEquals(homePage.verifyCommentTwo(),comment2);
        System.out.println("both comments are verified");

    }



    @And("like the comment and verify counter as {string} with double click")
    public void likeTheCommentAndVerifyCounterAsWithDoubleClick(String counter) throws Exception {
            Thread.sleep(2000);
        Assert.assertEquals(homePage.likeCommentAndVerify(),counter);
        System.out.println("like counter remained 1 with double click");
    }

    @And("I edit the post {string} with {string} with {string}")
    public void iEditThePostWithWith(String newTitle, String newContent, String extrTag) throws Exception {
            homePage.editNote(newTitle,newContent,extrTag);
            Thread.sleep(3000);
            dashboard.clickOnHomePageLink();
            Thread.sleep(5000);
    }

    @And("verify the change of {string} and {string}")
    public void verifyTheChangeOfAnd(String titleName, String tagName) throws Exception {
        Thread.sleep(2000);
        String contentAndTag = titleName+"_"+"/ "+tagName;
        Assert.assertEquals(homePage.verifyFirstNote(),contentAndTag);
        System.out.println("verified title name and tagname are "+contentAndTag);

    }

    @And("verify shared Notes")
    public void verifySharedNotes() {
        
    }

    @And("click on content page and verify")
    public void clickOnContentPageAndVerify() {
        
    }

    @And("click on Link tab and verify")
    public void clickOnLinkTabAndVerify() {
        
    }

    @Then("verify my Links")
    public void verifyMyLinks() {
        
    }

    @Then("verify shared link")
    public void verifySharedLink() {
        
    }

    @Then("go to Notes tab")
    public void goToNotesTab() {
        
        
    }

    @Then("verify my Notes")
    public void verifyMyNotes() {
        
    }

    @Then("add new link using Add icon and verify")
    public void addNewLinkUsingAddIconAndVerify() {
    }

    @Then("add new Note using Add icon and verify")
    public void addNewNoteUsingAddIconAndVerify() {
    }
}