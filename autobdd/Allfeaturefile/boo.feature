Feature: buy online t-shirt

  Scenario: login the flipkart application
    Given login the t-shirt section
    When follow the information
      | size | colors | price |
    And select the t-shirt size and color
