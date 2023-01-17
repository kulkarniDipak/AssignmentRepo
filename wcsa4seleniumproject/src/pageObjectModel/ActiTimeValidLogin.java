package pageObjectModel;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLogin extends BaseTest {
	public static void main(String[] args) throws IOException, InterruptedException  {
		
		   BaseTest bt = new BaseTest();
		   bt.openBrowser();
		   
		     Flib flib = new Flib();
		     
		     LoginPage ip= new LoginPage(driver);
		     ip.actiTimeValidLogin(flib.readPropertyData(PROP_PATH, "Username") ,flib.readPropertyData(PROP_PATH,"Password"));
		     
		   
		
	}

}
