package practices;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Waits {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
//		driver.get("http://flipkart.com");
//		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//button[text()='✕']")).click();
//		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

		driver.get("http://google.com");
		driver.manage().window().maximize();
	    WebElement add = driver.findElement(By.name("q"));
		add.sendKeys("qspiders");
//		add.sendKeys(Keys.DOWN);
		List<WebElement> allops = driver.findElements(By.xpath("//div[@class=\"UUbT9\"]"));
		
		for(int i=0;i<allops.size();i++)
		{
			if(allops.get(i).equals("qspiders kphb reviews"))
			{
			String op=allops.get(i).getText();
			
			}
		}

	}

}
