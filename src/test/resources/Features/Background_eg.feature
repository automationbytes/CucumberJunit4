Feature: A Simple calc implementation

#  Background: To launch the calc app
#    Given I launch the calculator app

  Scenario: To add

    When I add 5 and 5
    Then I verify the result is 9

  Scenario: To sub

    When I sub  50 and 50
    Then I verify the result is 100