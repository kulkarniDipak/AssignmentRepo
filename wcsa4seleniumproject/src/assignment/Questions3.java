package assignment;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
                                                 // how to close parent browser
public class Questions3 {
	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	     driver.manage().window().maximize();
	     driver.get("http://omayo.blogspot.com/");
	     
	            
	                  driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	                  driver.close();
	      
	}

}
