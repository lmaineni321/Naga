package practices;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://google.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//h3[text()='Amazon.in']")).click();
		driver.findElement(By.xpath("//h3[text()='Facebook - log in or sign up']")).click();
		//h3[text()='Facebook - log in or sign up']
		driver.findElement(By.xpath("//h3[text()='Flipkart']")).click();
		driver.findElement(By.xpath("//h3[text()='Myntra: Online Shopping for Women, Men, Kids Fashion ...']")).click();
	}


}
