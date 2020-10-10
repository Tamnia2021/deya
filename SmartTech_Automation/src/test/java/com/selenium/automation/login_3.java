package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_3 {
static WebDriver driver;
public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	
	driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("6467854537");
	driver.findElement(By.id("pass")).sendKeys("17744106NY!");
	driver.findElement(By.xpath("//button[@name='login']")).click();
	driver.findElement(By.xpath("(//div[@dir='ltr'])[1]")).click();
	driver.findElement(By.xpath("(//a[@class='_2s25'])[1]" )).click();
	driver.findElement(By.xpath("//span[@class='_1vp5 f_click']")).click();
}
	
	
}
