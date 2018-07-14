package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WeightWatchStorePage {
	
WebDriver driver;
	
	public WeightWatchStorePage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.XPATH,using="//span[text()='WEIGHT WATCHERS STORE 23RD ST-5TH AVE']	")
	WebElement store;

	public void weightwatchstore(){
		
		store.click();
	}
	public void location(){
	    	
			  if (driver.findElement(By.xpath("//span[text()='WEIGHT WATCHERS STORE 23RD ST-5TH AVE']	")).isDisplayed())
			  {
		
				  System.out.println("WEIGHT WATCHERS STORE 23RD ST-5TH AVE\r\n" + 
				  		"14 W 23RD ST 2ND FL\r\n" + 
				  		"NEW YORK, NY 10010");
				  
			  }
}
}
		   


