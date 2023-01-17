package assignment;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("https://www.google.com/");
        driver.switchTo().activeElement().sendKeys("car");
        Thread.sleep(2000);
                 
                List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='pcTkSc']"));
                System.out.println(suggestions.size());
                for(WebElement a:suggestions)
                {
                	System.out.println(a.getText());
                }
                    
        
	}

}
