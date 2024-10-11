package SeleniumPrtaice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class HandleFrames extends SetUp {
	@Test
	public void handleFrames() throws InterruptedException {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("window.scrollBy(0,1000)");
		
		driver.switchTo().frame("frame-one796456169");
		
		driver.findElement(By.xpath("//input[@class='text_field']")).sendKeys("Jaydeep Naniwadekar");
		
		Thread.sleep(5000);

	}
}
