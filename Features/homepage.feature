Feature: home page
  Scenario Outline: Access to All Home Page Functionalities
    Given I open the browser
    When I navigate to the resourceful application
    And I enter user name "<email>"
    And I enter password "<password>"
    And click on login button
    #And click on Popup window
    And click on Home Page Link
    And input "Bright Company" and "New Work Design" and "GoodTag" to Content Title
    And click on post
    And verify "Bright Company" content and "GoodTag" tag
    And click on post make comment "nice sharing" and "share more"
    And like the comment and verify counter as "1" with double click
    And I edit the post "titleChanged" with "contentChanged" with "extraTag"
    And I click on the link
    And come back to UpFounders page
    And click on home page again
    And like the post
    And verify the like counter "1" with double click
    And verify the change of "titleChanged" and "extraTag"
    And delete the posted note
    And post a video with title "New Video" and link "https://www.youtube.com/watch?v=StunPx5Jk-8" and tag name "VideoTag"
    And delete the posted note again
      #Then go to People Page
    #And go to Content page
    Then I click on logout link

    Examples:
      |email                     |password   |
      |gilman.dallas@gmail.com   |Kadir123   |