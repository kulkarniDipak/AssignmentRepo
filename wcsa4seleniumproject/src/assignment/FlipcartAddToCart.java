package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FlipcartAddToCart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver  driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	     driver.manage().window().maximize();
	     driver.get("https://www.flipkart.com/");
	     driver.findElement(By.xpath("//button[.='✕']")).click();
	     driver.findElement(By.xpath("//input[@class='_3704LK']")).sendKeys("iPhone14");
	     driver.findElement(By.xpath("//button[@class='L0Z3Pu']")).click();
	     driver.findElement(By.xpath("//div[@class='_4rR01T' and .='APPLE iPhone 14 (Blue, 128 GB)']")).click();
	     
	     Set<String> allHandles = driver.getWindowHandles();
	     for(String phone :allHandles)
	     {
	    	 driver.switchTo().window(phone);
	     }
	     driver.findElement(By.xpath("//a[@class='_1fGeJ5' and .='256 GB']")).click();
	     driver.findElement(By.xpath("(//div[@class='_2C41yO'])[3]")).click();
	     driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	     
	                                     
	    
		
	}

}
