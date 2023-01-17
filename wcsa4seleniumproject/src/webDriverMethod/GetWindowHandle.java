package webDriverMethod;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowHandle {
public static void main(String[] args) {
	 WebDriver  driver=new ChromeDriver();
     driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
     driver.manage().window().maximize();
     driver.get("http://omayo.blogspot.com/");
     
                  driver.findElement(By.xpath("//a[.='Open a popup window']")).click();
                           String parentHandle = driver.getWindowHandle();
                           System.out.println(parentHandle);
                           
                           System.out.println("------------------------");
                           Set<String> allHandles = driver.getWindowHandles();
                           for(String a:allHandles)
                           {
                        	   System.out.println(a);
                           }
     
}
}
