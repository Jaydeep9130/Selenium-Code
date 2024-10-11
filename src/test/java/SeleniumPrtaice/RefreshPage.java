package SeleniumPrtaice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RefreshPage {

	WebDriver driver;

	@Test
	public void refreshPage() throws InterruptedException, IOException {

		driver = new ChromeDriver();

		// driver.get("https://testautomationpractice.blogspot.com/");

		driver.navigate().to("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		driver.navigate().refresh();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,500)");

		TakesScreenshot src = (TakesScreenshot) driver;

		File file = src.getScreenshotAs(OutputType.FILE);

		File dest = new File("D:\\\\driver\\\\homePageScreenshot1.png");

		FileUtils.copyFile(file, dest);

		Thread.sleep(2000);

		driver.close();

	}
}
