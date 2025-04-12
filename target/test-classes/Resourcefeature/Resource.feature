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

Feature: Resourecs
	Validating all the fields in resoures
	Scenario: Validating MB Tv page in News
		Given : User is in the home page and Resources 
		When : We click on MB TV link 
		Then : Navigates to MB Tv Youtube page
	Scenario: Validating News page in News
		Given : User is in the home page and Resources 
		When : We click on News link 
		Then : Navigates to News page of Magic Bricks
	Scenario: Validating City News page in News
		Given : User is in the home page and Resources 
		When : We click on City News link 
		Then : Navigates to City news page
	Scenario: Validating Research page in Advice
		Given : User is in the home page and Resources 
		When : We click on Research link 
		Then : Navigates to Researches of Magic Bricks
	Scenario: Validating Insights page in Advice
		Given : User is in the home page and  Resources 
		When : We click on Insights link 
		Then : Navigates to Insights of Magic Bricks
	Scenario: Validating PropIndex page in Advice
		Given : User is in the home page and  Resources 
		When : We click on PropIndex link 
		Then : Navigates to PropIndex of Magic Bricks
	Scenario: Validating Pincode  page in Advice
		Given : User is in the home page and click pincode in Resources 
		When :  Select State,City and locality and click search 
		Then : Displays the pincode details for selected city
	Scenario: Validating Area Counter page in Advice
		Given : User is in the home page and click  Resources 
		When : We click on Area counter link 
		Then : Navigates to Area counter of Magic Bricks
	Scenario: Validating Blog Collections page in Blog
		Given : User is in the home page and click Resources 
		When : We click on Blog Collections link 
		Then : Navigates to Blog Collection page of Magic Bricks
	Scenario: Validating Life Style page in Blog
		Given : User is in the home page and click Resources 
		When : We click on Life Style link 
		Then : Navigates to Life Style of Magic Bricks
	Scenario: Validating Policies page in Blog
		Given : User is in the home page and click Resources 
		When : We click on Policies link 
		Then : Navigates to Policies of Magic Bricks
	Scenario: Validating Finance & Legal page in Blog
		Given : User is in the home page and click Resources 
		When : We click on Finance & Legal link 
		Then : Navigates to Finance & Legal of Magic Bricks
	
	
		