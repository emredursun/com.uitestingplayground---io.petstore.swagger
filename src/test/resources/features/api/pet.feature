@api @pet
Feature: Pet

  @deletePet
  Scenario: Post request for pet endpoint
    When I send POST request to pet endpoint with following pet data:
      | id | name    | status    |
      | 3  | Prenses | available |

    Then status code is 200

    And response body for creating pet should be:
      | id | name    | status    |
      | 3  | Prenses | available |