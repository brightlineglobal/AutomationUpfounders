Feature: content page
  Scenario Outline: Access to All Content Page Functionalities
    Given I open the browser
    When I navigate to the resourceful application
    And I enter user name "<email>"
    And I enter password "<password>"
    And click on login button
    #And click on Popup window
    And click on content page and verify page Title "UpFounders"
    And click on Link tab and verify
    Then click on first link in My Links and verify page title "Global Link"
    Then verify shared link and verify page title "Global Link"
    Then go to Notes tab
    Then verify my Notes with "#Testing" tag and "New Page" content
    And verify shared Notes and verify like counter
    Then add new link using Add icon with link name "amazon" url "https://www.amazon.com" and description "testing purpose" and tag "uselfulLink" and verify in shared link tab
    Then add new Note using Add icon with title "Test Note" and description "Test Content" and tag "testTag" and verify in shared note tab
    Then add new Note with Link using Add icon with title "Test Note with Link" and url "https://www.amazon.com" and tag "noteWithLinkTag" and verify in shared note tab
    And delete all three posts
      #Then go to People Page
    #And go to Content page
    Then I click on logout link

    Examples:
      |email                     |password   |
      |gilman.dallas@gmail.com   |Kadir123   |