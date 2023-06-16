package com.example.day5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App1 {
	public static void main(String[] args) 
	{
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.get("https://j2store.net/free/");
		driver.manage().window().maximize();
		
		String s=driver.getTitle();
		System.out.println(s);
		String str="Home";
		if(s.equals("Home"))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scroll(0,2000)","");
		driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]")).click();
		String s1=driver.getTitle();
		if(s1.equals("Shop"))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		

	}

}




