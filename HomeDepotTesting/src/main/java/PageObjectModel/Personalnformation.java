package PageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Personalnformation {
	
	public WebDriver driver;
	
	@FindBy(name = "email") WebElement Email;
	@FindBy(id = "password-input-field") WebElement Password;
	@FindBy(id = "zipCode") WebElement ZipCode;
	@FindBy(id = "phone") WebElement Phone;
	@FindBy(xpath = "//*[contains (text(),'Create an Account')]")  WebElement CreateAccount2;
	
	public Personalnformation (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void EmailFieldSendKeys() {
		Email.sendKeys("ozbekselin@endustriteknik.com");
	}
	
	public void PasswordSendKeys() {
		Password.sendKeys("Selinozbek1982@");
	}
	
	public void ZipCodeSendKeys() {
		ZipCode.sendKeys("22181");
}
	public void PhoneSendKeys() {
		Phone.sendKeys("4714517438");
}
	
	public void CreateAccountClick2() {
		CreateAccount2.click();
		
	}
	
}
