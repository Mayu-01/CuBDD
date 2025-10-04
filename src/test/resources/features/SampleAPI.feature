@test
Feature: Test sample API

  Scenario Outline: Verify the objects
    Given user points to service "eqbhocservice"
    When user having following headers
    | Content-Type | application/json |
#    When user has following body
#    |test.json|
    When user issues "POST" request to "/objects"
    Then status code should be "<code>"
#    Then verify below json values
#    |name|Apple iPad Air|

  Examples:
    |code|
    |200 |

