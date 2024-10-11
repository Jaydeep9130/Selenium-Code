package SeleniumPrtaice;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertHandling {
	WebDriver driver;

	@BeforeMethod
	public void invokeBrowser() {

		driver = new ChromeDriver();

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.get("https://testautomationpractice.blogspot.com/");

		driver.manage().window().maximize();
	}

	@Test
	public void SimpleAlert() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='Alert']")).click();

		Alert al = driver.switchTo().alert();

		Thread.sleep(3000);

		String altext = al.getText();

		System.out.println(altext);

		al.accept();

	}

	@Test
	public void confirmAlert() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();

		Thread.sleep(3000);

		Alert al1 = driver.switchTo().alert();

		al1.accept();

		String result = driver.findElement(By.xpath("//p[@id='demo']")).getText();

		System.out.println(result);

	}

	@Test
	public void promtAlert() throws InterruptedException {

		driver.findElement(By.xpath("//button[text()='Prompt']")).click();

		Thread.sleep(3000);

		Alert al2 = driver.switchTo().alert();

		al2.sendKeys("Jaydeep");

		Thread.sleep(3000);

		al2.accept();

		String result1 = driver.findElement(By.xpath("//p[@id='demo']")).getText();

		System.out.println(result1);

	}

	@AfterMethod

	public void closeBrowser() {
		driver.close();

	}

}
