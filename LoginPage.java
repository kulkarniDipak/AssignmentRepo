package wingify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends AmountTest {
		
		
		@FindBy(id="username")private WebElement usernameTextField;
		@FindBy(id="password")private WebElement passwordTexField;
		@FindBy(id="log-in") private WebElement loginButton;
		
		
		
		public LoginPage(WebDriver driver) {
			PageFactory.initElements(driver, this);
			
			
		}
		public WebElement getusernameTextField() {
			return usernameTextField;
			
			
		}
		
		public void loginToApplication(String username, String password) {
			usernameTextField.sendKeys(username);
			passwordTexField.sendKeys(password);
			loginButton.click();
		}
		public WebElement getpasswordTexField() {
			
			return null;
		}
		public WebElement getLogin() {
			
			return null;
		}
	}


