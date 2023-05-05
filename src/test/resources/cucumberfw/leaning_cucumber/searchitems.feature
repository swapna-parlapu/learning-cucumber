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
@search
Feature: shop items based on search
  

  @smoke @searchsmoke
  Scenario: search of items
    
    And enter productname "nicon" you want to search in the searchbox
    When I click on search Button.
    Then searchdetails page to be displayed.
    
 #@smoke @searchsmoke
  Scenario: search of items from dropdown present in searchbox
  
  And select any product "Electronics" from dropdown present in searchbox 
  When I click on search Button.
  Then Searchdetails page should be displayed