package webDriverMethod;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ManageMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(2000);
             Dimension targetSize = new Dimension(400,500);
             driver.manage().window().setSize(targetSize);
             Thread.sleep(2000);
              Point targetPosition = new Point(30,300);
              driver.manage().window().setPosition(targetPosition);
              driver.close();
             
                  
        
	}
}
