package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeIdLocator {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		           WebDriver driver=new ChromeDriver();
		           driver.manage().window().maximize();
		           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		           driver.get("http://desktop-ulk1tsq/login.do");
		           
		           
		           driver.findElement(By.name("username")).sendKeys("admin");
		           driver.findElement(By.name("pwd")).sendKeys("manager");
                   driver.findElement(By.id("loginButton")).click();		           
	}

}
