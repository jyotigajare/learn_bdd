package com.jyoti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
driver.get("http://localhost:8080/");
driver.manage().window().maximize();

WebElement city=driver.findElement(By.name("city"));
Select select = new Select(city);
select.selectByVisibleText("Mumbai");
String cityName=select.getFirstSelectedOption().getText();
System.out.println("Latur");
	}

}
