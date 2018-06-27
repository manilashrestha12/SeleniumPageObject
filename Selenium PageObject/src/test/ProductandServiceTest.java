package test;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import page.ObjectSpyCrmPage;
import page.ProductAndServicesPage;
import page.ServicePage;
import page.NewProductPage;
import page.NewServicePage;
import page.Techfioslogin;
import util.BrowserFactory;

public class ProductandServiceTest {
	@Test
	public void addaccount() throws IOException{
			
	WebDriver driver = BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=admin/");
					
	Techfioslogin loginPage = PageFactory.initElements(driver, Techfioslogin.class);
	loginPage.login_Techfios();
	
	
	ObjectSpyCrmPage homepage = PageFactory.initElements(driver, ObjectSpyCrmPage.class);
	homepage.homepagecrm();
	
	ProductAndServicesPage productnservices = PageFactory.initElements(driver, ProductAndServicesPage.class);
	productnservices.productservices();
	
	NewProductPage product = PageFactory.initElements(driver, NewProductPage.class);
	product.addproducts();
	
	ServicePage services = PageFactory.initElements(driver, ServicePage.class);
	services.services();
	
	NewServicePage service = PageFactory.initElements(driver, NewServicePage.class);
	service.addservice();


	
}
}