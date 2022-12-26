Feature: Automate the AdactinHomePage

  Scenario Outline: Validate the Login Page
    Given Open the Adactin url
    When user enter the "<username>" and "<password>"
    Then user clicks the Login button
    And Login Succefull

    Examples: 
      | username     | password    |
      | Arulpragasam | Arulgreat@7 |

  Scenario Outline: Verify the Search Hotel Page
    When user select the "<location>" and "<Hotels>" and "<RoomType>" and "<Number of Rooms>" and "<Check in Date>" and "<Check out Date>" and "<Adults Room>" and "<Children per room>"
    And Click search button

    Examples: 
      | location | Hotels | RoomType | Number of Rooms | Check in Date | Check out Date | Adults Room | Children per room |
      | Sydney   | Creek  | Standard | 2 - Two         | 01/02/2022    | 02/02/2022     | 3 - Three   | 4 - Four          |

  Scenario: Verify the Select Hotel Page
    When User Select the Hotel
    Then click the continue button

  Scenario Outline: Verify the Book A Hotel Page
    When user select "<First name>" and "<Last Name>" and "<Billing Address>" and  "<Credit Card Number>"and "<Credit Card Type>" and "<Select Month>" and  "<Select Year>" and  "<CVV Number>"
    Then Click Book now button

    Examples: 
      | First name   | Last Name    | Billing Address | Credit Card Number | Credit Card Type | Select Month | Select Year | CVV Number |
      | Arulpragasam | Mathiyalagan | Andipalayam     |  12345678901234567 | VISA             | January      |        2020 |       1234 |

  Scenario: Booking Confirmation
    When user enter the book now button
    Then verify the order ID
