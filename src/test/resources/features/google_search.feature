Feature: Google Search Functionality Title Verification


  User story: As a user , when i am on the Google search page
  I should be able to search whatever I want and see relevant information


  Scenario: Search functionality title verification


    Given User is on Google search page
    When User types apple in the google search box and clicks enter
    Then User sees apple – Google Search is in the google title

@smoke
  Scenario: Search  functionality  result title verificition
    Given User is on Google search page
    When User types "apple" in the google search box and clicks enter
    Then User sees "apple – Google Search" is in the google title