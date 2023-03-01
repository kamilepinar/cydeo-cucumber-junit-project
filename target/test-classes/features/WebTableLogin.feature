Feature: Web table app login functionality
  Agile Story: User should be able to login with valid credentials

 # @wip
  Scenario: Positive login scenario
    Given User is on the Web table login page
    When user enters correct username
    And users enters correct password
    And users click to login button
    Then users should see orders word in the URL

  Scenario: Positive login scenario
    Given User is on the Web table login page
    When user enters "Test" username and "Tester" password
    And users click to login button
    Then users should see orders word in the URL

    # cntrl+option+L beautify
  Scenario: Positive login scenario
    Given User is on the Web table login page
    When user enter below correct credentials
      | username | Test   |
      | password | Tester |
    And users click to login button
    Then users should see orders word in the URL