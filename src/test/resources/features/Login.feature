@Regression
Feature: Library app login feature

  As a user, I should be able to login with correct credentials to different accounts.
  And dashboard should be displayed.


  Accounts are: librarian, student, admin

  Background: for each scenario user is  on library login page
    Given user is on the library login page

@librarian  @employee @smoke
  Scenario: Login as librarian
    Given user is on the library login page
    When user enters librarian username
    And user enters librarian password
    Then user should see dashboard
@student @smoke
  Scenario: Login as student
    Given user is on the library login page
    When user enters student username
    And user enters student password
  Then user should see dashboard

@admin
Scenario: Login as admin
  Given user is on the library login page
  When user enters admin username
  And user enters admin password
  Then user should see dashboard