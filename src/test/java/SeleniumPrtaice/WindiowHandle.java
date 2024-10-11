package SeleniumPrtaice;

import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class WindiowHandle extends SetUp {
	@Test
	public void handleMultipleWindow() throws InterruptedException {
		
		driver.findElement(By.xpath("//button[text()='New Browser Window']")).click();
		
		Set<String> handles=driver.getWindowHandles();
		
		System.out.println(handles);
		
		for (String Handle:handles) {
			
			driver.switchTo().window(Handle);
			
			Thread.sleep(2000);
			
			System.out.println("The Title is:"+ driver.getTitle());
			
			
		}
	}

}
