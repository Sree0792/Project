package test;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import page.Fbcreatepage;

public class Fbcreatepagetest extends Baseclass {

@Test
public void createpage() {

	Fbcreatepage ob1=new Fbcreatepage(driver);
	ob1.createPageLinkClick();
	ob1.getStartedButtonClick();
	
	
}
}
