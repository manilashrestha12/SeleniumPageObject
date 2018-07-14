package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WeightWatchHoursPage {
	
WebDriver driver;
	
	public WeightWatchHoursPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}


	@FindBy(how=How.XPATH,using="//div[text()='7:45 AM – 9:30 AM']")
	WebElement hours;
	
	public void storetime(){
		
		hours.click();
	
		

}
}