package firstseleniumpgm;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathamazonpgm {

	String baseurl="https://www.amazon.in";

	ChromeDriver driver;
	
	 @Before
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 driver.get(baseurl);

	 }
	@Test
	public void testamazon()
	{

		driver.findElement(By.xpath("//input[@name='field-keywords']")).sendKeys("mobiles",Keys.ENTER);
	driver.findElement(By.xpath("//*[@id='nav-cart-count']")).click();
	driver.findElement(By.xpath("//span[@id='nav-link-accountList-nav-line-1']")).click();
	driver.navigate().back();
	driver.findElement(By.xpath("//div[@id='nav-xshop']/a[4]")).click();
	driver.findElement(By.xpath("//div[@id='nav-main']/div[1]/a[1]/span")).click();
	
	}
}

