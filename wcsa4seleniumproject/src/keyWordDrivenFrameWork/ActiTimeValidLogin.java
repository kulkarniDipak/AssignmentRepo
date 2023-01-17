package keyWordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeValidLogin {
	public static void main(String[] args) throws IOException {
		     
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("http://desktop-ulk1tsq/login.do");
        
        
                     Flib flib = new Flib();
                     
                     String url = flib.readPropertyData("./data/conflict.properties","Url");
                     
                    String username = flib.readPropertyData("./data/conflict.properties","Username");
                       String password = flib.readPropertyData("./data/conflict.properties","Password");
                       
                       driver.get(url);
                       
                       driver.findElement(By.name("username")).sendKeys(username);
                       driver.findElement(By.name("pwd")).sendKeys(password);
                       driver.findElement(By.id("loginButton")).click();
                       
          }
                       
        
                  
        
		
	}
	


