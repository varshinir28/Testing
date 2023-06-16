package com.example.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App3 {
	public static void main(String[] args)
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.wpeverest.com/user-registration/paypal-integration-form/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("varsh123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"user_pass\"]1")).sendKeys("varsh123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("varsh123@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("varsh123@gmail.com");
		
				
	}

}

