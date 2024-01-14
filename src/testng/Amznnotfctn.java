package testng;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Amznnotfctn {

	
	String baseurl="https://www.amazon.in";

	ChromeDriver driver;
	
	 @BeforeTest
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 
	 }
	@Test
	public void amazon()
	{
		driver.get(baseurl);
		//driver.getTitle();
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("Mobile phones",Keys.ENTER);
		String parentwindow=driver.getWindowHandle();
		String title=driver.getTitle();
		String exp="Amazon.in:Mobilephones";
		System.out.println("Parent window title"+title);
		if(title.equals(exp))
		{
			System.out.println("Correct Title");
		}
		else {
			System.out.println("Wrong Title");
		}
		
		
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[6]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		Set<String>allwindowhandles=driver.getWindowHandles();
		for(String handle:allwindowhandles)
			{
			if(!handle.equalsIgnoreCase(parentwindow)) {
				driver.switchTo().window(handle);
				//driver.findElement(By.xpath("//*[@id=\"add"
						driver.findElement(By.xpath("//*[@id=\"nav-orders\"]/span[1]"));
					
			}
			}
	}
	
}

	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	

