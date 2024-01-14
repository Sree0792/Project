

package page;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.Test;

public class Facebookloginpage {
	
	
	
	WebDriver driver;
	
	@FindBy(id="email")
	WebElement fbemail; 
	
	@FindBy(id="pass")
	WebElement fbPass; 
	
	@FindBy(name="login")
	WebElement fbLogin; 
	
	//By fbemail=By.id("email");
	//By fbpassword=By.id("pass");
	//By fblogin=By.name("login");
	


	public Facebookloginpage(WebDriver driver)
	{
	this.driver=driver;	
	PageFactory.initElements(driver,this);
	}
	
	
	public void setValues(String un,String pswd)
	{
		
	fbemail.sendKeys(un);
	fbPass.sendKeys(pswd);
}
	
	
	public void loginClick()
	{
		fbLogin.click();
	}
	

}
