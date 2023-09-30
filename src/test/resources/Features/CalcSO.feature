Feature: Arthimetic Operations

  Scenario Outline: To perform addition
    Given I launch the calculator app
    When I add <input1> and <input2>
    Then I verify the result is <result>

    Examples:
    |input1|input2|result|
    |5     |5     |10    |
    |15    |15    |30    |
    |25    |25    |50    |
    |100   |100   |100   |

