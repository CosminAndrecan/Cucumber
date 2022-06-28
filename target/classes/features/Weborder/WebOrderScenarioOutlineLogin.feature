@web
Feature: WebOrder Login Functionality with Scenario Outline

  Background:
    Given User navigates to WebOrder

  Scenario: Validation of WebOrder Login scenario (positive)
#Given User navigates to WebOrder
    When User provides credentials ' guest1@microworks.com' and 'Guest1!' for WebOrder
    Then User validate the 'ORDER DETAILS - Weborder' from homepage

  Scenario Outline: Validation of WebOrder Login scenario negative
    When User provides credentials '<userName>' and '<password>' for WebOrder
    Then User validate the '<message>' message
    Examples:
#    convert this format into scenario outline  Add 9 different negative scenarios

      | userName              | password | message        |
      | guest1@microworks.com | Guest1   | Sign in Failed |
      | guest1@microwork.com  | Guest1!  | Sign in Failed |
      |                       |          | Sign in Failed |
      | 21321@gmail.com       | Guest1   | Sign in Failed |
      | gue1@we.com           | Gues     | Sign in Failed |
      | 1232@gmail.com        | 213423   | Sign in Failed |
      