Feature: Login

Background:
   Given I open https://katalon-demo-cura.herokuapp.com/
   
  @test
    Scenario Outline: Login User Using Incorrect Username And Correct Password
    When I Fill in incorrect username <username> and correct password <password>
    And I Click Button Login
    Then I See Messages Error Login failed! Please ensure the username and password are valid.
    Examples: 
      | username | password           |
      | Achmad Fardhony | ThisIsNotAPassword |
      
   Scenario Outline: Login User Using Correct Username And Incorrect Password
    When I Fill in correct username <username> and incorrect password <password>

    Examples: 
      | username | password           |
      | John Doe | TashaNarulita    | 
      
  Scenario Outline: Login User Using Incorrect Username And Incorrect Password
    When I Fill in incorrect username <username> and incorrect password <password>
	
    Examples: 
      | username        | password           |
      | Achmad Fardhony | Tasha Narulita    |
  
  Scenario Outline: Login User Using Correct Username And Password
    When I Fill in Correct username <username> and Correct password <password>
    And I Click Button Login
    Then Navigate To Apointment Page

    Examples: 
      | username | password           |
      | John Doe | ThisIsNotAPassword |