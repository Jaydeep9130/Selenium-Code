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

public class Screenshots {

	WebDriver driver;

	@Test
	public void TakeScreeshot() throws IOException {

		driver = new ChromeDriver();

		driver.get("https://results.eci.gov.in/PcResultGenJune2024/index.htm");

		driver.manage().window().maximize();
		
		

		TakesScreenshot src = (TakesScreenshot) driver;

		File path = src.getScreenshotAs(OutputType.FILE);

		File dest = new File("D:\\driver\\homePageScreenshot.png");

		FileUtils.copyFile(path, dest);
		
		

		driver.close();

	}

}
