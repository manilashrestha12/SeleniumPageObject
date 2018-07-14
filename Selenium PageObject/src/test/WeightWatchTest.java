package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.Homepage;
import page.Techfioslogin;
import page.WeightWatchHoursPage;
import page.WeightWatchPage;
import page.WeightWatchStorePage;
import util.BrowserFactory;

public class WeightWatchTest {
	@Test
	public void loginTest() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "https://www.weightwatchers.com/us/");
					
			
	WeightWatchPage HomePage = PageFactory.initElements(driver, WeightWatchPage.class);
		
  HomePage.weightwatch();
  HomePage.homepage();
  HomePage.meetingsearch();
  
  WeightWatchStorePage watchstore = PageFactory.initElements(driver, WeightWatchStorePage.class);
  watchstore.weightwatchstore();
  watchstore.location();
  
  WeightWatchHoursPage storehour = PageFactory.initElements(driver, WeightWatchHoursPage.class);
  storehour.storetime();
	
	

}
}
