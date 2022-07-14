Feature: Wikipedia Search Functionality Title Verification
Background:
  Given User is on Wikipedia home page
  When User types "Steve Jobs" in the wiki search box
  And User clicks wiki search button
 @Clever
  Scenario: As a user , I should be able to see "Steve Jobs" is in the wiki title


    Then User sees "Steve Jobs" is in the wiki title

 @Stupid
   Scenario: Wikipedia Search Functionality Title Verification

     Then  User sees "Steve Jobs" is in the main header

