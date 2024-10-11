package SeleniumPrtaice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import freemarker.core.JavaScriptCFormat;

public class ActionsClass extends SetUp {

	@Test
	public void actionClass() throws InterruptedException {

		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");

		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));

		WebElement drop = driver.findElement(By.xpath("//div[@id='droppable']"));

		Actions action = new Actions(driver);

		Thread.sleep(4000);

		
	}
}
