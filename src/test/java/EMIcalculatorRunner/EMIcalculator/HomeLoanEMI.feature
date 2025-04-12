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
@emicalculator
Feature: Emi calculating 
	calculating the EMI for the loan amount 
	Scenario: After login calculating the EMI for loan for Home Loan
		Given : user in the Home Loan EMI calculator page
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
	 Scenario: After login calculating the EMI for loan for HDFC Home Loan
		Given : user in the HDFC Home Loan EMI calculator page
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
	 Scenario: After login calculating the EMI for loan for SBI Home Loan
		Given : user in the SBI Home Loan EMI calculator page 
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
	 Scenario: After login calculating the EMI for loan for ICICI Home Loan
		Given : user in the ICICI Home Loan EMI calculator page
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
	 Scenario: After login calculating the EMI for loan for PNB HFL Home Loan
		Given : user in the PNB HFL Home Loan EMI calculator page
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
	  
	
		
		