package assignment;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DuplicateElementUsingLinkHashSet {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
        driver.get("file:///C:/Users/Shree/Desktop/WCSA4/MultiSelectDropDown.html");
        WebElement dropDownElement = driver.findElement(By.id("i1"));
        Select sel = new Select(dropDownElement);
                    List<WebElement> ops = sel.getOptions();
                   LinkedHashSet<String> s = new LinkedHashSet<String>();
                   for(int i=0;i<ops.size();i++)
                   {
                	   String textToInsert = ops.get(i).getText();
                	   s.add(textToInsert);
                   }
                    for(String text:s)
                    {
                    	System.out.println(text);
                    }
               
	}

}
