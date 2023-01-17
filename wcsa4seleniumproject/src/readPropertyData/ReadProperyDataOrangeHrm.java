package readPropertyData;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperyDataOrangeHrm {
	public static void main(String[] args) throws IOException {
		
		
		
		    FileInputStream fis = new FileInputStream("./data/orangehrm.properties");
		    
		                Properties prop = new Properties();
		                prop.load(fis);
		                
		               String data = prop.getProperty("Username");
		               System.out.println(data);
	}

}
