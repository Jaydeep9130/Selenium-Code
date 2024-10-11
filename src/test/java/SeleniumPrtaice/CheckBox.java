package SeleniumPrtaice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CheckBox {
	WebDriver driver;

	@BeforeMethod
	public void invokeBrowser() {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
	}

	@Test
	public void SelectCheckbox() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");

		driver.findElement(By.xpath("//input[@id='sunday']")).click();

		Thread.sleep(3000);
	}

	@Test
	public void SelectallCheckBox() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");

		List<WebElement> allCheckbox = driver
				.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));

		for (WebElement cb : allCheckbox) {

			cb.click();

			Thread.sleep(2000);
		}

	}

	@AfterMethod

	public void closeBrowser() {

		driver.close();
	}

}
