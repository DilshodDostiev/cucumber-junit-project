Feature:  Google Search Functionality Title Verification
@dataTable
  Scenario: User search for multiple  items

    Given User is on Google search page
    Then User should be able to search for following:
      |java         |
      |selenium     |
      |cucumber bdd |
      |QA automation|
      |data driven  |