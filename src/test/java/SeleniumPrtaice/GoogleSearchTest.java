package SeleniumPrtaice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSearchTest  {
	
	@Test
	public void googleSearch() throws InterruptedException {
		
		WebDriver driver;
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Selenium");
		
		Thread.sleep(2000);
		
		driver.close();
	}

}
