Feature: Jaba Talks Application


  Scenario Outline: Check account creation functionality 
    Given Launch the URL
    And Verify if dropdown has "English" and "Dutch"
    When user enters "<full_name>" in full name text box 
    And "<organization_name>" in organization name text box  
    And "<email>" in Email text box  
    Then Click on agree check box 
    And Click on Get Started button 
    And Verify if email send message is displayed  


    Examples: 
      | full_name  				| organization_name | email  			| 	
      | Kumari Raina			|	     CTS 					| raina@g.com |
    