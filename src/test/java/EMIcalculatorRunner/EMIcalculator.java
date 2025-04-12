package EMIcalculatorRunner;




import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagefactory.EMIcalculatorPageFactory;





public class EMIcalculator {
	static WebDriver driver;
	EMIcalculatorPageFactory fun;
		
@Given("^: user in the Home Loan EMI calculator page$")
public void user_in_the_Home_Loan_EMI_calculator_page() throws Throwable {
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\CHRUSHIK\\\\Desktop\\\\m4Selenium\\\\driver\\\\chromedriver.exe");
    driver=new ChromeDriver();
    driver.get("https://www.magicbricks.com/homeloan/emi-calculator");
    fun=new EMIcalculatorPageFactory(driver);
  
    
}

@When("^: Enter \"([^\"]*)\" ,\"([^\"]*)\",\"([^\"]*)\" and  It displays the EMI amount per month and  click on apply home loan$")
public void enter_and_It_displays_the_EMI_amount_per_month_and_click_on_apply_home_loan(String arg1, String arg2, String arg3) throws Throwable {
	fun=new EMIcalculatorPageFactory(driver);
    fun.emicalculatoramount(arg1);
    fun.emicalculatorternure(arg2);
    fun.emicalculatorrate(arg3);
    fun.emicalculation();
    String Expected="2,831";
    String actual=fun.emivalue();
    Assert.assertEquals(Expected, actual);
}

@When("^: Enter \"([^\"]*)\",\"([^\"]*)\" and Accept the terms and click next to Navigates to Enter City page$")
public void enter_and_Accept_the_terms_and_click_next_to_Navigates_to_Enter_City_page(String arg1, String arg2) throws Throwable {
	fun=new EMIcalculatorPageFactory(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	fun.applyloanbtn();
	fun.loamamount(arg1);
	fun.termsaccept();
	fun.getStarted();
}

@When("^: Entering the \"([^\"]*)\" and click next to navigates to property Shortlist page$")
public void entering_the_and_click_next_to_navigates_to_property_Shortlist_page(String arg1) throws Throwable {
	fun=new EMIcalculatorPageFactory(driver);
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	fun.cityName(arg1);
   
}

@When("^: Enter Yes or No option for property shortlist and Navigates to Email page$")
public void enter_Yes_or_No_option_for_property_shortlist_and_Navigates_to_Email_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
   System.out.print("hello");
}

@When("^: Entering the \"([^\"]*)\" Address and click next to Navigates to Name entering page$")
public void entering_the_Address_and_click_next_to_Navigates_to_Name_entering_page(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.print("hello");
}

@When("^: Enter the \"([^\"]*)\" and click tonavigates to What is the nature of your employment page$")
public void enter_the_and_click_tonavigates_to_What_is_the_nature_of_your_employment_page(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.print("hello");
}

@When("^: Select option as reguired with in given options Example:student or employee etc\\.\\.\\.and Navigates to What is your gross monthly income\\? page$")
public void select_option_as_reguired_with_in_given_options_Example_student_or_employee_etc_and_Navigates_to_What_is_your_gross_monthly_income_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.print("hello");System.out.print("hello");
}

@When("^: enter the valid \"([^\"]*)\" Income and click next to Navigates City page where the property is located$")
public void enter_the_valid_Income_and_click_next_to_Navigates_City_page_where_the_property_is_located(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.print("hello");
}

@When("^: Entering the \"([^\"]*)\" of property and click next to Navigates to select bank and apply for loan$")
public void entering_the_of_property_and_click_next_to_Navigates_to_select_bank_and_apply_for_loan(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.print("hello");
}

@Then("^:  Displays Application submitted successfully and Referance number$")
public void displays_Application_submitted_successfully_and_Referance_number() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	System.out.print("hello");
}


}
