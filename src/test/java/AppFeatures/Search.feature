Feature: Amazon Search

Scenario: Search a Product

Given I have a search field on Amazon page
When I search for a producr with name "Apple MacBook Pro" and Price 1000
Then Product with name "Apple MacBook pro" should be displayed
