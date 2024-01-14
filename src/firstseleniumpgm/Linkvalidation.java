package firstseleniumpgm;

import java.net.HttpURLConnection;
//import java.net.URI;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Linkvalidation {
	
	
	
	String baseurl="https://www.google.com";
	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		
	}
	
	@Test
	public void test3()
	{
	driver.get(baseurl);
	List<WebElement>li=driver.findElements(By.tagName("a"));
	System.out.println("tot links="+li.size());
	for(WebElement ele:li)
	{
		String link=ele.getAttribute("href");
		verify(link);
		
	}
	}
private void verify(String link)
{
	try
	{
URL u=new URL(link);              //float f=1.2f;

                                   //double d= (double)f;
        HttpURLConnection con=(HttpURLConnection)u.openConnection(); 
        con.connect();
        if(con.getResponseCode()==200)
        {
        	System.out.println("successful response....."+link);
        	
        }
        else if(con.getResponseCode()==404)
        {
        	System.out.println("brokenlink..."+link);
        }
	}
	catch(Exception e)
	{
		System.out.println(e.getMessage());
	}
}
}