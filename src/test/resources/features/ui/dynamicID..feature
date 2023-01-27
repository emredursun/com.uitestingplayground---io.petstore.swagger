#UI Test Automation Playground
# Dynamic ID
#   Scenario
#    Record button click.
#     Then execute your test to make sure that ID is not used for button identification.


@ui @DynamicID
Feature: Dynamic ID

  Scenario: Testing that ID is not used for button identification
    Given I am on the home page
    When I click to 'Dynamic ID' link
    Then I verify that the page title is 'Dynamic ID'
    When I save the value of the 'Button with Dynamic ID' button's 'id' attribute
    When I refresh the page
    Then I verify that the value of 'Button with Dynamic ID' button's 'id' attribute is different