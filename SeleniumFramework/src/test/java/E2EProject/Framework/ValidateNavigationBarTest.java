package E2EProject.Framework;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjects.PageObj_LandingPage;

public class ValidateNavigationBarTest extends Base {
	public WebDriver driver;
	@BeforeTest()
	public void startlaunch() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
	}
	@Test()
	public void ValidatenavigationBar() throws IOException {
		
		PageObj_LandingPage l = new PageObj_LandingPage(driver);
		
		/*if(l.noThankspopup_txt().isDisplayed()) {
			l.Popup().click();
			System.out.print("Pop-up is clicked successfully");
		}*/
		
		AssertJUnit.assertTrue(l.navigationBar().isDisplayed());	
		System.out.println(l.navigationBar().getText());
		Assert.assertEquals(l.navigationBar().getText(), "FEATURED COURSES");
	}
	@AfterTest()
	public void Teardown() {
		driver.close();
	}
}
