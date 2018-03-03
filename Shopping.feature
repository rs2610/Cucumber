	Feature: Shopping Journey 

	Scenario: Should be able to check on Gift cards
	Given I am on Argos Home Page 
	When I should click on "Gift cards"
	Then I will click on "argos-header__logo"
	And I should be able to see "Argos | Same Day Delivery or Faster In-Store Collection"
	When I Key "Tom Ford Perfume" in search field
	And I press "search button" 
	Then I should be able to see "Results for tom ford perfume in Health and beauty, Perfume and aftershaves, Ladies' fragrance"
	Then I will select "Tom Ford Black Orchid Eau de Parfum - 30ml"
	Then I put in  my postcode "HA1 1BD" in "searchbox"
	And click "CHECK"
	Then I go and select "Add to Trolley"
	Then I go and click on "Continue Shopping " on the pop up screen
	And click on the top header link of "TROLLEY"
	Then I decide to go and select "Remove" from the Trolley page 

