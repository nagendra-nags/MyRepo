package sample;

import org.testng.annotations.Test;

public class sample2 extends baseclass{
	@Test(groups="smoke")
	public void git()
	{
		driver.get("https://www.goibibo.com/");
	}
	@Test(groups="regression")
	public void github()
	{
		driver.get("https://www.flipkart.com/");
	}
}
