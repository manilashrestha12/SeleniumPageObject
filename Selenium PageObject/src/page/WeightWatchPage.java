package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WeightWatchPage {
WebDriver driver;
	
	public WeightWatchPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.XPATH,using="//a[contains(text(),'Find a Meeting')]	")
	WebElement meeting;

	@FindBy(how=How.ID,using="meetingSearch")
	WebElement search;
	
	@FindBy(how=How.XPATH,using="//button[@class='btn btn-default form-blue-pill__btn']	")
	WebElement clickbutton;
	
	 public void weightwatch(){
			
			meeting.click();
			search.sendKeys("10011");
			clickbutton.click();
			
		}
	 
	 public void homepage(){
	    	
		  if (driver.findElement(By.xpath("//a[contains(text(),'Find a Meeting')]	")).isDisplayed())
		  
		  {
			  System.out.println("Weight Loss Program, Recipes & Help | Weight Watchers");
			  
		  }	 
	     }
	 
	 public void meetingsearch(){
	    	
		  if (driver.findElement(By.id("meetingSearch")).isDisplayed())
		  
		  {
			  System.out.println("Get Schedules & Times Near You");
			  
		  }	 
	     }

}
