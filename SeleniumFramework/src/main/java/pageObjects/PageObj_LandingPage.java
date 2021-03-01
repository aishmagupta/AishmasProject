package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObj_LandingPage {

	public WebDriver driver;

	public PageObj_LandingPage(WebDriver driver) {
		this.driver = driver;
	}

	public By login_landingPage=By.xpath("//*[contains(@href,'sign_in')]");
	By username=By.xpath("//*[contains(@id,'user_email')]");
	By password=By.xpath("//*[contains(@id,'user_password')]");
	By login_loginPage=By.xpath("//*[contains(@id,'user_password')]");
	By Popup=By.xpath("//*[@id=\"homepage\"]/div[4]/div[2]/div/div/div/span/div/div[7]/div/div/div[1]");
	By navigationBar=By.xpath("//*[contains(@class,'text-center')]");
	By pageHeader = By.xpath("//*[@class='nav navbar-nav navbar-right']");
	By iframe_landingpage=By.xpath("//iframe[contains(@id,'sumome-jquery-iframe')]");
	//public By noThankspopup_txt=By.xpath("//*[@id='homepage']/div[4]/div[2]/div/div/div/span/div/div[6]/div/div/button");
	public By noThankspopup_txt=By.xpath("//*[contains(text(),'NO THANKS')]");
	
	public WebElement iframe_landingpage()
	{
		return driver.findElement(iframe_landingpage);
	}
	public WebElement noThankspopup_txt()
	{
		return driver.findElement(noThankspopup_txt);
	}
	public WebElement login_landingPage()
	{
		return driver.findElement(login_landingPage);
	}

	public WebElement username()
	{
		return driver.findElement(username);
	}

	public WebElement password()
	{
		return driver.findElement(password);
	}

	public WebElement login_loginPage()
	{
		return driver.findElement(login_loginPage);
	}
		
	public WebElement Popup()
	{
		return driver.findElement(Popup);
	}
	
	public WebElement navigationBar()
	{
		return driver.findElement(navigationBar);
	}

	public WebElement pageHeader() 
	{
		return driver.findElement(pageHeader);
	}



}
