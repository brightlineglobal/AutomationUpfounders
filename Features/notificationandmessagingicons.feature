Feature: Notification Icon and Messaging Icon
  Scenario Outline: Access to All Notification and Messaging icons Functionalities
    Given I open the browser
    When I navigate to the resourceful application
    And I enter user name "<email>"
    And I enter password "<password>"
    And click on login button
    And click on Popup window
    #And click on Notification icon
    And click on messaging icon
    And click on conversation with "ABC EFG E"
    And type "Hello ABC" in chat window
    And scroll up to verify his message "hELLO" in "24 Sep"
    And scroll down to verify my message "Hello ABC"
    Then I click on logout link

    Examples:
      |email                     |password   |
      |gilman.dallas@gmail.com   |Kadir123   |