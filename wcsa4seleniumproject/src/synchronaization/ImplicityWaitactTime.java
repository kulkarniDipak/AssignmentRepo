package synchronaization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicityWaitactTime {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		           WebDriver driver=new ChromeDriver();
		           driver.manage().window().maximize();
		           driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		           driver.get("http://desktop-ulk1tsq/login.do");
		            String actualLoginPageTitle = driver.getTitle();
		            
		            if(actualLoginPageTitle.equals("actiTIME - Login"))
		            {
		            	System.out.println("Login Page Title is Matched:Test case pass");
		            }
		            else
		            {
		            	System.out.println("Login Page Title is not Matched:Test case fail");
		            }
		            driver.findElement(By.name("username")).sendKeys("admin");
		 	        driver.findElement(By.name("pwd")).sendKeys("manager");
		 	        driver.findElement(By.id("loginButton")).click();
                 String actualHomePageTitle = driver.getTitle();
		 	       Thread.sleep(2000);
		 	       if(actualHomePageTitle.equals("actiTIME - Enter Time-Track"))
		 	       {
		 	    	   System.out.println("Home Page Title is Matched:Test case pass");
		 	       }
		 	       else
		 	       {
		 	    	   Thread.sleep(4000);
		 	    	   System.out.println("Home Page Title is not  Matched:Test case fail");

		 	       }
		 	       
		 	      
		 	    		
		 	       
		            
		            
	}

}
