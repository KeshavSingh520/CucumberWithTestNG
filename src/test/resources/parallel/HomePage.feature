
  Feature: Search Functionality
    Background:
      Given User is on Login page
      When User enters "keshavsingh520@gmail.com" and "****"
      And Click on Login button

    Scenario: Search Facebook
      Given User is on home page
      Then User search in search facebook input