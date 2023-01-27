@api @user
Feature: User

  @deleteUser
  Scenario: Post request for user
    When I send POST request to user endpoint with following user data:
      | id | username | firstName | lastName | email                | password | phone       | userStatus |
      | 11 | EmreNL   | Emre      | Dursun   | emredursun@gmail.com | 13579    | 05367852245 | 1          |
    Then status code is 200

    And response body for creating user should be:
      | code | type    | message |
      | 200  | unknown | 11      |
