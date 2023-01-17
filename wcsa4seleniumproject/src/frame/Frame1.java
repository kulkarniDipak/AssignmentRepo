package frame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		             WebDriver  driver=new ChromeDriver();
		             driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		             driver.manage().window().maximize();
		             driver.get("https://www.bluestone.com/");
		             
		             WebElement frame = driver.findElement(By.id("fc_widget"));
		             Thread.sleep(2000);
		             driver.switchTo().frame(frame);
		             driver.findElement(By.xpath("//div[@class='d-hotline h-btn animated zoomIn faster     ']")).click();
	}

}
