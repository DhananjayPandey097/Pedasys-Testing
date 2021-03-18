Feature: growth engineering Feature 2nd Part
Scenario: Check that form validation works on the contact page
  Given user is present on home page
  When title of page is GROWTH
  Then user goes to contactUs page
  Then user tries to submit the form without entering any data
  Then user validates if the Formvalidation is working or not on ContactUs page