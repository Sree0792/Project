package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookloc {
	
	
	

	String baseurl="https://www.facebook.com";

	ChromeDriver driver;
	
	 @Before
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 
	 }
	@Test
	public void facebookloc()
	{
		driver.get(baseurl);
		WebElement search=driver.findElement(By.xpath("//input[@name='email']"));
		search.sendKeys("abc@gmail.com");
		WebElement search1=driver.findElement(By.xpath("//input[@name='pass']"));
		search1.sendKeys("qrty");
		WebElement search2=driver.findElement(By.xpath("//button[@name='login']"));
		search2.click();
		
	}

}
