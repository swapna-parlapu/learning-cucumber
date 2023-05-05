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
Feature:header elements validation

  @tag1
  Scenario: selecting location
    Given I am on homepage
    When I click on Select your address
    And enter "532001" in textbox.
    And And click on apply button.
    Then Select your address should be changed to "532001"
    

  @tag2
  Scenario: selecting language
    Given I am on homepage
    When I click on "EN" symbol.
    And Select languge "HI" radio button from the list
    And click on save
    Then language should be changed to "HI"
 