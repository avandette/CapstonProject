
Feature: Desktops

	@desktopTest
  Scenario: User verify all items are present in Desktops tab
    Given user is on Retail home Page
    When User click on Desktops tab
    And User click on Show all desktops
    Then User should see all items are present in Desktop page
  
  
  
  
  
  
Scenario: Validate the price of MacBook Pro is 2000
Given User is on Retail website
When User click on Laptop & NoteBook tab
And User click on Show all Laptop & NoteBook option
And User click on ‘MacBook Pro’ item
Then User should see ‘$2,000.00’ price tag is present on UI