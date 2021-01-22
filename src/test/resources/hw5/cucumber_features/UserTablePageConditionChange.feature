Feature: Vip condition for User
  In order to verify User conditions
  As a user
  I want to set up vip condition for the User

  Scenario:User Table Page test

    Given I open JDI GitHub site
    And I login as user "Roman Iovlev"
    And I click on "Service" button in Header
    And I click on "User Table" button in Service dropdown
    When I select 'vip' checkbox for "Sergey Ivan"
    Then 1 log row has "Vip: condition changed to true" text in log section