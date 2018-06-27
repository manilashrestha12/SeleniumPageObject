package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class NewProductPage {

	WebDriver driver;

	public NewProductPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	// Dashboard
	
	
	
	
	@FindBy(how=How.XPATH, using="//a[text()='New Product']")
	WebElement newproduct;
	
		
	
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

	
public void addproducts(){
		
		
	    //searchbox.click();
	   // addproduct.click();
	   //addservices.click();
		newproduct.click();
	    name.sendKeys("Apple Pie");
	    salesprice.sendKeys("$ 2.50");
	    itemnumber.sendKeys("50");
	    description.sendKeys("Pie made out of green Apples");
	    submit.click();

	   
	}
}
