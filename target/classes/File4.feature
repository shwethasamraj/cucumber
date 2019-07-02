Feature: Test Background Keyword
Background: display welcome
Given Application displays welcome message
@smoke @regression
Scenario: SignIn
Given user un and pass
And click signin
@smoke
Scenario: Search for the product
When user searches for iphone
@regression
Scenario: add to cart
When user adding the searched product to cart
@regression
Scenario: payment process
When user performing payment process using netbanking
@smoke
Scenario: Signout
When user logout
