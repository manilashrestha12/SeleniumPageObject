package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class ProductAndServicesPage {
	
	WebDriver driver;


	public ProductAndServicesPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	// Dashboard

	@FindBy(how=How.XPATH, using="//span[text()='Products & Services']	")
	WebElement productservices;

	@FindBy(how=How.XPATH, using="//a[text()='Products']	")
	WebElement products;
	
public void productservices(){
		
		
	    productservices.click();
	    products.click();


	}

}
