package SeleniumPrtaice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GoogleSerch {
	
	WebDriver driver;
	
	@Test
	public void googleSearch() throws InterruptedException {
		
		driver=new ChromeDriver();
		
		driver.get("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@title='Search']")).sendKeys("cypress automation");
		
		Thread.sleep(3000);
		
		List<WebElement> result=driver.findElements(By.xpath("//div[@class='eIPGRd']"));
		
		//String result=driver.findElement(By.xpath("(//div[@class='eIPGRd'])[4]")).getText();
		
		//System.out.println(result);
		
		
		
		for(int i=0;i<result.size();i++) {
			
			String result1=result.get(i).getText();
			
			System.out.println(result1);
		}
		
		driver.close();
		
	}

}
