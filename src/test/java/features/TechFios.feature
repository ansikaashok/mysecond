 Feature: TechFios Billing Login Functionality

 Scenario: User should be able to login with valid credentials
 Given User is on the Techfios login page
 When user enters username as "demo@techfios.com"
 When USer enters the password as "abc123"
 When User Clicks signin Button
 Then USer should land on the dashboard page
 
 