package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.AddNewAccountPage;
import page.BankAndCashPage;
import page.ObjectSpyCrmPage;
import page.Techfioslogin;
import util.BrowserFactory;

public class AddNewAccountTest {

	
	@Test
	public void addaccount() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
	Techfioslogin loginPage = PageFactory.initElements(driver, Techfioslogin.class);
	loginPage.login_Techfios();
	
	
	ObjectSpyCrmPage homepage = PageFactory.initElements(driver, ObjectSpyCrmPage.class);
	homepage.homepagecrm();
			
				
	BankAndCashPage addaccount = PageFactory.initElements(driver, BankAndCashPage.class);
	addaccount.bankcash();
	
	AddNewAccountPage newaccount = PageFactory.initElements(driver, AddNewAccountPage.class);
	newaccount.addaccounts();
	
	driver.close();

	driver.quit();
					
		
	}
	}

