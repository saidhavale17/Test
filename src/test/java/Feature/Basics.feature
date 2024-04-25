
Feature: Facebook login
@smoke
Scenario: Check facebook login
Given User is on login page
When User clicks on sign up
Then User should able to see all details
#Reusability
And user enters firstname "SAI"
 
@chrome
Scenario: Check Instagram login
Given User is on login page
When User clicks on sign up
Then User should able to see all details
#Reusability
And user enters firstname "Ashu" 

#Parameterization: this will be run two times as two sets of parameter are there
Scenario Outline: Check whatsapp login
Given User is on login page
When User clicks on sign up
Then User should able to see all details
And user enters firstname "<firstname>" and lastname "<lastname>"
Examples:
|firstname|lastname|
|Sai      |Dhavale |
|Sai      |Mulay   |

#Regex:user can pass any type of data
Scenario Outline: regex
Given User is on login page
When User clicks on sign up
Then User enters mobile number 98765 and email gmail
Then User enters mobile number "98765" and email "gmail"
Then User enters mobile number "<Mob>" and email "<email>"
Examples:
|Mob|email|
|1234|gmail1|
|4321|gmail2|

#Data driven testing
Scenario: Sign up
Given User is on login page
When User enters
|Sai|
|Mulay|
|9604950849|
|saidhavale17@gmail.com|
Then User should able to see all details
