package marathon.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAmazonPage {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Bags for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		String text = driver.findElement(By.xpath("//span[contains(text(),'1-48 of over 80,000 results for')]")).getText();
		System.out.println(text);
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[11]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("(//span[@class='a-size-base a-color-base'])[12]")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.id("a-autoid-0")).click();
	 // Thread.sleep(3000);
	    driver.findElement(By.linkText("Newest Arrivals")).click();
	    Thread.sleep(3000);
	    String name=driver.findElement(By.xpath("//span[contains(text(),'Mega 12 Casual Backpack')]")).getText();
	    System.out.println("The features of bags "+name);
	    String price=driver.findElement(By.xpath("//span[@class='a-price-whole']")).getText();
	    System.out.println("The discounted price is "+price);
        driver.findElement(By.xpath("//div[@class='a-section aok-relative s-image-tall-aspect']/img")).click();
	    Thread.sleep(3000);
	    System.out.println(driver.getTitle());
	    Thread.sleep(5000);
	    driver.close();
	    
	   
	    	{
	    		
	    	}
	    }

	

}
