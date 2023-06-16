package com.example.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriverManager.edgedriver().setup();	
		WebDriver driver= new EdgeDriver();
		String url="https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb";
		//navigate
		driver.navigate().to(url);
		//maximize window
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("Varsh");
		driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("varsh@123.gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("kamal");
		driver.findElement(By.xpath("//*[@id=\"input-from-email\"]")).sendKeys("kamal@123.gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-theme\"]/div[2]/label")).click();
		
		JavascriptExecutor js =(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,5000)","");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Merry Christmas Baby");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"form-voucher\"]/div[8]/div/button")).click();
		
		
    }
    
}
