@api @store
Feature: Store

  @deleteStore
  Scenario: Post request for Store Order
    When I send POST request to store endpoint with following store data:
      | id | petId | quantity | shipDate                 | status | complete |
      | 13 | 10    | 2        | 2023-01-25T14:33:41.176Z | placed | true     |

    Then status code is 200

    And response body for creating store order should be:
      | id | petId | quantity | shipDate                     | status | complete |
      | 13 | 10    | 2        | 2023-01-25T14:33:41.176+0000 | placed | true     |
