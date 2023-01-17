package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	       driver.get("https://www.instagram.com/accounts/login/");
	       Thread.sleep(2000);
	       driver.findElement(By.name("username")).sendKeys("admin");
	       driver.findElement(By.name("password")).sendKeys("admin@123");
	       driver.findElement(By.cssSelector("button[class='_acan _aiit _acap _aijb _acas _aj1-']")).click();
	       
	     
		
	}

}
