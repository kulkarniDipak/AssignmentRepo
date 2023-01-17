package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
		          WebDriver  driver=new ChromeDriver();
		          driver.manage().window().maximize();
		          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		          driver.navigate().to("https://jqueryui.com/droppable/");
		          Thread.sleep(2000);
		          
		          WebElement frame = driver.findElement(By.xpath("//*[@id=\"content\"]/iframe"));
		          driver.switchTo().frame(frame);
		          Thread.sleep(2000);
		          
		          WebElement src = driver.findElement(By.id("draggable"));
		          Thread.sleep(2000);
		         WebElement target = driver.findElement(By.id("droppable"));
		         Actions act=new Actions(driver);
		         Thread.sleep(2000);
		         act.dragAndDrop(src, target).perform();
	}
	}
		          
		            
