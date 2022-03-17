Feature: Login Feature

  Background:
    Given User is on Login page
    When User enters "keshavsingh520@gmail.com" and "****"
    And Click on Login button

  @Sanity
  Scenario: Login Test
    Given User is on home page

  @Smoke
  Scenario: Home Page Verification
    Given User is on home page