package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ObjectSpyCrmPage {

WebDriver driver;

public ObjectSpyCrmPage(WebDriver ldriver){
	
	this.driver=ldriver;
}
// home page

@FindBy(how=How.XPATH, using="//text()[contains(.,'CRM')]/ancestor::a[1]")
WebElement crm;

@FindBy(how=How.XPATH, using="//a[text()='Add Contact']")
WebElement addcontacts;


//driver.findElement(By.xpath("//text()[contains(.,'CRM')]/ancestor::a[1] ")).click();

public void homepagecrm(){
	
	
    crm.click();
    addcontacts.click();


}


}




