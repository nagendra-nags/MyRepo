package sample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class My2Test {
	WebDriver driver;
	@BeforeClass
	public void precondition()
	{
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void postcondition()
	{
		driver.quit();
	}
	
	@Test(groups="smoke")
	public void ogibibologin()
	{
		driver.get("https://www.goibibo.com/");
	}
	
	@Test(groups="regression")
	public void flipkartlogin()
	{
		driver.get("https://www.flipkart.com/");
	}

}

