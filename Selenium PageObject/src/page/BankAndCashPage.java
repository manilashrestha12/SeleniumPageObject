package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class BankAndCashPage {

	WebDriver driver;

	public BankAndCashPage(WebDriver ldriver){
		
		this.driver=ldriver;
	}
	// Dashboard

	@FindBy(how=How.XPATH, using="//span[text()='Bank & Cash']	")
	WebElement bank;

	@FindBy(how=How.XPATH, using="//a[text()='New Account']	")
	WebElement newaccount;



	public void bankcash(){
		
		
	    bank.click();
	    newaccount.click();


	}


	}	
	
	

