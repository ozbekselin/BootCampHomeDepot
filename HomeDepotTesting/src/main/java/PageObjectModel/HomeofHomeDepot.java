package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeofHomeDepot {
	
	
	public WebDriver driver;
	
	
	@FindBy(xpath = "//*[contains (text(),'My Account')]") WebElement My;
	@FindBy(xpath = "//*[contains (text(),' Sign in ')]") WebElement Sign;
	
	public HomeofHomeDepot(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
 

}
 public void MyToClick() {
		My.click();
		
 }
 
 public void SignClick () {
		Sign.click();
		
 }
 

}
