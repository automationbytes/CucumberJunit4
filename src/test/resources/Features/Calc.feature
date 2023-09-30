Feature: A Simple calc implementation

  Scenario: Add two numbers and verify the results

    Given I launch the calculator app
    When I add 5 and 5
    Then I verify the result is 9

  Scenario: Add two numbers and verify the results

    Given I launch the calculator app
    When I add 5 and 5
    Then I verify the result is 10

  Scenario: Add two numbers and verify the results

    Given I launch the calculator app
    When I add 15 and 15
    Then I verify the result is 30

  Scenario: Add two numbers and verify the results

    Given I launch the calculator app
    When I add 50 and 50
    Then I verify the result is 100



  Scenario: Add two numbers and verify the results

    Given I launch the calculator app
    When I sub  50 and 50
    Then I verify the result is 100