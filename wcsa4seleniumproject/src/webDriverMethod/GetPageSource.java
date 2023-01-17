package webDriverMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {
	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
         driver.get("file:///C:/Users/Shree/Desktop/WCSA4/Checkbox.html");
         Thread.sleep(2000);
              String sourceCode = driver.getPageSource();
              System.out.println(sourceCode);

	}

}
