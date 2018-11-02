Feature: perform operations on numbers

  Scenario Outline: perform operations on numbers
    Given I have number "<a>" and "<b>"
    When when I perform action "<action>"
    Then I verify result "<result>"

    Examples:
      | a | b | action   | result |
      | 3 | 4 | multiply | 12     |
      | 3 | 5 | multiply | 15     |

  @testenv
  Scenario: perform operations on numbers
    Given test env