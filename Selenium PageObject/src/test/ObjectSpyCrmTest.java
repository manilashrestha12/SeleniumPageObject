package test;
import java.io.IOException;

	import org.junit.Test;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.support.PageFactory;

import page.ObjectSpyAddContacts;
import page.ObjectSpyCrmPage;
import page.Techfioslogin;
import util.BrowserFactory;


	public class ObjectSpyCrmTest {
		
		@Test
		public void addcontact() throws IOException{
				
		WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
						
		Techfioslogin loginPage = PageFactory.initElements(driver, Techfioslogin.class);
		loginPage.login_Techfios();
		
		
		ObjectSpyCrmPage homepage = PageFactory.initElements(driver, ObjectSpyCrmPage.class);
		homepage.homepagecrm();
				
					
		ObjectSpyAddContacts addcontact = PageFactory.initElements(driver, ObjectSpyAddContacts.class);
		addcontact.addcontacts();
		
		driver.close();

		driver.quit();
						
			
		}
		}

