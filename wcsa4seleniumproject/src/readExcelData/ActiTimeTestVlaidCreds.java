package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeTestVlaidCreds {
	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		         WebDriver driver = new ChromeDriver();
		         driver.manage().window().maximize();
		         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		         driver.get("http://desktop-ulk1tsq/login.do");
				    
		         Thread.sleep(2000);
		         
		           FileInputStream fis = new FileInputStream("./data/ActiTimeTestData.xlsx");
		               Workbook wb = WorkbookFactory.create(fis);
		                Sheet sheet = wb.getSheet("validcreds");
		                Row row = sheet.getRow(1);
		               Cell cell = row.getCell(0);
		               String username = cell.getStringCellValue();
		               
                 FileInputStream fib2 = new FileInputStream("./data/ActiTimeTestData.xlsx");
                      Workbook wb2 = WorkbookFactory.create(fib2);
                      Sheet sheet2 = wb2.getSheet("validcreds");
                     Row row2 = sheet2.getRow(1);
                     Cell cell2 = row2.getCell(1);
                     String password = cell2.getStringCellValue();
                     
                     driver.findElement(By.name("username")).sendKeys(username);
                     driver.findElement(By.name("pwd")).sendKeys(password);
                     driver.findElement(By.id("loginButton")).click();
	}

}
