package marathon.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingPvrPage {

	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.get("https://www.pvrcinemas.com/");
		driver.manage().window().maximize();
	//	driver.findElement(By.className("cities-placed")).click();
	//	driver.findElement(By.xpath("//span[text()='Coimbatore']")).click();
        driver.findElement(By.xpath("//span[@class='filter-pvr-active']")).click();
        driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
	}

}
