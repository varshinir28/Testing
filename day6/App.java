package com.example.day6;

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
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("varsh");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("sri");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("varsh123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("778381");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,3000)","");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/div/input")).click();
		driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
		driver.quit();
		
		
    }
}
