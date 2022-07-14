Feature: Smart order process

  user story: As a user, when i am in the SmarterBear Tester account, I should be able to fill out information

@Smart
  Scenario: Completing the information on the website
  Given :User is logged into SmartBear Tester account and on Order page
    When :User selects FamilyAlbum from product dropdown
    And : User enters 4 to quantity
    And : User enters John Wick to costumer name
    And :User enters John Wick to costumer name
    And :User enters Kinzie Ave to street
    And :User enters Chicago to city
    And : User enters IL to state
    And :User enters 60056
    And :User selects Visa as card type
    And :User enters 1111222233334444 to card number
    And :User enters 12/22 to expiration date
    And :User clicks process button
    Then : User verifies John Wick is in the list

