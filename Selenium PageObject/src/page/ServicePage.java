package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ServicePage {
	WebDriver driver;

	public ServicePage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
		@FindBy(how=How.XPATH, using="//a[text()='Services']	")
		WebElement service;
		
		@FindBy(how=How.XPATH, using="//input[@type='text'][@placeholder='Search']")
		WebElement searchbar;
		
		//@FindBy(how=How.XPATH, using="//button[contains(text(),'Search')]	")
		//WebElement searchbotton;
		
		
		public void services(){
			
			
		    service.click();
		    searchbar.sendKeys("Auto");
		    //searchbotton.click();
}
}