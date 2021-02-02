Feature:
  In order to apply different settings
  As a user
  I want to select different elements

  Background:
  Given I open JDI GitHub site
  And I login as user "Roman Iovlev"
  And I click on "Service" button in Header

  Scenario: Different Elements Selection Test

    Given I click on "Different Elements Page" button in Service dropdown
    When I select 'Water' checkbox
    And I select 'Wind' checkbox
    And I select 'Selen' radio
    And I select 'Yellow' in Colors dropdown
    Then 1 log row has "'Water': condition changed to true" text in log section
    And 1 log row has "'Wind': condition changed to true" text in log section
    And 1 log row has "metal: value changed to 'Selen'" text in log section
    And 1 log row has "Colors: value changed to 'Yellow'" text in log section