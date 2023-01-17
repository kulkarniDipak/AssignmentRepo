package webDriverMethod;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethod {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
         driver.navigate().to("https://www.google.com/");
         Thread.sleep(2000);
         driver.switchTo().activeElement().sendKeys("java",Keys.ENTER);
         Thread.sleep(2000);
         driver.navigate().back();
         Thread.sleep(2000);
         driver.navigate().forward();
         Thread.sleep(2000);
         driver.navigate().refresh();
        
         
	}

}
