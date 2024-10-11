package SeleniumPrtaice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ch.qos.logback.core.joran.action.Action;

public class DragaAndDrop {

	WebDriver driver;

	@BeforeMethod
	public void invokeBrowser() {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
	}

	@Test
	public void dragAndDrop() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,700)");

		WebElement drag = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));

		WebElement drop = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));

		Actions ac = new Actions(driver);

		ac.dragAndDrop(drag, drop).build().perform();
		
		

		Thread.sleep(6000);

	}

	@AfterMethod

	public void closeBrowser() {

		driver.close();
	}

}
