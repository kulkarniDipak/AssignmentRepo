package assignment;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ElementDuplicatHashSet {
	public static void main(String[] args) {
		  WebDriver driver=new ChromeDriver();
          driver.manage().window().maximize();
          driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
          driver.get("file:///C:/Users/Shree/Desktop/WCSA4/MultiSelectDropDown.html");
          WebElement dropDownElement = driver.findElement(By.id("i1"));
                         Select sel = new Select(dropDownElement);
                          List<WebElement> allOptions = sel.getOptions();
                          
                                HashSet<String> s = new HashSet<String>();
                                for(int i=0;i<allOptions.size();i++)
                                {
                                        WebElement opts = allOptions.get(i);
                                         String values = opts.getText();
                                         // to add the text of webelwment by removing duplicate and insertion order
                                         s.add(values);
                                 }
                                 for(String options:s)
                                 {
                                	 System.out.println(options);
                                 }
          
        
	}
	

}
