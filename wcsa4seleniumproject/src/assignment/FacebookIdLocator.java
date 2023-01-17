 package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookIdLocator {
                 public static void main(String[] args) {
                	 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
                	           WebDriver driver=new ChromeDriver();
                	           driver.manage().window().maximize();
                	           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
                	           driver.get("https://www.facebook.com/login/");
                	           
                	           driver.findElement(By.id("email")).sendKeys("dipak");
                	           driver.findElement(By.id("pass")).sendKeys("admin@123");
                	           driver.findElement(By.id("loginbutton")).click();
                	           
				}
}
