package sample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MyTest  {
	WebDriver driver;
	
	@BeforeClass
	public void precondition() {
	
	
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	}
	
	@AfterClass
	public void postcondition()
	{
		driver.quit();
	}
	
	@Test(groups="regression")
	public void facebooklogin() throws InterruptedException
	{
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
	}
	
	
	@Test(groups="smoke")
	public void makemytriplogin()
	{
		driver.get("https://www.makemytrip.com/");
	}

}
