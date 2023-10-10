package com.jyoti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

@Test
public class FrameTest {
	
	private WebDriver driver;
	
	@BeforeTest
	public void init() {
		driver=new ChromeDriver();
		driver.get("http://localhost:8080/");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority = 1)
	public void findFrameTest() {
		//Parent Frame
		WebElement parentFrame=driver.findElement(By.id("parent"));
		driver.switchTo().frame(parentFrame);
		WebElement address=driver.findElement(By.name("address"));
		address.sendKeys("987654321");
		
		//Child Frame
		WebElement child=driver.findElement(By.id("child"));
		driver.switchTo().frame(child);
		WebElement name=driver.findElement(By.name("name"));
		name.sendKeys("JYOTI");
		WebElement cc=driver.findElement(By.id("child2"));
		driver.switchTo().frame(cc);
		
		//Inner Child Framework
		WebElement city=driver.findElement(By.name("city"));
		Select select = new Select(city);
		select.selectByVisibleText("Latur");
		String cityName=select.getFirstSelectedOption().getText();
		System.out.println(cityName);
	}
	
	@Test(priority = 2)
	public void findChildFrame() {
		
	}
	
	@AfterTest
	public void cleanup() {
		//driver.close();
		
	}
}
