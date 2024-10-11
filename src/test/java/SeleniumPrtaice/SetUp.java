package SeleniumPrtaice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SetUp {
	
	WebDriver driver;
	
	@BeforeMethod
	public void invokeBrowser() {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
	}
	
	@AfterMethod

	public void closeBrowser() {

		driver.quit();
	}


}
