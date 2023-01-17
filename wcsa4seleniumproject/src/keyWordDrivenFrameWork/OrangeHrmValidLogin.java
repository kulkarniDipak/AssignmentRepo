package keyWordDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmValidLogin {
	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
                  Flib flib = new Flib();
                  String url = flib.readPropertyData("./data/orangehrm.properties","Url");
                  String username = flib.readPropertyData("./data/orangehrm.properties","Username");
                  String password = flib.readPropertyData("./data/orangehrm.properties","Password");
                  driver.get(url);
        
        
        driver.findElement(By.name("username")).sendKeys(username);
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys(password);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("button[type='submit']")).click();
         
	}

}
