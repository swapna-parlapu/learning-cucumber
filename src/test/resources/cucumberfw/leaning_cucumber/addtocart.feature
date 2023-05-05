#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@tag
Feature: items add to cart
  

  @tag1
  Scenario: items added to cart from homepage
   Given I am on homepage
    When I click on "Samsung Galaxy M14 5G".
    And we are taken to "Samsung Galaxy M14 5G" page.
    And click on add to cart.
    Then item should be added to cart.

 