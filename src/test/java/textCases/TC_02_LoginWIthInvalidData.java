package textCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_Objects.Home_page;
import page_Objects.Login_page;
import page_Objects.Profile_page;
import testBase.Base_class;

public class TC_02_LoginWIthInvalidData extends Base_class{
	
	@Test(priority =2)
	public void Test_UserloginWithinvalidData() {
		
		
	Home_page hp = new Home_page(driver);
	
	hp.ClickLogin();
	
	Login_page lp = new Login_page(driver);
	lp.EnterEmail("test@");
	lp.ClickNext();
	lp.EnterPassword("Password");
	lp.ClickContinue();
	
	hp.ClickOnProfile();
	
	Profile_page pp = new Profile_page(driver);
	pp.Myposttext();
	Assert.assertEquals(pp.Myposttext(), true);
		
	}
}
