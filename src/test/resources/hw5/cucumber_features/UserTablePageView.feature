Feature: User Table Page
  In order to set different conditions for the user
  As a user
  I want to open User Table page with settings

  Background:
    Given I open JDI GitHub site
    And I login as user "Roman Iovlev"
    When I click on "Service" button in Header
    And I click on "User Table" button in Service dropdown

  Scenario Outline: User Table Page test - verify table

    Then "User Table" page should be opened
    And <Number> Type Dropdowns should be displayed on Users Table on User Table Page
    And "<Username>" should be displayed on Users Table on User Table Page
    And "<Description>" texts under images should be displayed on Users Table on User Table Page
    And 6 checkboxes should be displayed on Users Table on User Table Page
    Examples:
      | Number | Username         | Description                      |
      | 1      | Roman            | Wolverine                        |
      | 2      | Sergey Ivan      | Spider Man                       |
      | 3      | Vladzimir        | Punisher                         |
      | 4      | Helen Bennett    | Captain America some description |
      | 5      | Yoshi Tannamuri  | Cyclope some description         |
      | 6      | Giovanni Rovelli | Hulksome description             |

  Scenario Outline: User Table Page test - verify dropdownlist

    Then "User Table" page should be opened
    And dropdownlist should contain "<value>" in column Type for user "Roman"
    Examples:
      | value   |
      | Admin   |
      | User    |
      | Manager |