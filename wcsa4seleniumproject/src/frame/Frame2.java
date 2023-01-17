package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {
	public static void main(String[] args) throws InterruptedException {
	     WebDriver  driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
         driver.manage().window().maximize();
         driver.get("https://www.bluestone.com/");
         driver.findElement(By.xpath("//span[@id='denyBtn']")).click();
         driver.findElement(By.id("fc_widget"));
         Thread.sleep(2000);
         driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster     ']")).click();
         driver.switchTo().defaultContent();
         driver.findElement(By.xpath("//input[@id='chat-fc-name']")).sendKeys("admin");
         
}
	}


