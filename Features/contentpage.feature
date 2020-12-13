Feature: content page
  Scenario Outline: Access to All Content Page Functionalities
    Given I open the browser
    When I navigate to the resourceful application
    And I enter user name "<email>"
    And I enter password "<password>"
    And click on login button
    And click on Popup window
    And click on content page and verify
    And click on Link tab and verify
    Then verify my Links
    Then verify shared link
    Then go to Notes tab
    Then verify my Notes
    And verify shared Notes
    Then add new link using Add icon and verify
    Then add new Note using Add icon and verify



    Examples:
      |email                     |password   |
      |gilman.dallas@gmail.com   |Kadir123   |