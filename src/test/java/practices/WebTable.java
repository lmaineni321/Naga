package practices;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
//		WebDriverManager.firefoxdriver().setup();
//		WebDriver driver=new FirefoxDriver();
		WebDriver driver=new ChromeDriver();
//		driver.get("http://olympics.com");
//		driver.manage().window().maximize();
//		driver.getCurrentUrl();
//		driver.getTitle();
//		driver.findElement(By.xpath("//button[text()='Yes, I am happy']")).click();
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		
//		for(int i=0;i<links.size();i++)
//		{
//			
//		 System.out.println(links.get(i).getAttribute("href"));
//		}

		driver.get("http://amazon.in");	
		driver.manage().window().maximize();
//		driver.findElement(By.xpath("//div[@class=\"nav-search-scope nav-sprite\"]")).click();
//		driver.findElement(By.linkText("Web browser automation")).click();
		}

}
