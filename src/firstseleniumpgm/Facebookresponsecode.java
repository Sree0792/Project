package firstseleniumpgm;

import java.net.HttpURLConnection;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookresponsecode {
	String baseurl="https://www.facebook.com";
	ChromeDriver driver;
	
	
	 @Before
	 public void setup()
	 {
		 driver=new ChromeDriver();
		 
	 }
	 
	 
	@Test
	public void test()
	{
		driver.get(baseurl);
		
		verify(baseurl);

}
	private void verify(String baseurl2) {
		try
		
		{
			URL ob=new URL(baseurl2);
			HttpURLConnection con=(HttpURLConnection)ob.openConnection();
		con.connect();
		System.out.println(con.getResponseCode());
	}
		catch(Exception e)
		{
			System.out.println("error");
		}
		
	}
	
	}
