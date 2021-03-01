package E2EProject.Framework;

import org.testng.annotations.Test;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


import pageObjects.PageObj_LandingPage;

public class storePageElementTest extends Base{
	public WebDriver driver;
	@BeforeTest()
	public void startlaunch() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		PageObj_LandingPage l = new PageObj_LandingPage(driver);
		WebDriverWait w = new WebDriverWait(driver,5);
		w.until(ExpectedConditions.presenceOfElementLocated(l.login_landingPage));
		/*Boolean B =l.noThankspopup_txt().isDisplayed();
		System.out.println(B+" pop is desplayed");
		if(l.iframe_landingpage().isDisplayed() ) {
			driver.switchTo().frame(l.iframe_landingpage());
			l.noThankspopup_txt().click();
			JavascriptExecutor j = (JavascriptExecutor)driver;
			j.executeScript("arguments[0].click();", l.noThankspopup_txt);
			driver.switchTo().defaultContent();
		}*/
	}
	
	@Test
	public void storePageElement() {
		
		WebElement Titledriver = driver.findElement(By.xpath("//*[@class='nav navbar-nav navbar-right']"));
		List<WebElement> web = Titledriver.findElements(By.tagName("li"));
		System.out.println(web.size());
		List<String> emptylist = new ArrayList<String>();
		for(int i=0;i<=web.size()-1;i++) 
		{
			String webElement = web.get(i).getText();
			System.out.println(webElement);	
			
			emptylist.add(web.get(i).getText());		
		}
		System.out.println(emptylist);	
		Collections.sort(emptylist);
		System.out.println(emptylist);				
	}
	
	@AfterTest()
	public void Teardown() {
		driver.close();
	}
	
}
