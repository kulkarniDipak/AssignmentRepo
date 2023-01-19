package wingify;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class AmountTest {

	@SuppressWarnings("deprecation")
	public  void checkAmountTest() {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://sakshingp.github.io/assignment/login.html");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		
		LoginPage login=new LoginPage(driver);
		HomePage  home= new HomePage(driver);
	
		login.getusernameTextField().sendKeys("v1");
		login.getpasswordTexField().sendKeys("sud123");
		login.getLogin().click();
		Assert.assertEquals(driver.getTitle()," Home");
		
		
	}
}
