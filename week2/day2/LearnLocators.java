package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnLocators {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
	/*	driver.findElement(By.id("email")).sendKeys("naniishere@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("Nani123");
		
		driver.findElement(By.name("login")).click();
		
        driver.findElement(By.linkText("Find your account and log in.")).click();
	  //driver.findElement(By.partialLinkText("Find your account")).click();
		
		driver.findElement(By.id("identify_email")).sendKeys("9655739320");
		driver.findElement(By.name("did_submit")).click(); */

		driver.findElement(By.id("email")).sendKeys("thyujii@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("TYHU899");
		driver.findElement(By.linkText("Log in")).click();
		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		driver.findElement(By.xpath("//input[@id='identify_email']")).sendKeys("ziz@gmail.com");
		driver.findElement(By.xpath("//button[text()='Search']")).click();
		
	//	driver.findElement(By.xpath("//div[contains(text(),'Enter Password')]")).click();
	//	driver.findElement(By.xpath("//input[@id='password_login']")).click();
	//	driver.findElement(By.xpath("//button[contains(@name,'reset')]")).click();
	//	driver.findElement(By.xpath("//button[@name='reset_action']")).click();
	//	driver.findElement(By.name("reset_action")).click();
		driver.findElement(By.linkText("Continue")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		
		
	}

}
