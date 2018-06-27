package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AddNewAccountPage {

	WebDriver driver;

	public AddNewAccountPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
		
		@FindBy(how=How.XPATH,using="//h2[contains(text(),'Accounts')]	")
		WebElement account;
		
		
		
		@FindBy(how=How.XPATH,using="//h5[text()='Add New Account']")
		WebElement addnew;
		
		@FindBy(how=How.ID,using="account")
		WebElement accounttitle;
		
		@FindBy(how=How.ID,using="description")
		WebElement description;
		
		//@FindBy(how=How.ID,using="balance")
		//WebElement balance;
		
		@FindBy(how=How.XPATH,using="//text()[contains(.,'Submit')]/ancestor::button[1]	")
		WebElement submit;
		
	


		public void addaccounts(){
			
		    account.click();
		    addnew.click();
		    accounttitle.sendKeys("Manila");
		    description.sendKeys("Checking");
		    
		    submit.click();
		    
		    
	}
}
