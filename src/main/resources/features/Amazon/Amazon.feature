Feature: Testing amazon Search functionality.
  Scenario: Positive scenario for amazon search
    Given User navigates to Amazon
    When user search for iPhone 13 case
    Then User sees more than 40k results on the top
    And User validates that all results contains iPhone in headers