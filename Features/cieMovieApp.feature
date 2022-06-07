
@movieapp
Feature: Verify details screen contains Movie Title, Tags, Title Image and Banner Image
  
  Scenario Outline: details screen must inclue all specified details
  
    Given I am on the Cie Movie App homepage
    When I select a movie from the popular list 
   	And verify it contains Movie Title
   	And verify it contains Tags
   	And verify it contains Title Image
   	And verify it contains Banner Image
    Then exit the page once verified




    