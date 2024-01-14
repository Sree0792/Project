package testng;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Windwhndlrpgm {
WebDriver driver;
	String baseurl="https://www.demo.guru99.com/articles_popup.php";
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	}

	
	@Test

public void hndlr()
{
		driver.get(baseurl);
		String parentWindow=driver.getWindowHandle();
		System.out.println("Parent Window Title"+driver.getTitle());
		//driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allWindowHandles= driver.getWindowHandles();
		
		for (String handle : allWindowHandles)
		{
		if(!handle.equalsIgnoreCase(parentWindow)) {
			driver.switchTo().window(handle);
			String s=driver.findElement(By.xpath("/html/body/form/table/tbody/tr/td/h2")).getText();
			System.out.println(s);
			driver.close();
		}
		driver.switchTo().window(parentWindow);
		}
		
		
}
}