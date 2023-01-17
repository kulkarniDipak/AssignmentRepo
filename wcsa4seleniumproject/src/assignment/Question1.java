package assignment;

import java.time.Duration;
                                   
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question1 {
	public static void main(String[] args) throws InterruptedException {
		//how to close parent and child browser
		
		 WebDriver  driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	     driver.manage().window().maximize();
	     driver.get("http://omayo.blogspot.com/");
	     
	            
	                  driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	                  Thread.sleep(2000);
	                  driver.quit();
	}

}
