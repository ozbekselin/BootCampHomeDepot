package PageObjectModel;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class PersonalAccount {
	
	public WebDriver driver;
	
	@FindBy(xpath = "//*[contains (text(),'Select & Continue')]")WebElement PerAccount;
	

	public PersonalAccount (WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
		public void PerAccountClick() {
			PerAccount.click();

}
		
}
