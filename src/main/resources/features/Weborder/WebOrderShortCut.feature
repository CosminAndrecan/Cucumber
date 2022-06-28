@regression @smoke
Feature: Login Functionality of WebOrder Page
  Background:
    Given User navigates to WebOrder
    @regression @smoke @forfun
  Scenario: Validation of WebOrder Login scenario (positive)
#Given User navigates to WebOrder
    When User provides credentials ' guest1@microworks.com' and 'Guest1!' for WebOrder
    Then User validate the 'ORDER DETAILS - Weborder' from homepage
@regression @ahmet
  Scenario: Validation of WebOrder Login scenario (negative)
 #Given User navigates to WebOrder
    When User provides credentials 'guest1@microworks.com' and 'Guest1' for WebOrder
    Then User validate the 'Sign in Failed' message
@regression
  Scenario: Validation of WebOrder Login scenario (negative1)
   #Given User navigates to WebOrder
    When User provides credentials 'guest@microworks.com' and 'Guest1!' for WebOrder
    Then User validate the 'Sign in Failed' message
@smoke
  Scenario: Validation of WebOrder Login scenario (negative2)
 #Given User navigates to WebOrder
    When User provides credentials '' and '' for WebOrder
    Then User validate the 'Sign in Failed' message
