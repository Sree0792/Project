package testng;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Datepickermariners {

	//ChromeDriver driver;
	WebDriver driver;
	
	
	String baseurl="https://marinersforex.com/Flights-Booking";
	
	@BeforeTest
	public void setup()
	{
	driver=new ChromeDriver();
	driver.get(baseurl);
	}
	
	@Test
	public void test1()
	
	{
		
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div[2]/section/div[1]/form/div[2]/div[2]/div[2]/div/div/input")).click();
		
		
		while(true)
		{

		String  month=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/div[1]/div")).getText();
	
		
		if(month.equalsIgnoreCase("November"))
		{
			System.out.println("month selected="+month);
			break;
		}
		
		else {
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[2]/button[2]")).click();
		}

		}
		
	WebElement yearelement=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[1]/div[1]/div[2]/div"));
			String year=yearelement.getText();
	
	
	if(year.equals("2024"))
	{
		System.out.println("year selected="+year);
	}
	
	
	
	else
	{
		
		yearelement.click();
		driver.findElement(By.xpath("//button[contains(text(),'2025')]")).click();
		
		
	}
	
	
	
	List<WebElement>datedetails=driver.findElements(By.xpath("/html/body/div[2]/div[2]/div/div/div/div[2]/div/div[2]/div/div/div/button"));
			for(WebElement dateelement:datedetails)
			{
				String date=dateelement.getText();
				if(date.equals("24"))
					
				{
					
				dateelement.click();
				break;
				}
			}
	}
	
	
	
	
	
	
	
}
