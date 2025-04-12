package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EMIcalculatorPageFactory {
	
	@FindBy(xpath="//*[@id=\"swiper-wrapper-210d20f599f33eb0\"]/div[1]/div[4]/ul/li[1]/a")
	WebElement btnhomeloan;

	@FindBy(xpath="//*[@id=\"amountRequired\"]")
	WebElement Amount;
	
	@FindBy(xpath="//*[@id=\"loanTenureYear\"]")
	WebElement Tenure;
	
	@FindBy(xpath="//*[@id=\"emiroi\"]")
	WebElement rate;
	
	@FindBy(xpath="//*[@id=\"emiCalculator\"]/div/div[1]/div/div[4]/input")
	WebElement btnCalculateEmi;
	
	@FindBy(xpath="//*[@id=\"emiSpan\"]")
	WebElement emivalue;
	
	@FindBy(xpath=" //*[@id=\"emiResultSection\"]/div/div[3]/a")
	WebElement btnapplyforloan;
	
	@FindBy(xpath="//*[@id=\"loanAmount\"]")
	WebElement loanAmount;
	
	@FindBy(xpath="//*[@id=\"mobileNumberLoggedIn\"]")
	WebElement mobile;
	
	@FindBy(xpath="//*[@id=\"terms\"]/label")
	WebElement termsagree;
	
	@FindBy(xpath="//*[@id=\"generate-otp\"]")
	WebElement btngetstared;
	
	@FindBy(xpath="//*[@id=\"1\"]")
	WebElement cityname;
	
	@FindBy(xpath="//*[@id=\"qusfoot1\"]/div[2]/a")
	WebElement btnforshortlist;
	
	@FindBy(xpath="//*[@id=\"question3\"]/div[2]/span[1]")
	WebElement btnyes;
	
	@FindBy(xpath="//*[@id=\"question3\"]/div[2]/span[2]")
	WebElement btnno;
	
	@FindBy(xpath="//*[@id=\"qusfoot3\"]/div[2]/a")
	WebElement btntomail;
	
	@FindBy(xpath="//*[@id=\"answer5\"]")
	WebElement emailfield;
	
	@FindBy(xpath="//*[@id=\"qusfoot5\"]/div[2]/a")
	WebElement btntoname;
	
	@FindBy(xpath="//*[@id=\"answer7\"]")
	WebElement Name;
	
	@FindBy(xpath="//*[@id=\"answer7\"]")
	WebElement btntoemployement;
	
	@FindBy(xpath="//*[@id=\"question9\"]/div[2]/span[1]")
	WebElement btniamprofessional;
	
	@FindBy(xpath="//*[@id=\"question9\"]/div[2]/span[2]")
	WebElement btniamselfemployed;
	
	@FindBy(xpath="//*[@id=\"question9\"]/div[2]/span[3]")
	WebElement btnselfemployedandprofessional;
	
	@FindBy(xpath="//*[@id=\"question9\"]/div[2]/span[4]")
	WebElement btnhomemaker;
	
	@FindBy(xpath="//*[@id=\"question9\"]/div[2]/span[5]")
	WebElement btnstudent;
	
	@FindBy(xpath="//*[@id=\"qusfoot9\"]/div[2]/a")
	WebElement btntomonthlyincome;
	
	@FindBy(xpath="//*[@id=\"answer11\"]")
	WebElement Income;
	
	
	@FindBy(xpath="//*[@id=\"qusfoot11\"]/div[2]/a")
	WebElement btnpropertyloc;
	
	@FindBy(xpath="//*[@id=\"13\"]")
	WebElement propertyloc;
	
	@FindBy(xpath="/html/body/section[1]/div[1]/div[12]/div[2]/a")
	WebElement btntoapplyloan;
	
	@FindBy(xpath="/html/body/div/div/div[1]/section/ul/li[2]/div[1]/div[7]/div/a")
	WebElement btnapplyunionbank;
	
	@FindBy(xpath="//*[@id=\"user-ref\"]/div[1]/div[1]")
	WebElement applysuccessfully;

	WebDriver driver;
	
	public EMIcalculatorPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void homeloanemi()
	{
		btnhomeloan.click();
	}
	public void emicalculatoramount(String amount)
	{
		Amount.clear();
		Amount.sendKeys(amount);
	}
	public void emicalculatorternure(String tenure)
	{
		Tenure.clear();
		Tenure.sendKeys(tenure);
	}public void emicalculatorrate(String rateofi)
	{
		rate.clear();
		rate.sendKeys(rateofi);
	}public void emicalculation()
	{
		btnCalculateEmi.click();
	}
	public String emivalue()
	{
		String value=emivalue.getText();
		return value;
	}
	public void applyloanbtn()
	{
		btnapplyforloan.click();
	}
	public void loamamount(String amount)
	{
		loanAmount.clear();
		loanAmount.sendKeys(amount);
	}
	public void mobileNumber(String number)
	{
		mobile.clear();
		mobile.sendKeys(number);
	}
	public void termsaccept()
	{
		termsagree.click();
	}
	public void getStarted()
	{
		btngetstared.click();
	}
	public void cityName(String city)
	{
		cityname.sendKeys(city);
	}
	public void shortlistpage()
	{
		btnforshortlist.click();
	}
	public void yes()
	{
		btnyes.click();
	}
	public void no()
	{
		btnno.click();
	}
	public void tomailpage()
	{
		btntomail.click();
	}
	public void enterEmail(String email)
	{
		emailfield.sendKeys(email);
	}public void Enternamepage()
	{
		btntoname.click();
	}public void Entername(String name)
	{
		Name.sendKeys(name);
	}public void employmentpage()
	{
		btntoemployement.click();
	}public void iAmProfessional()
	{
		btniamprofessional.click();
	}public void iAmSelfEmployed()
	{
		btniamselfemployed.click();
	}public void selfemployedandprofessional()
	{
		btnselfemployedandprofessional.click();
	}public void homemaker()
	{
		btnhomemaker.click();
	}public void student()
	{
		btnstudent.click();
	}public void tomonthelyincome()
	{
		btntomonthlyincome.click();
	}
	public void monthlyincome(String income)
	{
		Income.sendKeys(income);
	}public void Topropertyloc()
	{
		btnpropertyloc.click();
	}
	public void propertylocation(String location)
	{
		propertyloc.click();
	}
	public void Toapply()
	{
		btntoapplyloan.click();
	}
	public void applyunionbank()
	{
		btnapplyunionbank.click();
	}
	public String Toapplysuccessfully()
	{
		String apply=applysuccessfully.getText();
		return apply;
	}
	
	
}

