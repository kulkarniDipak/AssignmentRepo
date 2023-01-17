package methodOfWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsEnabledMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.instagram.com/accounts/login/");
        driver.findElement(By.name("username")).sendKeys("dipak");
        driver.findElement(By.name("password")).sendKeys("admin1234");
       WebElement loginButton = driver.findElement(By.xpath("//button[@class='_acan _aiit _acap _aijb _acas _aj1-']"));
                           boolean status = loginButton.isEnabled();
                           System.out.println(status);
     
  
	}

}
