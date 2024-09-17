package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBrowserLaunch {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.id("email")).sendKeys("9655739320");
		driver.findElement(By.id("pass")).sendKeys("pheonixoffire");
		driver.findElement(By.name("login")).click();
	}

}
