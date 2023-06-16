package com.example.day6;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App2 {

	public static void main(String[] args) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new EdgeDriver();
		
		  String url="https://demo.wpeverest.com/user-registration/guest-registration-form/";
	        driver.navigate().to(url);
	        driver.manage().window().maximize();
	        driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Subha");
	        driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("K S");
	        driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("Subha123@gmail.com");
	        driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("123");
	        driver.findElement(By.xpath("//*[@id=\"radio_1665627729_Female\"]")).click();
	        driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]")).sendKeys("13-06-2004");
	        driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("Indian");
	        
	        WebElement dis1 = driver.findElement(By.xpath("//*[@id=\"first_name_field\"]"));
	        WebElement dis2 =  driver.findElement(By.xpath("//*[@id=\"user_email_field\"]"));
	        System.out.println(dis1.isDisplayed());
	        System.out.println(dis2.isDisplayed());
	}
}
