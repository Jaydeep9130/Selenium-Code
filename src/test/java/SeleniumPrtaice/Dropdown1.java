package SeleniumPrtaice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdown1 extends SetUp {

	@Test
	public void dropDown() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor) driver;

		js.executeScript("window.scrollBy(0,1000)");

		WebElement Dropdown = driver.findElement(By.xpath("//select[@id='colors']"));

		Select dd = new Select(Dropdown);

		dd.selectByVisibleText("Red");

		Thread.sleep(3000);

	}

}
