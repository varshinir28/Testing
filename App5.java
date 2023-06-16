package com.example.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App5 {
	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.smart-hospital.in/site/login");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/div[1]/a[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/div/div[2]/form/button")).click();
        driver.findElement(By.xpath("//*[@id=\"sibe-box\"]/ul[2]/li[4]/a")).click();
        WebElement opd=driver.findElement(By.xpath("/html/body/div[1]/div[1]/section/div/div/div/div[1]/h3"));
		System.out.println(opd.getText());
		System.out.println(opd.getTagName());
		WebElement size=driver.findElement(By.xpath("//*[@id=\"alert\"]/nav/div[2]/div/form/div"));
		System.out.println(size.getSize());
		System.out.println(size.getCssValue("color"));
      
	}

}
