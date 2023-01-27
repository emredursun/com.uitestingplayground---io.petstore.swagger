#UI Test Automation Playground
# Click
#   Scenario
#     Record button click. The button becomes green after clicking.
#      Then execute your test to make sure that it is able to click the button.

@ui @Click
Feature: Click

  Scenario: Testing that the initial button color is changed
    Given I am on the home page
    When I click to 'Click' link
    Then I verify that the page title is 'Click'
    When I save the color value of the 'Button That Ignores DOM Click Event' button
    And I click to 'Button That Ignores DOM Click Event' button
    Then I verify that the color is changed