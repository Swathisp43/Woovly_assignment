package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_page extends BasePage{

	public Home_page(WebDriver driver) {
		super(driver);
	}
	
	@FindBy(xpath ="//div[contains(text(),'Log In')]") WebElement Login_btn;
	
	@FindBy(xpath = "//div[@class='header_wFlex__5Dxxp header_wJustifyBetween__M_o7k']//a[@class='header_alignCenter__w9VRZ']//img[1]") 
	WebElement Profile_btn;
	
	
	public void ClickLogin() {
		Login_btn.click();
	}

	public void ClickOnProfile() {
		Profile_btn.click();
	}
}
