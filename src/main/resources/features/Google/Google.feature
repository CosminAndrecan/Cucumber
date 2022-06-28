Feature: Testing Google functionality

  Scenario: Happy path Google Search functionality
    Given User navigates to Google
    When User search for Techtorial
    Then User gets more than 10 links on the Google page.
    