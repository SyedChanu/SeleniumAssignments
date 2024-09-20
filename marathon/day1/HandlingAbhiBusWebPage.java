package marathon.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAbhiBusWebPage {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.abhibus.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//div[@class=' col'])[2]/input")).click();
		driver.findElement(By.xpath("//div[text()='Chennai']")).click();
		driver.findElement(By.xpath("(//input[@type='text'])[2]")).click();
		driver.findElement(By.xpath("//div[text()='Bangalore']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()='Tomorrow']")).click();
		String busName = driver.findElement(By.xpath("//div[@id='service-operator-agent-name-2230643173']/h5")).getText();
		System.out.println("The bus we are Travelling is "+busName);
		String price=driver.findElement(By.xpath("//span[text()='395']")).getText();
        System.out.println("The price of bus is "+price);
        Thread.sleep(3000);
        driver.close();
	}  

}
