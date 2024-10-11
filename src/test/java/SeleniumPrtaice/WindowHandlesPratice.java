package SeleniumPrtaice;

import java.util.Set;

import org.checkerframework.checker.units.qual.s;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowHandlesPratice {

	WebDriver driver;

	@Test
	public void HandleMultipleWindow() throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.geeksforgeeks.org/");

		driver.manage().window().maximize();

		Thread.sleep(3000);

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,700)");

		driver.findElement(By.xpath("(//button[text()=\"Explore now\"])[1]")).click();

		Thread.sleep(2000);

		Set<String> child = driver.getWindowHandles();
		
		System.out.println(child);
		
		for(String a:child) {
			
			driver.switchTo().window(a);
			
			
		}
	}

}
