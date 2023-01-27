#UI Test Automation Playground
# Verify Text
#   Scenario
#     Create a test that finds an element with Welcome... text.

@ui @VerifyText
Feature: Verify Text

  Scenario: Testing that there is an element with 'Welcome' text
    Given I am on the home page
    When I click to 'Verify Text' link
    Then I verify that the page title is 'Verify Text'
    And I verify that 'Welcome' text is displayed