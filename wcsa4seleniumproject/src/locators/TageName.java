package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TageName {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		       WebDriver driver=new ChromeDriver();
		       driver.manage().window().maximize();
		       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		       driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		       driver.findElement(By.tagName("input")).sendKeys("automation");
		
	}

}
