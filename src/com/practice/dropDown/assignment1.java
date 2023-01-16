package com.practice.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click(); //Click to Select
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		
		
		driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).click(); //Click to deselect
		System.out.println(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkBoxOption1']")).isSelected());
		/*
		 * //input[contains(@name,'checkBoxOption')]
		   //input[@type='checkbox']
		 */
		
		System.out.println(driver.findElements(By.xpath("//input[contains(@name,'checkBoxOption')]")).size());

	}

}
