package popup;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeOptions co = new ChromeOptions();
        co.addArguments("-Start-maximized");
        Thread.sleep(2000);
        co.addArguments("--disable-notifications");
        
        
            WebDriver driver=new ChromeDriver(co);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
            driver.get("https://www.olx.in/");
            
            
            
        
                           
        
	}

}
