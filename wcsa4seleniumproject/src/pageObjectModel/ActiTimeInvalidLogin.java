package pageObjectModel;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest{
	public static void main(String[] args) throws IOException {
		
		
		BaseTest bt=new BaseTest();
		bt.openBrowser();
		
		Flib flib=new Flib();
		LoginPage ip = new LoginPage(driver);
		
		    int rc = flib.rowCount(EXCEL_PATH,"invalidcreds");
		    for(int i=1; i<rc;i++)
		    {
		    	String usn = flib.readExcelData(EXCEL_PATH, "invalidcreds", i, 0);
		    	String pass = flib.readExcelData(EXCEL_PATH, "invalidcreds", 1, 1);
		    }
		    
		     
		
	}

}
