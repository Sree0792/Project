package testng;

import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Dragdroppgm {
	String baseurl="https://demo.guru99.com/test/drag_drop.html";
	ChromeDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void test1()
	
	{
	driver.get(baseurl);
	WebElement amount=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));	
	//WebElement bnk=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
	//amount.click();
	WebElement field=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
	//WebElement trgt=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
	Actions act=new Actions(driver);
	//act.dragAndDrop(bnk, trgt);
	act.dragAndDrop(amount, field);
	//act.keyDown(fullname,Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL);
	//act.keyDown(fullname,Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL);
	//act.keyDown(rediffid,Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL);
	act.perform();
	}
}
