package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpg {

	
	
	String baseurl="https://www.amazon.com";

	ChromeDriver driver;
	
	 @Before
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 
	 }
	@Test
	public void amazon()
	{
		driver.get(baseurl);
		WebElement search=driver.findElement(By.xpath("//*[@id='a-page']/div[1]/div/div[2]/div/a/div/div[1]"));
		search.click();
		
	}
}
