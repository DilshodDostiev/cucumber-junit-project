Feature: Default

	@B26G23-49 @B26G23-40 @VyTrack
	Scenario: AC#8 Grid Settings should be on the right side of the page 
		Given user is on the Vytrack Login Page
		When user enters Username and Password
		And user enters submit botton
		And user clicks on Fleet Botton 
		And user clicks on Vehicles
		Then user should be able to see Grid Settings on the right page.