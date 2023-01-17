package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrmvalid {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        
                Flib flib = new Flib();
                String username = flib.readExcelData("./data/OrangeHrmData.xlsx", "validcreds", 1, 0);
                String password = flib.readExcelData("./data/OrangeHrmData.xlsx", "validcreds", 1, 1);
                
                
                driver.findElement(By.name("username")).sendKeys("Admin");
                driver.findElement(By.name("password")).sendKeys("admin123");
                driver.findElement(By.cssSelector("button[type='submit']")).click();
                 
        
	}

}
