package readExcelData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelDataLinkdin {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		
		
		    FileInputStream fis = new FileInputStream("./data/linkdinTestData.xlsx");
		        Workbook wb = WorkbookFactory.create(fis);
		        Sheet sheet = wb.getSheet("validcreds");
		        Row row = sheet.getRow(0);
		        Cell cell = row.createCell(2);
		        cell.setCellValue("link");
		        
		        
		           FileOutputStream fos = new FileOutputStream("./data/linkdinTestData.xlsx");
		           wb.write(fos);
			
	}

}
