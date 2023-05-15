package base.org;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	public  BaseClass() {
		
	}
	
	public static void launchBrowser(String url) {
		WebDriver driver = new ChromeDriver();
		driver.get("");
		System.out.println("MAVEN jENKINS DEMO.....sUCCESS");

	}
	
	

}
