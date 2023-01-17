package qsp;

import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class Rtp {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which Browser you to open !!");
		  String browserValue = sc.next();
		  
		  if(browserValue.equalsIgnoreCase("chrome"));
		  System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		   ChromeDriver driver = new ChromeDriver();
		   driver.manage().window().maximize();
		   driver.get("https://www.google.com/");
		   Thread.sleep(2000);
		   driver.close();
		   driver.quit();
		   
	}

}
