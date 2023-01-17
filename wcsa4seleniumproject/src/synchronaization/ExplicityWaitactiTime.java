package synchronaization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class ExplicityWaitactiTime {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("http://desktop-ulk1tsq/login.do");
        
                WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(40));
                Boolean check = wait.until(ExpectedConditions.titleContains(""));
                String actualLoginPageTitle = driver.getTitle();
                System.out.println("login page title is matched: Tesrt case pass");
                
                
                

	}

}
