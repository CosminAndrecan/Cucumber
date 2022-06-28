#Feature: Login Functionality of WebOrder Page
#  Scenario: Validation of WebOrder Login scenario (positive)
#    Given User navigates to WebOrder
#    When User provides correct 'guest1@microworks.com' and 'Guest1!' (credentials) for WebOrder
#    Then User validate the 'ORDER DETAILS - Weborder' from homepage
#
#  Scenario: Validation of WebOrder Login scenario (negative)
#    Given User navigates to WebOrder
#    When User provides correct email 'guest1@microworks.com' and wrong pswd 'Guest1' for WebOrder
#    Then User validate the 'Sign in Failed' message
#
#  Scenario: Validation of WebOrder Login scenario (negative1)
#    Given User navigates to WebOrder
#    When User provides wrong username 'guest@microworks.com' and correct pswd 'Guest1!' for WebOrder
#    Then User validate the 'Sign in Failed' message
#
#  Scenario: Validation of WebOrder Login scenario (negative2)
#    Given User navigates to WebOrder
#    When User doesn't provide any email '' and password '' for WebOrder
#    Then User validate the 'Sign in Failed' message