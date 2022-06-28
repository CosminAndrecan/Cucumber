@productTable
Feature: Validation of Products with Data Table

  Scenario: Validation of New Product Creation
    Given User navigates to product Homepage and clicks Order button with DataTable
      | username | Tester |
      | password | test   |
    When User enters the product information
      | product  | MyMoney |
      | quantity | 4       |
    And User enters the address information
      | name    | Techtorial   |
      | street  | 2200 E Devon |
      | city    | Des Plaines  |
      | state   | IL           |
      | zipcode | 60010        |
    And User enters the payment information
      | cardType    | Visa    |
      | cardNumber | 1234565 |
      | expireDate  | 08/23   |

    Then User validates the success message
      | New order has been successfully added. |
    And User clicks View All Orders and validates

      | product     | MyMoney      |
      | quantity    | 4            |
      | name        | Techtorial   |
      | street      | 2200 E Devon |
      | city        | Des Plaines  |
      | state       | IL           |
      | zipcode     | 60010        |
      | cardType    | Visa         |
      | cardNumber  | 1234565      |
      | expireDate  | 08/23        |