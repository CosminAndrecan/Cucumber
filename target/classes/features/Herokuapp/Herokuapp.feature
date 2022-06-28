@herokuapp
Feature: Herokuapp categories functionality

  Scenario Outline: Validation title of Herockuapp subcategories links
    Given User navigates to 'https://the-internet.herokuapp.com/'
    When User clicks on '<link>'
    Then User validates the '<url>' of the page
    Examples:
      | link           |  | url                                                      |
      | Testing        |  | https://the-internet.herokuapp.com/abtest                |
      | Elements       |  | https://the-internet.herokuapp.com/add_remove_elements/  |
      | Basic          |  | https://the-internet.herokuapp.com/basic_auth            |
      | Broken         |  | https://the-internet.herokuapp.com/broken_images         |
      | Challenging    |  | https://the-internet.herokuapp.com/challenging_dom       |
      | Checkboxes     |  | https://the-internet.herokuapp.com/checkboxes            |
      | Context        |  | https://the-internet.herokuapp.com/context_menu          |
      | Authentication |  | https://the-internet.herokuapp.com/digest_auth           |
      | Disappearing   |  | https://the-internet.herokuapp.com/disappearing_elements |
      | Drag           |  | https://the-internet.herokuapp.com/drag_and_drop         |
