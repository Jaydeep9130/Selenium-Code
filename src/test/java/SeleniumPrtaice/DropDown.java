package SeleniumPrtaice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import freemarker.core.JavaScriptCFormat;

public class DropDown extends SetUp {
	
	@Test
	public void dropDown() throws InterruptedException {
		
		 JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		 js.executeScript("window.scrollBy(0,700)");
		
		WebElement dropdown= driver.findElement(By.xpath("//select[@id='country']"));
		
		Select drop= new Select(dropdown);
		
		Thread.sleep(4000);
		
		drop.selectByVisibleText("India");
		
		Thread.sleep(2000);
	}

	@Test
	public void dropdown1() throws InterruptedException {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 
		js.executeScript("window.scrollBy(0,700)");
		
		List<WebElement> dropdown = driver.findElements(By.xpath("//select[@id='country']"));
		
		for (WebElement element: dropdown) {
			
			System.out.println(element.getText());
		}
		
	}
}
