package wingify;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends  AmountTest {

	
	@FindBy(id="amount") private WebElement amountHeader;
	
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	public WebElement getamountHeader() {
		return amountHeader;
	}
	
	public void signoutFromApp(WebDriver webdriver) {
		amountHeader.click();
	
}}