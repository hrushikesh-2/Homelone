package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class resourcespagefactory {
	@FindBy(xpath="//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[1]/ul/li[1]/a")
	WebElement MBtv;
	@FindBy(xpath="//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[1]/ul/li[2]/a")
	WebElement news;
	@FindBy(xpath="//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[1]/ul/li[3]/a")
	WebElement citynews;
	@FindBy(xpath="//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[2]/ul/li[1]/a")
	WebElement research;
	@FindBy(xpath="//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[2]/ul/li[2]/a")
	WebElement insigts;
	@FindBy(xpath="//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[2]/ul/li[3]/a")
	WebElement propindex;
	
	@FindBy(xpath="//*[@id=\"commercialIndex\"]/header/section[2]/div/ul/li[6]/div/div/div[2]/ul/li[4]/a")
	WebElement pincodefinder;
	@FindBy(xpath="/html/body/div/div[2]/div/div[1]/div[2]/div[1]/div/div[2]/ul/li[2]")
	WebElement state;
	@FindBy(xpath="//*[@id=\"cityFormSelect\"]/div[2]/ul/li[3]")
	WebElement citypin;
	@FindBy(xpath="//*[@id=\"localityFormSelect\"]/div[2]/ul/li[4]")
	WebElement locality;
	@FindBy(xpath="//*[@id=\"pinSearch\"]")
	WebElement btnsearch;
	@FindBy(xpath="//*[@id=\"sideSectionPinCode\"]")
	WebElement piincode;
	
	@FindBy(xpath="/html/body/header/section[2]/div/ul/li[6]/div/div/div[2]/ul/li[5]/a")
	WebElement areacounter;
	
	@FindBy(xpath="/html/body/header/section[2]/div/ul/li[6]/div/div/div[3]/ul/li[1]/a")
	WebElement blogcollection;
	
	@FindBy(xpath="/html/body/header/section[2]/div/ul/li[6]/div/div/div[3]/ul/li[2]/a")
	WebElement lifestyle;
	@FindBy(xpath="/html/body/header/section[2]/div/ul/li[6]/div/div/div[3]/ul/li[3]/a")
	WebElement policies;
	@FindBy(xpath="/html/body/header/section[2]/div/ul/li[6]/div/div/div[3]/ul/li[4]/a")
	WebElement financelegal;
	@FindBy(xpath="//*[@id=\"text\"]")
	WebElement mbtvtext;
	@FindBy(xpath="//*[@id=\"wrapper\"]/div/div[3]/section/h1")
	WebElement newstext;
	@FindBy(xpath="/html/body/div[2]/div[1]/div/ul/li[2]/span")
	WebElement citytext;
	@FindBy(xpath="/html/body/div[2]/div[1]/div/ul/li[2]/span")
	WebElement researchtext;
	@FindBy(xpath="/html/body/header[2]/div/h1")
	WebElement insightstext;
	@FindBy(xpath="/html/body/section/section[1]/div/div/div[1]/div/div[1]/h1")
	WebElement propindextext;
	@FindBy(xpath="/html/body/div/div[2]/div/h1")
	WebElement areatext;
	@FindBy(xpath="/html/body/div[2]/div[3]/div/section/div[1]/div/span")
	WebElement blogtext;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/h1/strong")
	WebElement lifetext;
	@FindBy(xpath="/html/body/div[2]/div[2]/div/div[2]/h1/strong")
	WebElement polaciestext;
	@FindBy(xpath="/html/body/div[2]/div[1]/div/ul/li[2]/span")
	WebElement legaltext;
	
	 WebDriver driver;
	  public resourcespagefactory(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
	  public void resourcesMBtv()
		{
		  MBtv.click();
		}
	  public void resourcesnews()
			{
		  news.click();
			}
	  public void resourcescitynews()
			{
		        citynews.click();
			}
	  public void resourcesresearch()
			{
		  research.click();
			}
	  public void resourcesinsigts()
			{
		  insigts.click();
			}
	  public void resourcespropindex()
			{
		  propindex.click();
			}
	  public void resourcespincodefinder()
			{
		  pincodefinder.click();
			}
	  public void resourcesstate()
			{
		  state.click();
			}
	  public void resourcescitypin()
			{
		  citypin.click();
			}
	  public void resourceslocality()
			{
		  locality.click();
			}
	  public void resourcesbtnsearch()
			{
		  btnsearch.click();
			}
	  public String piincode()
			{
		         String pin= piincode.getText();
		         return pin;
			}
	  public void resourcesareacounter()
			{
		  areacounter.click();
			}
	  public void resourcesblogcollection()
			{
		  blogcollection.click();
			}
	  public void resourceslifestyle()
			{
		  lifestyle.click();
			}
	  public void resourcespolicies()
			{
		  policies.click();
			}
	  public void resourcesfinancelegal()
			{
		  financelegal.click();
			}
	  public String resourcesmbtvtext(String name)
			{
		  mbtvtext.getText();
			  return name;
			}
	  public String resourcesresearchtext(String name)
		{
		  researchtext.getText();
		  return name;
		}
	  public String resourcesnewstext(String name)
		{
		  newstext.getText();
		  return name;
		}
	  public String resourcescitytext(String name)
		{
		  citytext.getText();
		  return name;
		}
	  public String resourcesinsightstext(String name)
		{
		  insightstext.getText();
		  return name;
		}
	  public String resourcespropindextext(String name)
		{
		  propindextext.getText();
		  return name;
		}
	  public String resourcesareatext(String name)
		{
		  areatext.getText();
		  return name;
		}
	  public String resourcesblogtext(String name)
		{
		  blogtext.getText();
		  return name;
		}
	  public String resourceslifetext(String name)
		{
		  lifetext.getText();
		  return name;
		}
	  public String resourcespolaciestext(String name)
		{
		  polaciestext.getText();
		  return name;
		}
	  public String resourceslegaltext(String name)
		{
		  legaltext.getText();
		  return name;
		}
	  
}
