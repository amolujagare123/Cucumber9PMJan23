Feature: all login scenarios

  @login @valid
  Scenario: to test the functionality of login button for valid input
    Given I am on login page
  #  When I enter correct username and correct password
    When I enter username as "admin" and password as "admin"
    And I click on login button
    Then I should land on homepage

  @login @invalid
  Scenario: to test the functionality of login button for invalid input
    Given I am on login page
   # When I enter incorrect username and incorrect password
    When I enter username as "abcd" and password as "xyz"
    And I click on login button
    Then I should get an error

  @login @blank
  Scenario: to test the functionality of login button for blank input
    Given I am on login page
  #  When I enter blank username and blank password
    When I enter username as "" and password as ""
    And I click on login button
    Then I should get another error


  @userReg
  Scenario: to test the functionality of submit button
    Given I am on the user registration page
    When I enter below Data
      | Amol | Ujagare | 7878788 | amol@gmail.com |
    And I click on submit button
    Then User should be submitted


  @subscription
  Scenario Outline: to test the functionality of subscribe button
    Given I am on the subscription page
    When I enter <name> , <email> , <contact>
    And I click on subscribe button
    Then User should be subscribed

    Examples:
      | name     | email              | contact |
      | Renu     | Renu@gmail.com     | 1234567 |
      | Anuja    | Anuja@gmail.com    | 2234567 |
      | Akshay   | Akshay@gmail.com   | 3234567 |
      | Harini   | HArini@gmail.com   | 4234567 |
      | Priyanka | Priyanka@gmail.com | 5234567 |


  @display
  Scenario Outline: to test the functionality of display button
    Given I am on the display page
    When I enter <name> and <company>
    Then user should be displayed

    Examples:
      | name  | company         |
      | Amol  | Scripting Logic |
      | Rahul | TS cars         |
      | Rohit | NJ Client       |
