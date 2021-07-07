Feature: Application Login
Scenario: Home Page default login
Given User is on netbanking landing page
When User login into application with username and password
Then HomePage is populated
And Cards are displayed