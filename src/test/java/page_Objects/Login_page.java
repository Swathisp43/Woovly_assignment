package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_page extends BasePage {

	public Login_page(WebDriver driver) {
		super(driver);
	}

	@FindBy(xpath = "(//input[@placeholder='Enter mobile number or email id'])[2]")
	WebElement Email_txt;

	@FindBy(xpath = "(//input[@type='submit'])[2]")
	WebElement Next_btn;

	@FindBy(name = "password")
	WebElement Password_txt;

	@FindBy(xpath = "//input[@value='Continue']")
	WebElement Continue_btn;

	public void EnterEmail(String email) {
		Email_txt.sendKeys(email);
	}

	public void ClickNext() {
		Next_btn.click();
	}

	public void EnterPassword(String pswd) {
		Password_txt.sendKeys(pswd);
	}

	public void ClickContinue() {
		Continue_btn.click();
	}

}
