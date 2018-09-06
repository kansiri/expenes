Feature: Income
  As a user
  I want to add and view income
  so that I know how much money I have


  Scenario: Add income
    Given a user has 2000 baht
    When I add income 500 baht
    Then I have income amount 2500 baht


  Scenario:  Pay a money less than income
    Given a user has 2000 baht
    When I pay a money 600 baht
    Then I have money income amount 1400 baht
    And my disbursement is 600 baht

  Scenario: Pay a money greater than income
    Given a user has 2000 baht
    When I pay a money 2100 baht
    Then I have money income amount 0 baht

  Scenario: Check income
    Given a user has 2000 baht
    When I want to check my income that is 2000 baht
    Then System show my income amount 2000 baht

  Scenario: Check disbursement
    Given a user has 2000 baht
    When I pay a money 400 baht
    Then System show disbursement amount 400 baht