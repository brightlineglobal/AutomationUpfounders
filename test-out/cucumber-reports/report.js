$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:contentpage.feature");
formatter.feature({
  "name": "content page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Access to All Content Page Functionalities",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "name": "I navigate to the resourceful application",
  "keyword": "When "
});
formatter.step({
  "name": "I enter user name \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "click on Popup window",
  "keyword": "And "
});
formatter.step({
  "name": "click on content page and verify page Title \"UpFounders\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on Link tab and verify",
  "keyword": "And "
});
formatter.step({
  "name": "click on first link in My Links and verify page title \"Global Link\"",
  "keyword": "Then "
});
formatter.step({
  "name": "verify shared link and verify page title \"Global Link\"",
  "keyword": "Then "
});
formatter.step({
  "name": "go to Notes tab",
  "keyword": "Then "
});
formatter.step({
  "name": "verify my Notes with \"#Testing\" tag and \"New Page\" content",
  "keyword": "Then "
});
formatter.step({
  "name": "verify shared Notes and verify like counter",
  "keyword": "And "
});
formatter.step({
  "name": "add new link using Add icon with link name \"amazon\" url \"https://www.amazon.com\" and description \"testing purpose\" and tag \"uselfulLink\" and verify in shared link tab",
  "keyword": "Then "
});
formatter.step({
  "name": "add new Note using Add icon with title \"Test Note\" and description \"Test Content\" and tag \"testTag\" and verify in shared note tab",
  "keyword": "Then "
});
formatter.step({
  "name": "add new Note with Link using Add icon with title \"Test Note with Link\" and url \"https://www.amazon.com\" and tag \"noteWithLinkTag\" and verify in shared note tab",
  "keyword": "Then "
});
formatter.step({
  "name": "delete all three posts",
  "keyword": "And "
});
formatter.step({
  "name": "I click on logout link",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "gilman.dallas@gmail.com",
        "Kadir123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Access to All Content Page Functionalities",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "MainTestSteps.i_open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the resourceful application",
  "keyword": "When "
});
formatter.match({
  "location": "MainTestSteps.i_navigate_to_the_resourceful_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name \"gilman.dallas@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.i_enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password \"Kadir123\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.i_enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Popup window",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickOnPopupWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on content page and verify page Title \"UpFounders\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickOnContentPageAndVerify(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Link tab and verify",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickOnLinkTabAndVerify()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on first link in My Links and verify page title \"Global Link\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.clickOnFirstLinkInMyLinksAndVerifyPageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify shared link and verify page title \"Global Link\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.verifySharedLinkAndVerifyPageTitle(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to Notes tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.goToNotesTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify my Notes with \"#Testing\" tag and \"New Page\" content",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.verifyMyNotesWithTitleAndContent(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify shared Notes and verify like counter",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.verifySharedNotes()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add new link using Add icon with link name \"amazon\" url \"https://www.amazon.com\" and description \"testing purpose\" and tag \"uselfulLink\" and verify in shared link tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.addNewLinkUsingAddIconWithLinkNameUrlAndDescriptionAndTagAndVerifyInSharedLinkTab(String,String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add new Note using Add icon with title \"Test Note\" and description \"Test Content\" and tag \"testTag\" and verify in shared note tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.addNewNoteUsingAddIconWithTitleAndDescriptionAndTagAndVerifyInSharedNoteTab(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "add new Note with Link using Add icon with title \"Test Note with Link\" and url \"https://www.amazon.com\" and tag \"noteWithLinkTag\" and verify in shared note tab",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.addNewNoteWithLinkUsingAddIconWithTitleAndUrlAndTagAndVerifyInSharedNoteTab(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "delete all three posts",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.deleteAllThreePosts()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.i_click_on_logout_link()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:homepage.feature");
formatter.feature({
  "name": "home page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Access to All Home Page Functionalities",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "name": "I navigate to the resourceful application",
  "keyword": "When "
});
formatter.step({
  "name": "I enter user name \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "click on Popup window",
  "keyword": "And "
});
formatter.step({
  "name": "click on Home Page Link",
  "keyword": "And "
});
formatter.step({
  "name": "input \"Bright Company\" and \"New Work Design\" and \"GoodTag\" to Content Title",
  "keyword": "And "
});
formatter.step({
  "name": "click on post",
  "keyword": "And "
});
formatter.step({
  "name": "verify \"Bright Company\" content and \"GoodTag\" tag",
  "keyword": "And "
});
formatter.step({
  "name": "click on post make comment \"nice sharing\" and \"share more\"",
  "keyword": "And "
});
formatter.step({
  "name": "like the comment and verify counter as \"1\" with double click",
  "keyword": "And "
});
formatter.step({
  "name": "I edit the post \"titleChanged\" with \"contentChanged\" with \"extraTag\"",
  "keyword": "And "
});
formatter.step({
  "name": "I click on the link",
  "keyword": "And "
});
formatter.step({
  "name": "come back to UpFounders page",
  "keyword": "And "
});
formatter.step({
  "name": "click on home page again",
  "keyword": "And "
});
formatter.step({
  "name": "like the post",
  "keyword": "And "
});
formatter.step({
  "name": "verify the like counter \"1\" with double click",
  "keyword": "And "
});
formatter.step({
  "name": "verify the change of \"titleChanged\" and \"extraTag\"",
  "keyword": "And "
});
formatter.step({
  "name": "delete the posted note",
  "keyword": "And "
});
formatter.step({
  "name": "post a video with title \"New Video\" and link \"https://www.youtube.com/watch?v\u003dStunPx5Jk-8\" and tag name \"VideoTag\"",
  "keyword": "And "
});
formatter.step({
  "name": "delete the posted note again",
  "keyword": "And "
});
formatter.step({
  "name": "I click on logout link",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "gilman.dallas@gmail.com",
        "Kadir123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Access to All Home Page Functionalities",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "MainTestSteps.i_open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the resourceful application",
  "keyword": "When "
});
formatter.match({
  "location": "MainTestSteps.i_navigate_to_the_resourceful_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name \"gilman.dallas@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.i_enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password \"Kadir123\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.i_enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Popup window",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickOnPopupWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Home Page Link",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickOnHomePageLink()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "input \"Bright Company\" and \"New Work Design\" and \"GoodTag\" to Content Title",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.inputAndAndToContentTitle(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on post",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickOnPost()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify \"Bright Company\" content and \"GoodTag\" tag",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.verifyContentAndTag(String,String)"
});
formatter.result({
  "error_message": "org.junit.ComparisonFailure: expected:\u003c[Bright Company / GoodTag]\u003e but was:\u003c[]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:117)\r\n\tat org.junit.Assert.assertEquals(Assert.java:146)\r\n\tat stepDefinitions.MainTestSteps.verifyContentAndTag(MainTestSteps.java:232)\r\n\tat ✽.verify \"Bright Company\" content and \"GoodTag\" tag(file:homepage.feature:12)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "click on post make comment \"nice sharing\" and \"share more\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickOnPostMakeCommentAndReply(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "like the comment and verify counter as \"1\" with double click",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.likeTheCommentAndVerifyCounterAsWithDoubleClick(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I edit the post \"titleChanged\" with \"contentChanged\" with \"extraTag\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.iEditThePostWithWith(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on the link",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.iClickOnTheLink()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "come back to UpFounders page",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.comeBackToUpFoundersPage()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on home page again",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickOnHomePageAgain()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "like the post",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.likeThePost()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify the like counter \"1\" with double click",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.verifyTheLikeCounter(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify the change of \"titleChanged\" and \"extraTag\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.verifyTheChangeOfAnd(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "delete the posted note",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.deleteThePostedNote()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "post a video with title \"New Video\" and link \"https://www.youtube.com/watch?v\u003dStunPx5Jk-8\" and tag name \"VideoTag\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.postAVideoWithTitleAndLinkAndTagName(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "delete the posted note again",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.deleteThePostedNoteAgain()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "I click on logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.i_click_on_logout_link()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
formatter.write("Access to All Home Page Functionalities");
formatter.after({
  "status": "passed"
});
formatter.uri("file:loginpage.feature");
formatter.feature({
  "name": "login page",
  "description": "  Description: validate login page function",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "user attempt to login wihtout any cridential",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "MainTestSteps.i_open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the resourceful application",
  "keyword": "When "
});
formatter.match({
  "location": "MainTestSteps.i_navigate_to_the_resourceful_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "empty email error message \"Email is required\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.empty_email_error_message_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "user enter wrong email format",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "MainTestSteps.i_open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the resourceful application",
  "keyword": "When "
});
formatter.match({
  "location": "MainTestSteps.i_navigate_to_the_resourceful_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.iClickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name \"mytest$outlook.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.i_enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "error message \"Invalid email\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.error_message_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "user attempt to login without password",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "MainTestSteps.i_open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the resourceful application",
  "keyword": "When "
});
formatter.match({
  "location": "MainTestSteps.i_navigate_to_the_resourceful_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name \"abd.akti@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.i_enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "login failure message \"Password is required\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.login_failure_message_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verify unregistered accounts",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "name": "I navigate to the resourceful application",
  "keyword": "When "
});
formatter.step({
  "name": "I enter user name \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "not account found \"No Account Found\" should be displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "abd.akti23@gmail.com",
        "Mavibeyaz251"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verify unregistered accounts",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "MainTestSteps.i_open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the resourceful application",
  "keyword": "When "
});
formatter.match({
  "location": "MainTestSteps.i_navigate_to_the_resourceful_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name \"abd.akti23@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.i_enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password \"Mavibeyaz251\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.i_enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "not account found \"No Account Found\" should be displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.not_account_found_should_be_displayed(String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "verify registered accounts",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "name": "I navigate to the resourceful application",
  "keyword": "When "
});
formatter.step({
  "name": "I enter user name \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "click on Popup window",
  "keyword": "And "
});
formatter.step({
  "name": "I click on logout link",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "gilman.dallas@gmail.com",
        "Kadir123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "verify registered accounts",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "MainTestSteps.i_open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the resourceful application",
  "keyword": "When "
});
formatter.match({
  "location": "MainTestSteps.i_navigate_to_the_resourceful_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name \"gilman.dallas@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.i_enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password \"Kadir123\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.i_enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Popup window",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickOnPopupWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I click on logout link",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.i_click_on_logout_link()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("file:storypage.feature");
formatter.feature({
  "name": "story page",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Access to All Story Page Functionalities",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.step({
  "name": "I navigate to the resourceful application",
  "keyword": "When "
});
formatter.step({
  "name": "I enter user name \"\u003cemail\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "I enter password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "click on Popup window",
  "keyword": "And "
});
formatter.step({
  "name": "go to Analytics tab and verify message \"Coming soon!\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on Story page dash board tab",
  "keyword": "And "
});
formatter.step({
  "name": "verify Newsletter random Email \"gilman@22mail.com\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify Inbox iframe title \"Inbox\" and name \"gilman\"",
  "keyword": "And "
});
formatter.step({
  "name": "go to personal Story link and verify \"kadir gilman junior\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify page title \"https://upfounders-staging.herokuapp.com/story/kgilman\"",
  "keyword": "And "
});
formatter.step({
  "name": "input fb \"www.facebook.com/heliman\" and tw \"www.twitter.com/heliman\" and linkedln \"www.linedln.com/heliman\"",
  "keyword": "And "
});
formatter.step({
  "name": "sign up \"gilman.dallas@gmail.com\" for newsletter and verify \"You\u0027ve successfully subscribed to newsletter.\" success message",
  "keyword": "And "
});
formatter.step({
  "name": "change Our Story content \"We are a new company\" and attach video link \"https://www.youtube.com/watch?v\u003dStunPx5Jk-8\"",
  "keyword": "And "
});
formatter.step({
  "name": "input About Us \"We want to success\"",
  "keyword": "And "
});
formatter.step({
  "name": "click on first action button and send action invitation to \"gilman\" and \"sales@unitextech.com\" with \"please join us\" message",
  "keyword": "And "
});
formatter.step({
  "name": "delete second act label click on add action button to create new action label as \"LOOKING FOR INVESTOR\" with content as \"WE NEED STARTUP INVESTMENT\"",
  "keyword": "And "
});
formatter.step({
  "name": "verify newly created action label \"LOOKING FOR INVESTOR\"",
  "keyword": "And "
});
formatter.step({
  "name": "click save and go to preview verify \"We want to success\" and take screenshot",
  "keyword": "And "
});
formatter.step({
  "name": "click publish and verify successfull message \"Your story page Url: https://upfounders-staging.herokuapp.com/story/gkadir\"",
  "keyword": "And "
});
formatter.step({
  "name": "click the link and verify page url \"https://upfounders-staging.herokuapp.com/story/gkadir\"",
  "keyword": "And "
});
formatter.step({
  "name": "go to share your story link and verify \"https://upfounders.co/join-waitinglist-s/\" link",
  "keyword": "And "
});
formatter.step({
  "name": "verify page header \"Sign Up\" and input name \"Gilman\" and email \"gilman.dallas@gmail.com\"",
  "keyword": "And "
});
formatter.step({
  "name": "click UpFounders logo link and verify page url as \"https://upfounders.co/\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ]
    },
    {
      "cells": [
        "gilman.dallas@gmail.com",
        "Kadir123"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Access to All Story Page Functionalities",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "I open the browser",
  "keyword": "Given "
});
formatter.match({
  "location": "MainTestSteps.i_open_the_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigate to the resourceful application",
  "keyword": "When "
});
formatter.match({
  "location": "MainTestSteps.i_navigate_to_the_resourceful_application()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter user name \"gilman.dallas@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.i_enter_user_name(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter password \"Kadir123\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.i_enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.click_on_login_button()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Popup window",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickOnPopupWindow()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "go to Analytics tab and verify message \"Coming soon!\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.goToAnalyticsTabAndVerifyMessage(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on Story page dash board tab",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickOnStoryPageDashBoardTab()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "verify Newsletter random Email \"gilman@22mail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.verifyNewsletterFirstEmail(String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"//mat-cell[contains(.,\u0027gilman@22mail.com\u0027)]\"}\n  (Session info: chrome\u003d87.0.4280.88)\nFor documentation on this error, please visit: https://www.seleniumhq.org/exceptions/no_such_element.html\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027GROUPBRIGHT\u0027, ip: \u0027192.168.0.111\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 87.0.4280.88, chrome: {chromedriverVersion: 87.0.4280.88 (89e2380a3e36c..., userDataDir: C:\\Users\\ibm\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:51476}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: afa016501c25e3d8da434bb7b9b6a997\n*** Element info: {Using\u003dxpath, value\u003d//mat-cell[contains(.,\u0027gilman@22mail.com\u0027)]}\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:323)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElementByXPath(RemoteWebDriver.java:428)\r\n\tat org.openqa.selenium.By$ByXPath.findElement(By.java:353)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:315)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:69)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:38)\r\n\tat com.sun.proxy.$Proxy22.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:50)\r\n\tat java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:193)\r\n\tat java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:948)\r\n\tat java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:482)\r\n\tat java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:472)\r\n\tat java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:708)\r\n\tat java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:499)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:484)\r\n\tat pageObject.StoryPage.verifyNewsletterSignUps(StoryPage.java:225)\r\n\tat stepDefinitions.MainTestSteps.verifyNewsletterFirstEmail(MainTestSteps.java:442)\r\n\tat ✽.verify Newsletter random Email \"gilman@22mail.com\"(file:storypage.feature:13)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "verify Inbox iframe title \"Inbox\" and name \"gilman\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.verifyInboxIframeTitle(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "go to personal Story link and verify \"kadir gilman junior\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.goToPersonalStoryLink(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify page title \"https://upfounders-staging.herokuapp.com/story/kgilman\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.verifyPageTitle(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "input fb \"www.facebook.com/heliman\" and tw \"www.twitter.com/heliman\" and linkedln \"www.linedln.com/heliman\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.inputFbAndTwAndLinkedln(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "sign up \"gilman.dallas@gmail.com\" for newsletter and verify \"You\u0027ve successfully subscribed to newsletter.\" success message",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.signUpForNewsletterAndVerifySuccessMessage(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "change Our Story content \"We are a new company\" and attach video link \"https://www.youtube.com/watch?v\u003dStunPx5Jk-8\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.changeOurStoryContentAndAttachVideoLink(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "input About Us \"We want to success\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.inputAboutUs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click on first action button and send action invitation to \"gilman\" and \"sales@unitextech.com\" with \"please join us\" message",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickOnActionButtonAndSendActionInvitationToAndWithMessage(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "delete second act label click on add action button to create new action label as \"LOOKING FOR INVESTOR\" with content as \"WE NEED STARTUP INVESTMENT\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.deleteSecondActLabelClickOnAddActionButtonToCreateNewActionLabelAsWithContentAs(String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify newly created action label \"LOOKING FOR INVESTOR\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.verifyNewlyCreatedActionLabel(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click save and go to preview verify \"We want to success\" and take screenshot",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickSaveAndGoToPreviewAndTakeScreenshot(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click publish and verify successfull message \"Your story page Url: https://upfounders-staging.herokuapp.com/story/gkadir\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickPublishAndVerifySuccessfullMessage(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click the link and verify page url \"https://upfounders-staging.herokuapp.com/story/gkadir\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickTheLinkAndVerifyPageUrl(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "go to share your story link and verify \"https://upfounders.co/join-waitinglist-s/\" link",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.goToShareYourStoryLinkAndVerifyLink(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "verify page header \"Sign Up\" and input name \"Gilman\" and email \"gilman.dallas@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.verifyPageHeaderAndInputNameAndEmail(String,String,String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "click UpFounders logo link and verify page url as \"https://upfounders.co/\"",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.clickUpFoundersLogoLinkAndVerifyPageUrlAs(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded1.png", null);
formatter.write("Access to All Story Page Functionalities");
formatter.after({
  "status": "passed"
});
});