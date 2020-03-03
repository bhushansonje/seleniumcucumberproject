@Test
Feature: Google Homepage
This feature verifies the functionality of google page


Background:Navigating to google home page
When I open Google Home page

@Smoke
Scenario: Check that main elements present on google page
Then I verify that page displayes with search textbox

@Regression
Scenario: searching text on google
Then I search "selenium" keyword on google home page
