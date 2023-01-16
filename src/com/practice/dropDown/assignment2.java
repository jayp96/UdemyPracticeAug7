package com.practice.dropDown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		//Name
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='name']")).sendKeys("Jay");
		//Email
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='email']")).sendKeys("abc@xyz.com");
		//Password
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@id='exampleInputPassword1']")).sendKeys("abcd@123");
		
		//CheckBox
		driver.findElement(By.xpath("//div[@class='form-check'] //input[@id='exampleCheck1']")).click();
		
		//Select gender
		WebElement gendDrpDwn = driver.findElement(By.xpath("//div[@class='form-group'] //select[@id='exampleFormControlSelect1']"));
		
		Select dropDown = new Select(gendDrpDwn);
		
		dropDown.selectByIndex(1);
		
		//dropDown.selectByValue("Male");
		
		//Employment Status
		//div[@class='form-check form-check-inline'] //input[@id='inlineRadio2']
		driver.findElement(By.xpath("//div[@class='form-check form-check-inline'] //input[@id='inlineRadio2']")).click();
		
		//DateOfBirth
		driver.findElement(By.xpath("//div[@class='form-group'] //input[@name='bday']")).sendKeys("02181996");
		//div[@class='form-group'] //input[@name='bday']
		
		//Submit button
		//input[@value='Submit']
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		//Form Success button
		//div[@class='alert alert-success alert-dismissible']
		String success = driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		
		System.out.println(success);
		
		//Assert.assertEquals(success,"Success! The Form has been submitted successfully!.");
		
		
		
	}

}
