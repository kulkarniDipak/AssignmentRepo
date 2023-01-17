package assignment2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class scenario4 {
	public static void main(String[] args) throws AWTException, InterruptedException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.ebay.com/");
        driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("apple Watch");
        driver.findElement(By.xpath("//input[@class='btn btn-prim gh-spr']")).click();
        
                             Robot robot = new Robot();
                             int i=0;
                             while(i>=0)
                             {
                            	 robot.keyPress(KeyEvent.VK_PAGE_DOWN);
                            	 robot.keyRelease(KeyEvent.VK_PAGE_DOWN);
                            	 if(i==4)
                            	 {
                            		 robot.keyPress(KeyEvent.VK_ENTER);
                            		 Thread.sleep(2000);
                            		 robot.keyRelease(KeyEvent.VK_ENTER);
                            	 }
                             }
                       
                            

	}

}
