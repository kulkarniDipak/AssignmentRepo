package locators;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ID {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	       driver.get("http://desktop-ulk1tsq/login.do");
	       Thread.sleep(2000);
	       driver.findElement(By.name("username")).sendKeys("admin");
	       Thread.sleep(2000);
	       driver.findElement(By.name("pwd")).sendKeys("manager");
	       driver.findElement(By.id("loginButton")).click();
	       driver.close();
	      
	}

}
