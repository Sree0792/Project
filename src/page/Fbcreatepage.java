package page;

//import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbcreatepage {

	WebDriver driver;
	@FindBy(xpath="//*[@id=\"reg_pages_msg\"]/a")
	WebElement createpagelink;
	
	@FindBy(xpath="//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[2]/div/div[1]/div[2]/button/div/div")
	WebElement getstartedbutton;
	
	//By createpagelink=By.xpath("//*[@id=\"reg_pages_msg\"]/a");
	//By getstartedbutton=By.xpath("//*[@id=\"content\"]/div/div[2]/div/div[2]/table/tbody/tr/td[1]/div/div[1]/div[2]/button/div/div");
	
	public Fbcreatepage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	public void createPageLinkClick()
	{
		createpagelink.click();
		
	}
	
	
	public void getStartedButtonClick()
	{
		getstartedbutton.click();
	}
	
}
