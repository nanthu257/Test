package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Nanthini\\eclipse-workspace\\Test\\driver\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	WebElement userName = driver.findElement(By.id("email"));
	userName.sendKeys("Nanthu Nanthu");
	WebElement pass = driver.findElement(By.id("pass"));
	pass.sendKeys("11251125");
	WebElement login = driver.findElement(By.name("login"));
	login.click();
}
}
