package pageObjectModel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
       //To avoid StaleReferanceException 
	
	        @FindBy(name="username") private WebElement UsernameTB;
	        @FindBy(name="pwd") private WebElement PasswordTB;
	        @FindBy(id="loginButton") private WebElement LoginButton;
	        @FindBy(name="remember") private WebElement CheckBOX;
	        @FindBy(xpath="//a[.='Actimind Inc.']") private WebElement Actimind;
	        @FindBy(xpath="//a[.='License for using this software']") private WebElement License;
	        
	        // Initialize
	        
	        public LoginPage(WebDriver driver)
	        {
	        	PageFactory.initElements(driver,this);
	        	 
	        }
	        
	        
	        // Utilization
			public WebElement getUsernameTB() {
				return UsernameTB;
			}
			public WebElement getPasswordTB() {
				return PasswordTB;
			}
			public WebElement getLoginButton() {
				return LoginButton;
			}
			public WebElement getCheckBOX() {
				return CheckBOX;
			}
			public WebElement getActimind() {
				return Actimind;
			}
			public WebElement getLicense() {
				return License;
			} 
			  
			
			// operational method
			public void actiTimeValidLogin(String validusername,String validpassword) throws InterruptedException 
			{
				UsernameTB.sendKeys(validusername); 
				Thread.sleep(2000);
				PasswordTB.sendKeys(validpassword);
				Thread.sleep(2000);
				LoginButton.click();
			}
			 public void actTimeInvalidLogin(String invalidUsername,String invalidPassword) throws InterruptedException
			 {
				 UsernameTB.sendKeys(invalidUsername);
					Thread.sleep(2000);
					PasswordTB.sendKeys(invalidPassword);
					Thread.sleep(2000);
					LoginButton.click();
			 }


				
			}

    


