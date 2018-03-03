	Feature: Test Search functionality within Argos website 
	
	#Background: Given I am on Argos Home Page
	
	#Scenario: Search functionality
 	#When I enter "chair" in search field
 	#And I click on  "searchButton"
 	#Then I should see "Results for chair"
 
 	Scenario Outline: Verify data driven search functionality
 	Given I am on Argos Home Page
 	When I enter "<product>" in search field
 	And I click on  searchButton
 	Then I should see "<Search results>"
 	Examples:
	| product		| Search results  |
	| Watch 		| Results for watch|
	|Samsung		| Samsung \| Go Argos|
	| EPILATOR 		|Results for epilator in Health and beauty, Ladies' hair removal and waxing, Epilators|
	|BULBS 			| Results for bulbs in Home and garden, Lighting, Light bulbs|
 