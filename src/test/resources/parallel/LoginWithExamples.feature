Feature: Login Feature

  @Examples
Scenario Outline: Login With Examples
    Given User is on Login page
    When User enters "<username>" and "<password>"
    And Click on Login button
    Then User is on home page "<title>"

  Examples:
    |username  |password |title|
    |keshavsingh520@gmail.com|***|Facebook|
    |keshavsingh5200@gmail.com|****|Log in to Facebook|


