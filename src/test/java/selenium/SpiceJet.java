package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJet {
 
	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.spicejet.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		 driver.findElement(By.xpath("//div[text()='From']")).click();
		driver.findElement(By.xpath("//div[text()='Agra']")).click();
		driver.findElement(By.xpath("//div[text()='To']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Amritsar']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Search Flight']")).click();
	
		
	}

}
