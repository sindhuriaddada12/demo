@login
Feature: test login page with all possible scenarios

  @XRAY-1 @XRAY-4
  Scenario Outline: verify user can login with valid login details
    Given I am on login page
    When I enter "<username>" "<password>"
    And I click on submit button
    Then I will navigate to home page

    Examples:
      | username      | password      |
      | validUserName | validPassword |


  @XRAY-2 @XRAY-4
  Scenario Outline: verify user cannot login with invalid login details
    Given I am on login page
    When I enter "<username>" "<password>"
    And I click on submit button
    Then "<errorMessage>" should be displayed on login screen

    Examples:
      | username        | password        | errorMessage       |
      | invalidUsername | validPassword   | user name invalid  |
      | validUsername   | invalidPassword | Incorrect password |


  @XRAY-3 @XRAY-4
  Scenario Outline: A failed test for Xray demo
    Given I am on login page
    When I enter "<username>" "<password>"
    And I click on submit button
    Then Fail this test

    Examples:
      | username | password |
      | invalid  | valid    |
      | valid    | invalid  |

