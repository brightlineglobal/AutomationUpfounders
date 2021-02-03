  Feature: story page
  Scenario Outline: Access to All Story Page Functionalities
  Given I open the browser
  When I navigate to the resourceful application
  And I enter user name "<email>"
  And I enter password "<password>"
  And click on login button
  #And click on Popup window
  And click on Story Page Link
    And click on Popup window
  And go to Analytics tab and verify message "Coming soon!"
  And click on Story page dash board tab
  And verify "Email" in newsletter signups and first Email address
  And verify Inbox iframe title "Inbox" and name "ghlema kader"
  And go to personal Story link and verify "kadir gilman juniors"
  And verify page title "https://upfounders-staging.herokuapp.com/story/kgilman"
  And input fb "www.facebook.com/heliman" and tw "www.twitter.com/heliman" and linkedln "www.linedln.com/heliman"
  And sign up "gilman.dallas@gmail.com" for newsletter and verify "You've successfully subscribed to newsletter." success message
  And change Our Story content "We are a new company" and attach video link "https://www.youtube.com/watch?v=StunPx5Jk-8"
  And input About Us "We want to success"
  And click on first action button and send action invitation to "gilman" and "sales@unitextech.com" with "please join us" message
  And delete second act label click on add action button to create new action label as "LOOKING FOR INVESTOR" with content as "WE NEED STARTUP INVESTMENT"
  And verify newly created action label "LOOKING FOR INVESTOR"
  And click save and go to preview verify "We want to success" and take screenshot
  And click publish and verify successfull message "Your story page Url: https://upfounders-staging.herokuapp.com/story/gkadir"
  And click the link and verify page url "https://upfounders-staging.herokuapp.com/story/gkadir"
  And go to share your story link and verify "https://upfounders.co/join-waitinglist-s/" link
  And verify page header "Sign Up" and input name "Gilman" and email "gilman.dallas@gmail.com"
  Then click UpFounders logo link and verify page url as "https://upfounders.co/"
  #Then I click on logout link

  Examples:
  |email                     |password   |
  |gilman.dallas@gmail.com   |Kadir123   |