package dataDrivenFrameWork;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkdinValidLogin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		System.setProperty("webriver.chrome.drier","./drivers/chromedriver.exe");
		               WebDriver driver=new ChromeDriver();
		               driver.manage().window().maximize();
		               driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		               driver.get("https://www.linkedin.com/login");
		               
		               
		              Flib flib = new Flib();
		             String username = flib.readExcelData("./data/LinkdinTestData.xlsx","validcreds", 1, 0);
                     String password = flib.readExcelData("./data/LinkdinTestData.xlsx", "validcreds", 1, 1);
                     
                     driver.findElement(By.id("username")).click();
                     Thread.sleep(2000);
                     driver.findElement(By.id("password")).click();
                     Thread.sleep(2000);
                     driver.findElement(By.xpath("//button[.='Sign in']")).click();
	}

}
