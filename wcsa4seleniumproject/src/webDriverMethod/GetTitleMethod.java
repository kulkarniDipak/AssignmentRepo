package webDriverMethod;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetTitleMethod {
	   public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		               WebDriver driver=new ChromeDriver();
		               driver.manage().window().maximize();
		               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		               driver.get("https://www.instagram.com/accounts/login/");
		                 Thread.sleep(2000);
		                  String titleWebPage = driver.getTitle();
		                  System.out.println(titleWebPage);
		                  driver.close();
	}

}
