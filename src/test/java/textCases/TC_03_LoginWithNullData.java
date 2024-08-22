package textCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import page_Objects.Home_page;
import page_Objects.Login_page;
import page_Objects.Profile_page;
import testBase.Base_class;

public class TC_03_LoginWithNullData extends Base_class{
	@Test(priority =3)
	public void TestWithNullData() {
		Home_page hp = new Home_page(driver);
		
		hp.ClickLogin();
		
		Login_page lp = new Login_page(driver);
		lp.EnterEmail("");
		lp.ClickNext();
		lp.EnterPassword("");
		lp.ClickContinue();
		
		hp.ClickOnProfile();
		
		Profile_page pp = new Profile_page(driver);
		pp.Myposttext();
		Assert.assertEquals(pp.Myposttext(), true);
	}

}
