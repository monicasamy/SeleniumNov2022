Feature: Create a new Lead in leaftaps application
@Smoke
Scenario Outline: Successful creation of a new lead
Given Enter the username as <Username>
Given Enter the password as <Password>
And click on the login button
And click on the link
And click on Create Lead button
And Enter Company name
And Enter firstname
And Enter lastname
And Enter firstname local
And Enter departmentname
And Enter description
And Enter Primary Mail
When Click on the submit button
Then Verify the title of the page
Examples:
|Username|Password|
|DemoCSR|crmsfa|
@Sanity
Scenario Outline: Negative scenario
Given Enter the username as <Username>
Given Enter the password as <Password>
When click on the login button
Then Verify the title of the page
Examples:
|Username|Password|
|Monica|oppp|