Feature: Creation of new account in Salesforce Application

Scenario: New Account Creation in Salesforce Application

Given Launth the Salesforce Browser
And Load the Url
And Enter the Username as 'vidyar@testleaf.com'
And Enter the Password as 'Sales@123'
When Click on Login button
Then It Should Enter to the next page
And Click on toggle menu button
And Click on View All 
And Click on Sales from App Launcher
And Click on Accounts tab
And Click on New button 
And Enter 'Dhanalakshmi' as account name 
And Select Ownership as Public
And Click on Save button
Then Verify Account name 
