package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("file:///C:/Users/Shree/Desktop/WCSA4/conformation.html");
        WebElement button = driver.findElement(By.xpath("//button[.='Click me! ']"));
        button.click();
      
        
              Alert a1 = driver.switchTo().alert();
              Thread.sleep(2000);
              
              //accept the popup
                a1.accept();
              
              //dismiss the popup
              a1.dismiss();
              
        
	}

}
