package E2EProject.Framework;

import org.testng.annotations.Test;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjects.PageObj_LandingPage;

public class HomePageTest extends Base {
	public WebDriver driver;
	@BeforeTest()
	public void startlaunch() throws IOException {
		driver = initializeDriver();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}
	
	@Test(dataProvider = "getData")
	public void basePageNavigation(String username,String password,String message) throws IOException, InterruptedException 
	{

		PageObj_LandingPage l = new PageObj_LandingPage(driver);
		l.login_landingPage().click(); 
		l.username().sendKeys(username); 
		l.password().sendKeys(password); 
		System.out.println(message);
		l.login_loginPage().click();

	}

	@DataProvider()
	public Object[][] getData() {
		Object[][] data = new Object[1][3]; // row=count for running test, column=number of values for each test
		data[0][0] = "nonrestricteduser@google.com";
		data[0][1] = "123456";
		data[0][2] = "Restricted User";
		
		/*data[1][0] = "restricteduser@google.com";
		data[1][1] = "123456";
		data[1][2] = "Non Restricted User";*/
		
		return data;		
	}
	
	@AfterTest()
	public void Teardown() {
		driver.close();
	}

}
