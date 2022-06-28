@regression @smoke
Feature: WebOrder page Food Order Functionality
Background:

#  Given User navigates to WebOrder
  Given User provides credentials ' guest1@microworks.com' and 'Guest1!' for WebOrder
  Then User validate the 'ORDER DETAILS - Weborder' from homepage
  And User clicks Group Order box and next button
  And User sends the word 'Test' for Note to Invites part
  And User sends e-mail addresses  which are 'ahmet@gmail.com' and 'berkey@gmail.com' to Invite List

  Scenario: Testing of WebOrder functionality for House
    And User choose delivery address is 'My House' and validates the address '1854 Empire Blvd'
    And User clicks create group order button.
    Then User validates the header of the page is 'View Group Order'
    And User validates total participants is 1.

  Scenario: Testing of WebOrder functionality for Office
    And User choose delivery address is 'Office' and validates the address '2012 EMPIRE BLVD'
    And User clicks create group order button.
    Then User validates the header of the page is 'View Group Order'
    And User validates total participants is 1.




