package E2EProject.Framework;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	
	private static final int OutputType = 0;
	public static WebDriver driver;	// best to initialise driver outside
	public Properties prop ;
	public WebDriver initializeDriver() throws IOException 
	{
		prop= new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\Kalka Repairs\\eclipse-workspace\\SeleniumFramework\\src\\main\\java\\resources\\data.properties");
		prop.load(fis);
		String browser = prop.getProperty("browser");
		System.out.print("Choosen browser is ["+browser+"]");

		if(browser.equals("chrome")) 
		{
			System.setProperty("webdriver.chrome.driver","F:\\STUDY\\Selenium new\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		if(browser.equals("firefox")) 
		{
			//code for firefox
		}
		if(browser.equals("IE")) 
		{
			//code for IE
		}
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS); // global wait applied across all instructions
		return driver;
		
	}
	
	public static void getScreenshot(String TestcaseName,WebDriver driver) throws IOException 
	{
		/*
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(null);
		String destinationfile = System.getProperty("user.dir")+"\\reports\\"+TestcaseName+"png";
		FileUtils.copyFile(source, new File(destinationfile));
		return destinationfile;*/
		
	
	}



}
