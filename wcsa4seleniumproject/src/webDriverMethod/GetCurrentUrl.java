package webDriverMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrl {
	public static void main(String[] args) {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
         driver.get("file:///C:/Users/Shree/Desktop/WCSA4/Checkbox.html");
                        String currentUrl = driver.getCurrentUrl();
                        System.out.println(currentUrl);
	}

}
