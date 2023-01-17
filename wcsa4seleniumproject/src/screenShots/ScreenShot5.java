package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShot5 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		          ChromeDriver driver = new ChromeDriver();
		          RemoteWebDriver rwd = (RemoteWebDriver)driver;
		          rwd.manage().window().maximize();
		          rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		          rwd.get("https://www.facebook.com/login/");
		          
		                 File src = rwd.getScreenshotAs(OutputType.FILE);
		                 File dest = new File("./ScreenShot/ScreenShot5.jpg");
		                 Files.copy(src, dest);
		          
		
	}

}
