package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubeShort {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		                  WebDriver driver=new ChromeDriver();
		                  driver.manage().window().maximize();
		                  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		                  driver.get("https://www.youtube.com/");
		                  List<WebElement> nameOfShort = driver.findElements(By.xpath("//span[@class='style-scope ytd-rich-grid-slim-media']"));
		                  Thread.sleep(2000);
		                  for(WebElement name:nameOfShort) 
		                  {
		                	       String opt = name.getText();
		                	       Thread.sleep(2000);
		                	       System.out.println(opt);
		                  }
		                             List<WebElement> views = driver.findElements(By.xpath("//span[@class='inline-metadata-item style-scope ytd-video-meta-block']"));
		                             for(WebElement viewsOfShort:views) 
		                             {
		                            	          String opt1 = viewsOfShort.getText();
		                            	          Thread.sleep(2000);
		                            	          System.out.println(opt1);
		                             }
		                             
	
		                            	 
		          } 
	}


