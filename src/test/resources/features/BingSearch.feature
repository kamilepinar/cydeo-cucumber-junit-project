Feature: Bing search functionality
  Agile story: As a user, when I am on the Bing search page
  I should be able to search anything and see relevant result

  #@wip
  Scenario: Search result title verification
    Given user is on the Bing search page
    When user enters orange in Bing search box
    Then user should see orange in title

  Scenario: Search result title verification
    Given user is on the Bing search page
    When user enters "Orange" in Bing search box
    Then user should see "orange - Search" in title