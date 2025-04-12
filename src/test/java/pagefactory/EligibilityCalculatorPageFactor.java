package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EligibilityCalculatorPageFactor {
	
  @FindBy(xpath="//*[@id=\"lalec\"]")
  WebElement loanamount;
  
  @FindBy(xpath="//*[@id=\"inlec\"]")
  WebElement netincome;
  
  @FindBy(xpath="//*[@id=\"ellec\"]")
  WebElement existingloancommitments; 
  
  @FindBy(xpath="//*[@id=\"ltlec\"]")
  WebElement tenure;
  
  @FindBy(xpath="//*[@id=\"rlec\"]")
  WebElement rateofinterest;
  
  @FindBy(xpath="//*[@id=\"loanEligibilityCalc\"]/div/div[1]/div/div[6]/input")
  WebElement btnloaneligibility;
  
  @FindBy(xpath="//*[@id=\"loanAmtResultDiv\"]")
  WebElement loaneligibilityamount;
  
  @FindBy(xpath="//*[@id=\"eligb\"]/div/div[3]/a")
  WebElement btnapplyloan;
  
  WebDriver driver;
  public EligibilityCalculatorPageFactor(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
  public void eligibilitycalculatoramount(String loamount)
	{
	  loanamount.sendKeys(loamount);
	}
  public void eligibilitynetincome(String netincomee)
	{
	  netincome.sendKeys(netincomee);
	}
  public void eligibilityexistingloan(String loamount)
	{
	  existingloancommitments.sendKeys(loamount);
	}
  public void tenuregorloan(String loamount)
	{
	  tenure.sendKeys(loamount);
	}
  public void eligibilityrateofinterest(String loamount)
	{
	  rateofinterest.sendKeys(loamount);
	}
  public void eligibilitybtnloaneligibility()
	{
	  btnloaneligibility.click();
	}
  public String eligibilityloaneligibilityamount()
	{
	  String amount=loaneligibilityamount.getText();
	  return amount;
	  
	}
  public void eligibilitybtnapplyloan()
	{
	  btnapplyloan.click();
	}
}
