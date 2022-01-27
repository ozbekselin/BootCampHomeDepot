package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateAnAccount {
	
	public WebDriver driver;
	
	//@FindBy(xpath = "//*[contains (text(),'Create an Account')][2]") WebElement CreateAccount1;
	@FindBy(xpath = "//span[normalize-space()='Create an Account']") WebElement CreateAccount1;

	
	public CreateAnAccount(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void CreateAccountClick1() {
		CreateAccount1.click();
	}
}
