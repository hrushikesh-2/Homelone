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
Feature: Use full links 
	After login click Documents Required for Home Loan and calculate EMI amount
	Scenario: After login click Documents Required for Home Loan and calculate EMI amount
		Given : user in the Documents Required for Home Loan page
		When : Enter loan Amount ,tenure,Rate of interest and  It displays the EMI amount per month and  click on apply home loan 	
	  And : Enter loan amount,Mobile Number and Accept the terms and click next to Navigates to Enter City page
	  And : Entering the city name and click next to navigates to property Shortlist page
	  And : Enter Yes or No option for property shortlist and Navigates to Email page
	  And : Entering the Email Address and click next to Navigates to Name entering page
	  And : Enter the Full name and click tonavigates to What is the nature of your employment page
	  And : Select option as reguired with in given options Example:student or employee etc...and Navigates to What is your gross monthly income? page
	  And : enter the valid Annual Income and click next to Navigates City page where the property is located
	  And : Entering the location of property and click next to Navigates to select bank and apply for loan
	  Then :  Displays Application submitted successfully and Referance number
	 Scenario: After login click Home Loan Interest Rate 2021 and calculate EMI amount
		Given : user in the Home Loan Interest Rate 2021
		When : Enter loan Amount ,tenure,Rate of interest and  It displays the EMI amount per month and  click on apply home loan 	
	  And : Enter loan amount,Mobile Number and Accept the terms and click next to Navigates to Enter City page
	  And : Entering the city name and click next to navigates to property Shortlist page
	  And : Enter Yes or No option for property shortlist and Navigates to Email page
	  And : Entering the Email Address and click next to Navigates to Name entering page
	  And : Enter the Full name and click tonavigates to What is the nature of your employment page
	  And : Select option as reguired with in given options Example:student or employee etc...and Navigates to What is your gross monthly income? page
	  And : enter the valid Annual Income and click next to Navigates City page where the property is located
	  And : Entering the location of property and click next to Navigates to select bank and apply for loan
	  Then :  Displays Application submitted successfully and Referance number
	 Scenario: After login click Home Loan Prepayment Calculator and calculate Amount You will save Interest
		Given : user in the Home Loan Prepayment Calculator
		When : Enter loan Amount ,tenure,Rate of interest,Installments paid,Prepayment Amount and  It displays the Amount You will save Interest of and click on apply home loan 	
	  And : Enter loan amount,Mobile Number and Accept the terms and click next to Navigates to Enter City page
	  And : Entering the city name and click next to navigates to property Shortlist page
	  And : Enter Yes or No option for property shortlist and Navigates to Email page
	  And : Entering the Email Address and click next to Navigates to Name entering page
	  And : Enter the Full name and click tonavigates to What is the nature of your employment page
	  And : Select option as reguired with in given options Example:student or employee etc...and Navigates to What is your gross monthly income? page
	  And : enter the valid Annual Income and click next to Navigates City page where the property is located
	  And : Entering the location of property and click next to Navigates to select bank and apply for loan
	  Then :  Displays Application submitted successfully and Referance number
	 Scenario: After login click Home Loan Balance Transfer and calculate EMI amount
		Given : user in the Home Loan Prepayment Calculator
		When : Enter loan Amount ,tenure,Rate of interest,Installments paid,Processing fee,tenure,Rate of interest click compare	
	  Then :  It displays the Amount You will save Interest
	 Scenario: After login click Home Loan Tax Benefits and calculate Amount You will save Interest
		Given : user in the Home Loan Tax Benefits
		When : Enter loan Amount ,tenure,Rate of interest,Installments paid,Prepayment Amount and  It displays the Amount You will save Interest of and click on apply home loan 	
	  And : Enter loan amount,Mobile Number and Accept the terms and click next to Navigates to Enter City page
	  And : Entering the city name and click next to navigates to property Shortlist page
	  And : Enter Yes or No option for property shortlist and Navigates to Email page
	  And : Entering the Email Address and click next to Navigates to Name entering page
	  And : Enter the Full name and click tonavigates to What is the nature of your employment page
	  And : Select option as reguired with in given options Example:student or employee etc...and Navigates to What is your gross monthly income? page
	  And : enter the valid Annual Income and click next to Navigates City page where the property is located
	  And : Entering the location of property and click next to Navigates to select bank and apply for loan
	  Then :  Displays Application submitted successfully and Referance number
	  
	 
	  
