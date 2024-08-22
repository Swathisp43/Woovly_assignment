package textCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_Objects.Home_page;
import page_Objects.Login_page;
import page_Objects.Profile_page;
import testBase.Base_class;

public class TC_01_UserLogin extends Base_class {

	@Test(priority =1)
	public void Test_Userlogin() {
	Home_page hp = new Home_page(driver);
	
	hp.ClickLogin();
	
	Login_page lp = new Login_page(driver);
	lp.EnterEmail("swathipallennagari2125@gmail.com");
	lp.ClickNext();
	lp.EnterPassword("Sw@thisp2125");
	lp.ClickContinue();
	
	hp.ClickOnProfile();
	
	Profile_page pp = new Profile_page(driver);
	pp.Myposttext();
	Assert.assertEquals(pp.Myposttext(), true);
}
}
