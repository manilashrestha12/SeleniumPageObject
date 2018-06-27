package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewServicePage {
	WebDriver driver;

	public NewServicePage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	@FindBy(how=How.XPATH, using="//a[text()='New Service']	")
	WebElement newservice;
	
		
	
	@FindBy(how=How.ID, using="name")
	WebElement name;
	
	
	@FindBy(how=How.ID, using="sales_price")
	WebElement salesprice;
	
	@FindBy(how=How.ID, using="item_number")
	WebElement itemnumber;
	
	@FindBy(how=How.ID, using="description")
	WebElement description;
	
	@FindBy(how=How.XPATH, using="//button[text()='Submit']	")
	WebElement submit;
	
	
	
public void addservice(){
		
		
	    //searchbox.click();
	   // addproduct.click();
	   //addservices.click();
		newservice.click();
	    name.sendKeys("Manicure & Pedicure");
	    salesprice.sendKeys("$ 100");
	    itemnumber.sendKeys("101");
	    description.sendKeys("Hands and Legs  deep clean and cream massage");
	    submit.click();

	   
}	
}
