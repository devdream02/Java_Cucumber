Feature: Sample feature file

  Scenario: First sceanrio
    Given : I am on google homepage
    When : I enter the data to be searched
      | Field | Value    |
      | Item  | cucumber |
    And : I click on the search button
    Then : I should see the result
