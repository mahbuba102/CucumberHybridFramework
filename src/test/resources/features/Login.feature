Feature: Login Feature
  As a QE I want to test Login Feature of USPS

  #Scenario: Successful Login with valid username and password
  #Given User is on homepage
  #When user clicks on login link
  #Then signs in
  Scenario Outline: Successful login with valid username and password
    Given Customer is on Homepage
    When Customer clicks SignIn link on the top of hompage
    And Customer enters  "<username>" and Customer enters "<password>"
    And Customer clicks sign in
    Then Homepage should be shown

    Examples: 
      | username         | password   |
      | MahbubaNimme2020 | Corona2020 |
      | QA2020           | Corona2020 |
