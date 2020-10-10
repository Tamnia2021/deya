package com.selenium.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login_zoopla {
	
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\alamm\\eclipse-workspace\\SmartTech_Automation\\Driver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		
		driver.get("https://www.zoopla.co.uk/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@class='css-fa8dvy e11d441i1']")).click();
		
		
		
		driver.manage().deleteAllCookies();
	}

}
