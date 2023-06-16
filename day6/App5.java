package com.example.day6;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class App5 {
	
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	WebElement username=driver.findElement(By.xpath("//input[@name=\"username\"]"));
	username.sendKeys("Admin");
	WebElement password=driver.findElement(By.xpath("//input[@name=\"password\"]"));
	password.sendKeys("admin123");
    WebElement button;
    WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(50));
    button=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")));
    button.click();
    WebElement profile=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/span/p"));
    profile.click();
    WebElement logout=driver.findElement(By.linkText("Uitloggen"));
    logout.click();
	}
}