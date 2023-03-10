package assignment;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
                                                 //Perform (maximize) operation in child browser
public class Question5 {
	public static void main(String[] args) {
		WebDriver  driver=new ChromeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	    driver.manage().window().maximize();
	    driver.get("http://omayo.blogspot.com/");
	    
	           
	         driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
	         String parentTitle = driver.getTitle();
	         
	         Set<String> allHandles = driver.getWindowHandles();
	         {
	        	 for(String wh:allHandles)
	        	 {
	        		         String currentTitle = driver.switchTo().window(wh).getTitle();
	        		         System.out.println(currentTitle );
	        		         
	        		         if(parentTitle.equals(currentTitle))
	        		         {
	        		        	 driver.manage().window().maximize();
	        		         }
	        		         else
	        		         {
	        		        	 driver.quit();
	        		         }
	        	 }
	         }
	                          
	    
	}

}
