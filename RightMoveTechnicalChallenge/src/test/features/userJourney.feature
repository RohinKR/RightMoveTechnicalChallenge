Feature: As a user
         I should get appropriate properties for buy or rent

@userJourney
Scenario: validate property deatils of newest listed non-featured property for sale

Given I'm on home page
When I provide postcode
And I click for sale button
And I select search radius
And I select price range for sale
And I select min and max number of bedrooms
And I select property type
And I select property timeline
And I click find properties
And I sort the property list newest listed option
And I click the first non - featured property
Then I should see the appropriate details

@userJourney
Scenario: validate property deatils of newest listed non-featured property to rent

Given I'm on home page
When I provide postcode
And I click to rent button
And I select search radius
And I select price range to rent
And I select min and max number of bedrooms
And I select property type
And I select property timeline
And I click find properties
And I sort the property list newest listed option
And I click the first non - featured property
Then I should see the appropriate details

