package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import page.Techfioslogin;
import util.BrowserFactory;

public class TechfiosLoginTest {

	
	@Test
	public void loginTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
			
	Techfioslogin loginPage = PageFactory.initElements(driver, Techfioslogin.class);			
	loginPage.login_Techfios();
	
	
	driver.close();

	driver.quit();
					
		
	}
	}
