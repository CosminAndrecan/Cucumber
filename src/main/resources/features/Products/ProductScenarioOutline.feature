@product
Feature: Validation of Products

#  Scenario: Validation of New Product Creation
#    Given User navigates to product Homepage and clicks Order button
#    When User enters the product information 'MyMoney' and '4'
#    And User enters the address information 'Cosmin', 'Midway','Mt Prospect','IL','60077'
#    And User enters the payment information '12234546754321', '12/22','VISA' and process the order
#    Then User validates the success message 'New order has been successfully added.'
#    And User clicks View All Orders and validates and validates 'Name', 'Product','Quantity','Street','City','State','Zip','Card','CardNumber','ExpirationDate'
#
#  Scenario Outline: Validation of New Product Creation
#    Given User navigates to product Homepage and clicks Order button
#    When User enters the product information '<ProductName>' and '<quantity>'
#    And User enters the address information '<CustomerName>', '<Street>','<City>','<State>','<ZipCode>'
#    And User enters the payment information '<CardNumber>', '<ExpireDate>','<CardType>' and process the order
#    Then User validates the success message '<Message>'
#    And User clicks View All Orders and validates '<CustomerName>','<ProductName>','<quantity>','<Street>','<City>','<State>','<ZipCode>','<CardNumber>','<ExpireDate>','<CardType>'
#
#    Examples:
#      | ProductName | quantity | CustomerName | Street | City    | State | ZipCode | CardNumber | ExpireDate | CardType         | Message                                |
#      | MyMoney     | 4        | tom          | scott  | Chicago | IL    | 60188   | 123456789  | 12/24      | Visa             | New order has been successfully added. |
#      | FamilyAlbum | 4        | tom          | scott  | Chicago | IL    | 60188   | 123456789  | 12/24      | MasterCard       | New order has been successfully added. |
#      | ScreenSaver | 4        | tom          | scott  | Chicago | IL    | 60188   | 123456789  | 12/24      | American Express | New order has been successfully added. |