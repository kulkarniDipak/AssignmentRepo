package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
                                                 //how to close child window
public class Question4 {
public static void main(String[] args) {
	WebDriver  driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
    driver.manage().window().maximize();
    driver.get("http://omayo.blogspot.com/");
    
           
                 driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
                 
                 String parentHandles = driver.getWindowHandle();
                 System.out.println(parentHandles);
                 System.out.println("-----------------------------------");
                 Set<String> allHandles = driver.getWindowHandles();
                 for(String wh:allHandles)
                 {
                	System.out.println(wh); 
                	if(!parentHandles.equals(wh))
                	{
                		driver.switchTo().window(wh).close();
                	}
                	else
                	{
                		
                	}
                 }
     
}
}
