package assignment;

import java.time.Duration;
import java.util.Set;
                                                  
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question2 {
	public static void main(String[] args) throws InterruptedException {
		//How to close Parent and child browser without using quit()
		
		 WebDriver  driver=new ChromeDriver();
	     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	     driver.manage().window().maximize();
	     driver.get("http://omayo.blogspot.com/");
	     
	            
	                  driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	                  
	                  Set<String> allHandles = driver.getWindowHandles();
	                  Thread.sleep(2000);
	                  for(String wh:allHandles)
	                  {
	                	  driver.switchTo().window(wh).close();
	                  }
	      
	}

}
