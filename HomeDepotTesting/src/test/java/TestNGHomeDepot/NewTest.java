package TestNGHomeDepot;


import org.testng.annotations.Test;

import Common.Utility;
import PageObjectModel.CreateAnAccount;
import PageObjectModel.HomeofHomeDepot;
import PageObjectModel.PersonalAccount;
import PageObjectModel.Personalnformation;

public class NewTest extends Utility {
  @Test
  public void HomeDepottest () throws InterruptedException {
	  
	    HomeofHomeDepot ob=new HomeofHomeDepot(driver);
		Thread.sleep(2000);
		ob.MyToClick();
	    Thread.sleep(2000);
		ob.SignClick();
		Thread.sleep(2000);
	
		CreateAnAccount ob1=new CreateAnAccount(driver);
		Thread.sleep(2000);
		ob1.CreateAccountClick1();
		
		PersonalAccount ob2=new PersonalAccount(driver);
		Thread.sleep(2000);
		ob2.PerAccountClick();
		
	    Personalnformation ob3=new Personalnformation (driver);
	    Thread.sleep(2000);
	    ob3.EmailFieldSendKeys();
	    Thread.sleep(2000);
		ob3.PasswordSendKeys();
		Thread.sleep(2000);
		ob3.ZipCodeSendKeys();
		Thread.sleep(2000);
		ob3.PhoneSendKeys();
		Thread.sleep(2000);
		ob3.CreateAccountClick2();
        Thread.sleep(2000);
		
}
  
}
