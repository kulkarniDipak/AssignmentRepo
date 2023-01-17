package wingifyAssignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
               @FindBy(id="username") private WebElement UsernameTB;
               @FindBy(id="password") private WebElement PasswordTB;
               @FindBy(id="log-in")   private WebElement LoginButton;
               @FindBy(xpath="//input[@class='form-check-input']") private WebElement CheckBox;
              
               // intilization
               public LoginPage(WebDriver driver)
   	        {
   	        	PageFactory.initElements(driver,this);
   	        	 
   	        }

               
               // utilization
			public WebElement getUsernameTB() {
				return UsernameTB;
			}

			public WebElement getPasswordTB() {
				return PasswordTB;
			}

			public WebElement getLoginButton() {
				return LoginButton;
			}

			public WebElement getCheckBox() {
				return CheckBox;
			}
			
			
			// operational method
			public void ValidLogin(String validusername,String validpassword) throws InterruptedException 
			{
				UsernameTB.sendKeys(validusername);
				Thread.sleep(2000);
				PasswordTB.sendKeys(validpassword);
				Thread.sleep(2000);
				LoginButton.click();
				
			}
			
			public void InvalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
			 {
				 UsernameTB.sendKeys(invalidUsername);
					Thread.sleep(2000);
					PasswordTB.sendKeys(invalidPassword);
					Thread.sleep(2000);
					LoginButton.click();
			 }

   	          
               
               
}
