package com.practice.wait;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		
		String paraEmailAndPw = driver.findElement(By.xpath("//p[@class='text-center text-white']")).getText();
		
		String email = paraEmailAndPw.split(" ")[2].trim();
		String passWord = paraEmailAndPw.split(" ")[6].trim();
		
		passWord = passWord.substring(0,passWord.length()-1);		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(email);
		//input[@id='password']
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(passWord);
		
		//div[@class='form-check-inline'] //input[@value='user']
		
		driver.findElement(By.xpath("//div[@class='form-check-inline'] //input[@value='user']")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		
		WebElement drpDown = driver.findElement(By.xpath("//div[@class='form-group'] //select[@class='form-control']"));
		
		Select option = new Select(drpDown);
		
		option.selectByValue("consult");
		
		driver.findElement(By.xpath("//input[@name='terms']")).click();
		
		driver.findElement(By.xpath("//input[@id='signInBtn']")).click();
		
		wait.until(ExpectedConditions.urlToBe("https://rahulshettyacademy.com/angularpractice/shop"));
		
		List<WebElement> prods = driver.findElements(By.xpath("//button[@class='btn btn-info']"));
		
		for(int i=0;i<prods.size();i++) {
			//driver.findElements(By.xpath("//button[@class='btn btn-info']")).get(i).click();
			prods.get(i).click();
		}
		
		driver.findElement(By.xpath("//a[@class='nav-link btn btn-primary']")).click();
		
		
	}
}
