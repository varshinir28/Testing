package com.example.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App31 {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("varsha");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("Ramki");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("varsh@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("987322");
		driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
		
		
	}

}
