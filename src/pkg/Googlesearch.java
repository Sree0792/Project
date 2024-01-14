package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlesearch {
	String baseurl="https://www.google.com";

	ChromeDriver driver;
	
	 @Before
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 
	 }
	@Test
	public void googlesearch()
	{
		driver.get(baseurl);
		
		driver.findElement(By.name("q")).sendKeys("selenium",Keys.ENTER);
		//driver.findElement(By.name("btnK")).click();
		
		WebElement search=driver.findElement(By.name("q"));
		search.sendKeys("selenium");
		search.click();
		
	}

}
