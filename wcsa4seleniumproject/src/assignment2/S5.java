package assignment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webDriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver  driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.bluestone.com/");
        Thread.sleep(2000);
        driver.findElement(By.id("confirmBtn")).click();
        
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//a[.='Rings ']"))).perform();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[.='Diamond' and (@title='Diamond Rings')]")).click();
	}

}
