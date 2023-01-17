package popup;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopup {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("file:///C:/Users/Shree/Desktop/WCSA4/alret1.html");
        
        WebElement button = driver.findElement(By.xpath("//button[.='Click me! ']"));
        button.click();
        
               Alert a1 = driver.switchTo().alert();
               Thread.sleep(2000);
               
              // accept the popup
               a1.accept();
               Thread.sleep(2000);
               
              // text of alert popup
              String a = a1.getText();
              System.out.println(a);
              
              // dismiss a alert popup
              Thread.sleep(2000);
              a1.dismiss();
              
              //get a exception ElementNotInteractableException
               Thread.sleep(2000);
               a1.sendKeys("admin");
               
 
	}

}
