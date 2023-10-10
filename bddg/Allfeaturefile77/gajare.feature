Feature: online shopping sell

  Scenario: customer   registration for website
    Given registertation link aviable in webpage
    When customer fill the information
    |name|address|phone|
    |jyoti|pune|9090909|
    |seema|latur|9090907|
    |aranv|latur|8989898|
    |swati|mumbai|878787|
    
    And click the "registrationbutton"and login the website
    Then see the sucess message
    
