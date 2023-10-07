Feature: Final Project Feature

  Scenario: Verify Website Functionality
    Given the user is on the website
    When the user logs in
    Then the user performs various actions
    And logs out
    
    Scenario: Take Screenshot
    Given the user is on the website
    When the user takes a screenshot
    Then the screenshot should be saved