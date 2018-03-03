Feature: As an Argos customer I should be able to navigate through the Home Page

 Background:
  Given I am on Argos Home page  
  Scenario: Verify Home page title
  Then I should see "Argos | Same Day Delivery or Faster In-Store Collection"
  
  Scenario: Verify Technology page title
  When I click on "TECHNOLOGY"
  Then I should see "Cheap Deals on Technology | Argos"
  
 Scenario: Verify Home & Garden page title 
  When I click on "HOME & GARDEN" 
  Then I should see "Home & Garden | Furniture | Argos"
  
  Scenario: Verify Baby & Nursery page title
  When I click on "BABY & NURSERY"
  Then I should see "Baby and nursery | Argos"
  
  Scenario: Verify Toys page title
  When I click on "TOYS"
  Then I should see "Toys | Argos"
  
  Scenario: Verify Sports & Leisure page title
  When I click on "SPORTS & LEISURE"
  Then I should see "Sports & Leisure Equipment | Argos"
  
  Scenario: Verify Health & Beauty page title
  When I click on "HEALTH & BEAUTY"
  Then I should see "Health and beauty | Argos"
  
  Scenario: Verify clothing page title
  When I click on "CLOTHING"
  Then I should see "Clothing | Argos"
  
  Scenario: Verify Jewellery and watches page title
  When I click on "JEWELLERY & WATCHES"
  Then I should see "Jewellery and watches | Argos"
  
  Scenario: Verify Gifts page title
  When I click on "GIFTS"
  Then I should see "Gifts | Argos"
  
  Scenario: Verify What's hot page title
  When I click on "WHAT'S HOT"
  Then I should see "What's Hot Right Now | Go Argos"
  
  