
  Feature: Data Drive testing using Scenario Outline
    @google_scenario_outline
    Scenario Outline: Google capital cities research
      Given : user is on Google search page
      When  User search for "<country>" capital
      Then  User should be "<capital>" in the result

      Examples:
      |country          |capital      |
      | Azerbaijan      | Baku        |
      | Tajikistan      | Dushanbe    |
      | China           | Beijing     |
