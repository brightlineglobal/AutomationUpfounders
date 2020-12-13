$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:homepage.feature");
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
  "name": "verify the change of \"titleChanged\" and \"GoodTag\"",
  "keyword": "And "
});
formatter.step({
  "name": "delete the posted note",
  "keyword": "And "
});
formatter.step({
  "name": "logout",
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
  "status": "passed"
});
formatter.step({
  "name": "click on post make comment \"nice sharing\" and \"share more\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.clickOnPostMakeCommentAndReply(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "like the comment and verify counter as \"1\" with double click",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.likeTheCommentAndVerifyCounterAsWithDoubleClick(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I edit the post \"titleChanged\" with \"contentChanged\" with \"extraTag\"",
  "keyword": "And "
});
formatter.match({
  "location": "MainTestSteps.iEditThePostWithWith(String,String,String)"
});
formatter.result({
  "error_message": "org.openqa.selenium.ElementNotInteractableException: element not interactable\n  (Session info: chrome\u003d86.0.4240.198)\nBuild info: version: \u00273.141.59\u0027, revision: \u0027e82be7d358\u0027, time: \u00272018-11-14T08:17:03\u0027\nSystem info: host: \u0027GROUPBRIGHT\u0027, ip: \u0027192.168.0.106\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u00271.8.0_241\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 86.0.4240.198, chrome: {chromedriverVersion: 86.0.4240.22 (398b0743353ff..., userDataDir: C:\\Users\\ibm\\AppData\\Local\\...}, goog:chromeOptions: {debuggerAddress: localhost:64416}, javascriptEnabled: true, networkConnectionEnabled: false, pageLoadStrategy: normal, platform: WINDOWS, platformName: WINDOWS, proxy: Proxy(), setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:virtualAuthenticators: true}\nSession ID: 15b5d7a014bbe969fcd839fa375c478c\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)\r\n\tat java.lang.reflect.Constructor.newInstance(Constructor.java:423)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:187)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:122)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:49)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:158)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:83)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:552)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:285)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.click(RemoteWebElement.java:84)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)\r\n\tat sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)\r\n\tat sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)\r\n\tat java.lang.reflect.Method.invoke(Method.java:498)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:51)\r\n\tat com.sun.proxy.$Proxy21.click(Unknown Source)\r\n\tat pageObject.HomePage.editNote(HomePage.java:609)\r\n\tat stepDefinitions.MainTestSteps.iEditThePostWithWith(MainTestSteps.java:294)\r\n\tat ✽.I edit the post \"titleChanged\" with \"contentChanged\" with \"extraTag\"(file:homepage.feature:15)\r\n",
  "status": "failed"
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
  "name": "verify the change of \"titleChanged\" and \"GoodTag\"",
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
  "name": "logout",
  "keyword": "Then "
});
formatter.match({
  "location": "MainTestSteps.logout()"
});
formatter.result({
  "status": "skipped"
});
formatter.embedding("image/png", "embedded0.png", null);
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
});