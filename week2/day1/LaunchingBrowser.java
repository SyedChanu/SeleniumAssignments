package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowser {

	public static void main(String[] args) {
		
		//Launch Browser 
		//using Chrome drivers
		ChromeDriver driver=new ChromeDriver();
		
		//loading any url
		driver.get("https://www.facebook.com/");
		
		//maximising the window 
		driver.manage().window().maximize();

	}

}
