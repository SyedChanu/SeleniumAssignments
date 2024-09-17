package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnXpath {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
	/*	driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.xpath("(//input[@class='decorativeSubmit'])[1]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
		driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys("342434"); */
		
		//xPath by using attributes
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		//xPath contains partial attributes
		driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");
		//xPath using collection
		driver.findElement(By.xpath("(//input[@class='decorativeSubmit'])[1]")).click();
		//xPath contains partial text
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
		//xPath by using text
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		
		
		

	}

}
