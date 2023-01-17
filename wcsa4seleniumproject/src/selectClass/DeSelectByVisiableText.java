package selectClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeSelectByVisiableText {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
	       driver.get("http://omayo.blogspot.com/");
	       WebElement dropdown = driver.findElement(By.xpath("//select[@id='multiselect1']"));
	                         Select sel = new Select(dropdown);
	                         sel.selectByVisibleText("audix");
	                         Thread.sleep(2000);
	                         sel.deselectByVisibleText("audix");
	                         
	    
	}

}
