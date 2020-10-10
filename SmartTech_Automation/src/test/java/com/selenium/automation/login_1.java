package com.selenium.automation;


import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class login_1 {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\alamm\\eclipse-workspace\\SmartTech_Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ups.com/us/en/Home.page");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[text()='Sign up / Log in']")).click();
		 
		//driver.manage().deleteAllCookies();
		
		//driver.findElement(By.xpath("//a[@class='ups-link']")).click();
		
		
	//	driver.findElement(By.id("ups-full_name_input")).sendKeys("tamnia");
		
		//driver.findElement(By.id("ups-email_input")).sendKeys("tamniadeya600@gmail.com");
		
		//driver.findElement(By.id("pwd")).sendKeys("Tabassum321$");
		
		
		//driver.findElement(By.id("submitBtn")).click();
		
		
		driver.manage().deleteAllCookies();
		
		
		System.out.println(driver.getTitle());
	
		
		
		
		
	}

}
