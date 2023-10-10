package com.jyoti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frametest56 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8080/");
		driver.manage().window().maximize();
	WebElement parentFrame=driver.findElement(By.xpath("//iframe[@id='parent']"));
	driver.switchTo().frame(parentFrame);
	WebElement address = driver.findElement(By.xpath("//input[@name='address'][1]"));
	address.sendKeys("999999999");
	//child frame//
	
WebElement child2 =driver.findElement(By.xpath("//iframe[@id='child2']"));
driver.switchTo().frame(child2);
WebElement name=driver.findElement(By.xpath("//input[@name='name']"));
name.sendKeys("jyoti");
WebElement cd=driver.findElement(By.xpath("//input[@name='address'][1]"));
driver.switchTo().frame(cd);

	}

}
