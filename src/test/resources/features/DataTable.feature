Feature: Cucumber Data tables implementation practices


  Scenario: List of fruits and vegetables I like
    Then user should see below list
      | Orange     |
      | apple      |
      | kiwi       |
      | strawberry |
      | tomato     |
      | pear       |
      | eggplant   |
    #to beautify the pipes above
  #mac : command + option+l
  #window : control + alt + L
  #control + d = copy ||

  #Create a new scenarrio where we list of the types of pets we love
  #print out all the string in the list


  Scenario: List of pets that I Like
    Then user should see below animal list
      | Dog    |
      | Cat    |
      | Horse  |
      | Turtle |
      | Birds  |

  Scenario: Officer reads data about driver
    Then officer is able to see any data he wants
      | name    | Jane         |
      | surname | Doe          |
      | age     | 29           |
      | address | somewhere    |
      | state   | FL           |
      | zipcode | 32828        |
      | phone   | 111-111-1111 |


  @dataTable
  Scenario: User should be able to see all 12 months in months
  dropdown
    Given User is on the dropdowns page of practice tool
    Then User should see below info in month dropdown
      | January   |
      | February  |
      | March     |
      | April     |
      | May       |
      | June      |
      | July      |
      | August    |
      | September |
      | October   |
      | November  |
      | December  |



