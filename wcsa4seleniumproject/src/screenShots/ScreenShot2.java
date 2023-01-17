package screenShots;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenShot2 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	              RemoteWebDriver rwd=new ChromeDriver();
	              rwd.manage().window().maximize();
	              rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	              rwd.get("https://www.google.com/");
	              
	                     File src = rwd.getScreenshotAs(OutputType.FILE);
	                     File dest = new File("./ScreenShot/ScreenShot2.jpg");
	                     Files.copy(src, dest);
	              
       
           
        
        

	}

	
	}


