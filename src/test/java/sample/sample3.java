package sample;

import org.testng.annotations.Test;

public class sample3 extends baseclass{
	@Test(groups="smoke")
	public void guru()
	{
		driver.get("https://www.facebook.com/");
	}
	@Test(groups="smoke")
	public void guru1()
	{
		driver.get("https://www.makemytrip.com/");
	}
}
