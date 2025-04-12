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
Feature: Home loan Eligibility Calculator
	calculating the Home loan Eligibility Amount
	Scenario: After login calculating Eligibility loan amount for Home loan
		Given : user in the Home Loan EMI calculator page
		When :  Enter loan Amount,Net income per month,Existing loan commitments(per month) ,Tenure,Rate of interest then  It displays the Eligibility loan amount and EMI per month
	  And : Enter loan amount,Mobile Number and Accept the terms and click next to Navigates to Enter City page
	  And : Entering the city name and click next to navigates to property Shortlist page
	  And : Enter Yes or No option for property shortlist and Navigates to Email page
	  And : Entering the Email Address and click next to Navigates to Name entering page
	  And : Enter the Full name and click tonavigates to What is the nature of your employment page
	  And : Select option as reguired with in given options Example:student or employee etc...and Navigates to What is your gross monthly income? page
	  And : enter the valid Annual Income and click next to Navigates City page where the property is located
	  And : Entering the location of property and click next to Navigates to select bank and apply for loan
	  Then :  Displays Application submitted successfully and Referance number
	 Scenario: After login calculating Eligibility loan amount for HDFC Home loan
		Given : user in the Home Loan EMI calculator page
		When :  Enter loan Amount,Net income per month,Existing loan commitments(per month) ,Tenure,Rate of interest then  It displays the Eligibility loan amount and EMI per month
	  And : Enter loan amount,Mobile Number and Accept the terms and click next to Navigates to Enter City page
	  And : Entering the city name and click next to navigates to property Shortlist page
	  And : Enter Yes or No option for property shortlist and Navigates to Email page
	  And : Entering the Email Address and click next to Navigates to Name entering page
	  And : Enter the Full name and click tonavigates to What is the nature of your employment page
	  And : Select option as reguired with in given options Example:student or employee etc...and Navigates to What is your gross monthly income? page
	  And : enter the valid Annual Income and click next to Navigates City page where the property is located
	  And : Entering the location of property and click next to Navigates to select bank and apply for loan
	  Then :  Displays Application submitted successfully and Referance number
	 Scenario: After login calculating Eligibility loan amount for SBI Home loan
		Given : user in the Home Loan EMI calculator page
		When :  Enter loan Amount,Net income per month,Existing loan commitments(per month) ,Tenure,Rate of interest then  It displays the Eligibility loan amount and EMI per month
	  And : Enter loan amount,Mobile Number and Accept the terms and click next to Navigates to Enter City page
	  And : Entering the city name and click next to navigates to property Shortlist page
	  And : Enter Yes or No option for property shortlist and Navigates to Email page
	  And : Entering the Email Address and click next to Navigates to Name entering page
	  And : Enter the Full name and click tonavigates to What is the nature of your employment page
	  And : Select option as reguired with in given options Example:student or employee etc...and Navigates to What is your gross monthly income? page
	  And : enter the valid Annual Income and click next to Navigates City page where the property is located
	  And : Entering the location of property and click next to Navigates to select bank and apply for loan
	  Then :  Displays Application submitted successfully and Referance number
	 Scenario: After login calculating Eligibility loan amount for ICICI Home loan
		Given : user in the Home Loan EMI calculator page
		When :  Enter loan Amount,Net income per month,Existing loan commitments(per month) ,Tenure,Rate of interest then  It displays the Eligibility loan amount and EMI per month
	  And : Enter loan amount,Mobile Number and Accept the terms and click next to Navigates to Enter City page
	  And : Entering the city name and click next to navigates to property Shortlist page
	  And : Enter Yes or No option for property shortlist and Navigates to Email page
	  And : Entering the Email Address and click next to Navigates to Name entering page
	  And : Enter the Full name and click tonavigates to What is the nature of your employment page
	  And : Select option as reguired with in given options Example:student or employee etc...and Navigates to What is your gross monthly income? page
	  And : enter the valid Annual Income and click next to Navigates City page where the property is located
	  And : Entering the location of property and click next to Navigates to select bank and apply for loan
	  Then :  Displays Application submitted successfully and Referance number
	 Scenario: After login calculating Eligibility loan amount for PNB HFL Home loan
		Given : user in the Home Loan EMI calculator page
		When :  Enter loan Amount,Net income per month,Existing loan commitments(per month) ,Tenure,Rate of interest then  It displays the Eligibility loan amount and EMI per month
	  And : Enter loan amount,Mobile Number and Accept the terms and click next to Navigates to Enter City page
	  And : Entering the city name and click next to navigates to property Shortlist page
	  And : Enter Yes or No option for property shortlist and Navigates to Email page
	  And : Entering the Email Address and click next to Navigates to Name entering page
	  And : Enter the Full name and click tonavigates to What is the nature of your employment page
	  And : Select option as reguired with in given options Example:student or employee etc...and Navigates to What is your gross monthly income? page
	  And : enter the valid Annual Income and click next to Navigates City page where the property is located
	  And : Entering the location of property and click next to Navigates to select bank and apply for loan
	  Then :  Displays Application submitted successfully and Referance number