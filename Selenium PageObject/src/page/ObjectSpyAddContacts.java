package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ObjectSpyAddContacts {

WebDriver driver;

public ObjectSpyAddContacts(WebDriver ldriver){
	
	this.driver=ldriver;
}
// username=Id= user_login
@FindBy(how=How.ID,using="account")
WebElement account;

@FindBy(how=How.ID,using="company")
WebElement company;

@FindBy(how=How.ID, using="email")
WebElement email;

@FindBy(how=How.ID, using="phone")
WebElement phone;

@FindBy(how=How.ID, using="address")
WebElement address;

@FindBy(how=How.ID, using="city")
WebElement city;

@FindBy(how=How.ID, using="state")
WebElement state;

@FindBy(how=How.ID, using="zip")
WebElement zip;

@FindBy(how=How.ID, using="submit")
WebElement submit;






public void addcontacts(){
	
	account.sendKeys("Anila Shrestha");
	company.sendKeys("MK");
	email.sendKeys("just_manila@yahoo.com");
	phone.sendKeys("4698264004");
	address.sendKeys("5075 Richmond Dr");
	city.sendKeys("Dallas");
	state.sendKeys("TX");
	zip.sendKeys("75288");
	submit.click();
	}


}

