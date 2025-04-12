package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class usefullinks {
	@FindBy(xpath="//*[@id=\"lalpc\"]")
	WebElement amountpre; 
	
	@FindBy(xpath="//*[@id=\"ltlpc\"]")
	WebElement time;
	@FindBy(xpath="//*[@id=\"rlpc\"]")
	WebElement rateof;
	@FindBy(xpath="//*[@id=\"iplpc\"]")
	WebElement instalment;
	@FindBy(xpath="//*[@id=\"palpc\"]")
	WebElement prepayment;
	@FindBy(xpath="//*[@id=\"loanEligibilityCalc\"]/div/div[1]/div/div[6]/input")
	WebElement btncalculatepre;
	@FindBy(xpath="//*[@id=\"interestSavedDiv\"]/div[2]")
	WebElement savedamount;
	@FindBy(xpath="//*[@id=\"mainResultDiv\"]/div/div[5]/a")
	WebElement btnapplyloan;
	@FindBy(xpath="//*[@id=\"laltc\"]")
	WebElement amount;
	@FindBy(xpath="//*[@id=\"ltltc\"]")
	WebElement timee;
	@FindBy(xpath="//*[@id=\"rltc\"]")
	WebElement rateee;
	@FindBy(xpath="//*[@id=\"ipltc\"]")
	WebElement instalments;
	@FindBy(xpath="//*[@id=\"pfltc\"]")
	WebElement prefee;
	@FindBy(xpath="//*[@id=\"nltltc\"]")
	WebElement pretime;
	@FindBy(xpath="//*[@id=\"nrltc\"]")
	WebElement prerate;
	@FindBy(xpath="//*[@id=\"loanTransferCalculator\"]/div/div[1]/div/div[4]/input")
	WebElement btncompare;
	@FindBy(xpath="//*[@id=\"messageAmountDiv\"]")
	WebElement preamount;
	@FindBy(xpath="//*[@id=\"mainResultDiv\"]/div/div[5]/a")
	WebElement preapply;
	
	@FindBy(xpath="//*[@id=\"laltc\"]")
	WebElement balanceamount;
	@FindBy(xpath="//*[@id=\"ltltc\"]")
	WebElement  balancetime;
	@FindBy(xpath="//*[@id=\"rltc\"]")
	WebElement  balancerate;
	@FindBy(xpath="//*[@id=\"ipltc\"]")
	WebElement  balanceinstalment;
	@FindBy(xpath="//*[@id=\"pfltc\"]")
	WebElement  balancefee;
	@FindBy(xpath="//*[@id=\"nltltc\"]")
	WebElement balancepretime;
	@FindBy(xpath="//*[@id=\"nrltc\"]")
	WebElement balanceprerate;
	@FindBy(xpath="//*[@id=\"loanTransferCalculator\"]/div/div[1]/div/div[4]/input")
	WebElement btnbalanceprecompare;
	@FindBy(xpath="//*[@id=\"messageAmountDiv\"]")
	WebElement balancepresave;
	
	@FindBy(xpath="//*[@id=\"lalpc\"]")
	WebElement taxamount;
	@FindBy(xpath="//*[@id=\"ltlpc\"]")
	WebElement taxtime;
	@FindBy(xpath="//*[@id=\"rlpc\"]")
	WebElement taxrate;
	@FindBy(xpath="//*[@id=\"iplpc\"]")
	WebElement taxinstalment;
	@FindBy(xpath="//*[@id=\"palpc\"]")
	WebElement taxprepayment;
	@FindBy(xpath="//*[@id=\"loanEligibilityCalc\"]/div/div[1]/div/div[6]/input]")
	WebElement taxcompare;
	@FindBy(xpath="//*[@id=\"interestSavedDiv\"]/div[2]")
	WebElement taxprepaymentamount;
	@FindBy(xpath="//*[@id=\"mainResultDiv\"]/div/div[5]/a")
	WebElement btntaxapply;
	
	
	
	WebDriver driver;
	
	  public usefullinks(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	  public void usefullinkdocumenttime(String loamount)
		{
		  time.sendKeys(loamount);
		}
	  public void usefullinkdocumentrateof(String loamount)
		{
		  rateof.sendKeys(loamount);
		}
	  public void usefullinkdocumentinstalment(String loamount)
		{
		  instalment.sendKeys(loamount);
		}
	  public void usefullinkdocumentprepayment(String loamount)
		{
		  prepayment.sendKeys(loamount);
		}
	  public void usefullinkdocumentbtncalculatepre()
		{
		  btncalculatepre.click();
		}
	  public String usefullinkdocumentsavedamount()
		{
		  String loamount= savedamount.getText();
		  return loamount;
		}
	  public void usefullinkprepaymentamount(String loamount)
		{
		  btnapplyloan.sendKeys(loamount);
		}
	  public void usefullinkprepaymentapplyloan(String loamount)
		{
		  amount.sendKeys(loamount);
		}
	  public void usefullinkprepaymenttimee(String loamount)
		{
		  timee.sendKeys(loamount);
		}
	  public void usefullinkprepaymentrateee(String loamount)
		{
		  rateee.sendKeys(loamount);
		}
	  public void usefullinkprepaymentinstalments(String loamount)
		{
		  instalments.sendKeys(loamount);
		}
	  public void usefullinkprepaymentprefee(String loamount)
		{
		  prefee.sendKeys(loamount);
		}
	  public void usefullinkprepaymentpretimet(String loamount)
		{
		  pretime.sendKeys(loamount);
		}
	  public void usefullinkprepaymentprerate(String loamount)
		{
		  prerate.sendKeys(loamount);
			  
		}
	  public void usefullinkprepaymentbtncompare()
		{
		  btncompare.click();
		}
	  public String usefullinkprepaymentpreamount()
		{
		  String loamount=preamount.getText();
		  return loamount;
			  
		}
	  public void usefullinkpreapply(String loamount)
		{
		  preapply.click();
			  
		}
	  public void usefullinkbalanceamount (String loamount)
		{
		  balanceamount.sendKeys(loamount);
			  
		}
	  public void usefullinkbalancetime (String loamount)
		{
		  balancetime.sendKeys(loamount);
			  
		}
	  public void usefullinkbalancerate (String loamount)
		{
		  balancerate.sendKeys(loamount);
			  
		}
	  public void usefullinkbalanceinstalment (String loamount)
		{
		  balanceinstalment.sendKeys(loamount);
			  
		}
	  public void usefullinkbalancefee (String loamount)
		{
		  balancefee.sendKeys(loamount);
			  
		}
	  public void usefullinkbalancepretime (String loamount)
		{
		  balancepretime.sendKeys(loamount);
			  
		}
	  public void usefullinkbalanceprerate (String loamount)
		{
		  balanceprerate.sendKeys(loamount);
			  
		}
	  public void usefullinkbtnbalanceprecompare ()
		{
		  btnbalanceprecompare.click();
			  
		}
	  public String usefullinkbalancepresave ()
		{
		  String loamount= balancepresave.getText();
		  return loamount;
			  
		}
	  public void usefullinktaxamount(String loamount)
		{
		  taxamount.sendKeys(loamount);
			  
		}
	  public void usefullinktaxtime(String loamount)
		{
		  taxtime.sendKeys(loamount);
			  
		}
	  public void usefullinktaxrate(String loamount)
		{
		  taxrate.sendKeys(loamount);
			  
		}
	  public void usefullinktaxinstalment(String loamount)
		{
		  taxinstalment.sendKeys(loamount);
			  
		}
	  public void usefullinktaxprepayment (String loamount)
		{
		  taxprepayment.sendKeys(loamount);
			  
		}
	  public void usefullinktaxcompare()
		{
		  taxcompare.click();
			  
		}
	  public String usefullinktaxprepaymentamount ()
		{
		  String loamount=taxprepaymentamount.getText();
		return loamount;  
		}
	  public void usefullinkbtntaxapply ()
		{
		  btntaxapply.click();
			  
		}  
}
