package page_Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Profile_page extends BasePage{

	public Profile_page(WebDriver driver) {
		super(driver);	
	}
	
	@FindBy(xpath ="//p[contains(text(),'My Posts')]") 
	WebElement My_post;
	
	public boolean Myposttext() {
		
		if(My_post.getText().equals("My Posts")) {
			return true;
		}
		return false;
	}

}
