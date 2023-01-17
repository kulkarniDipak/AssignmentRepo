package wingifyAssignment;

import java.io.IOException;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestValidLogIn extends BaseTest {

	@Test
	public void testCase1() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);	

		Flib flib = new Flib();
		lp.ValidLogin(flib.readPropertyData(PROP_PATH, "Username"),flib.readPropertyData(PROP_PATH, "Password"));
		Reporter.log("valid Login test is passed!!!",true);
	}

	@Test
	public void testCase2() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);	

		Flib flib = new Flib();

		String Usn = flib.readPropertyData(PROP_PATH, "Username");
		String Pass = flib.readPropertyData(PROP_PATH, "Password");
		lp.ValidLogin(Usn, Pass);
		HomePage hp = new HomePage(driver);
		Thread.sleep(2000);
		hp.clickOnAmount();
		Thread.sleep(2000);
		hp.sortTheAmounts();
		Reporter.log("test case2 passed!!",true);
	}

}
