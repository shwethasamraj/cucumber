Feature: SignUp
Scenario Outline: test signup function with different set of input

Given user opens signup page
When user enters fn as "<firstname>"
And user enters ln as "<lastname>"
And user enters dob as "<dob>"
And user enters psd as "<password>"
And user enters cnfrmpass as "<confirmpassword>"
Then click signup button
And verify signup success message

Examples: 
|firstname|lastname|dob|password|confirmpassword|
|shwetha|samraj|09-07-1997|shwe123|shwe123|
|abc|def|01-01-2010|abc123|abc123|