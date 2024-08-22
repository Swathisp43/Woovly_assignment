package testBase;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.ResourceBundle;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import org.testng.annotations.Parameters;

public class Base_class {

	public static WebDriver driver;
//	public ResourceBundle rb;

	@BeforeClass
	@Parameters("browser")
	public void setup(String br) {
		if (br.equals("Chrome")) {
			driver = new ChromeDriver();
		} else if (br.equals("Edge")) {
			driver = new EdgeDriver();
		}
		if (br.equals("FireFox")) {
			driver = new FirefoxDriver();
		}
		// rb = ResourceBundle.getBundle("config");
		driver.manage().deleteAllCookies();
		driver.get("https://woovly.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}

	@AfterClass
	public void teardown() {
		driver.quit();
	}

	public String captureScreen(String tname) {

		String timeStamp = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());

		TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
		File source = takesScreenshot.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir") + "\\screenshots\\" + tname + "_" + timeStamp + ".png";

		try {
			FileUtils.copyFile(source, new File(destination));
		} catch (Exception e) {
			e.getMessage();
		}
		return destination;
	}

}
