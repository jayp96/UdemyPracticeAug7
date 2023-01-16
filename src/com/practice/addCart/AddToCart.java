package com.practice.addCart;

/*
 * This will be a generic overlay of adding a product to the cart
 * It is based on a question asked in Amazon interview
 * The question is about dynamically update the data in the catalog
 * We should be able to search the products (dynamically)
 */

import java.util.Arrays;

import java.util.List;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;

import org.openqa.selenium.support.ui.WebDriverWait;



public class AddToCart {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");

	WebDriver driver =new ChromeDriver();


	//This thing will be dynamic and will be taken using excel file,etc
	//But we created a generic overview of the system
	
String[] itemsNeeded= {"Cucumber","Brocolli","Beetroot"}; 





driver.get("https://rahulshettyacademy.com/seleniumPractise/");

Thread.sleep(3000);

addItems(driver,itemsNeeded);

}

public static  void addItems(WebDriver driver,String[] itemsNeeded)

{

int j=0;

List<WebElement> products=driver.findElements(By.cssSelector("h4.product-name"));

for(int i=0;i<products.size();i++)

{

//Brocolli - 1 Kg

//Brocolli,    1 kg

String[] name=products.get(i).getText().split("-");

String formattedName=name[0].trim();

//format it to get actual vegetable name

//convert array into array list for easy search

//  check whether name you extracted is present in arrayList or not-

List itemsNeededList = Arrays.asList(itemsNeeded);

if(itemsNeededList.contains(formattedName))

{

j++;

//click on Add to cart

driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();

if(j==itemsNeeded.length) //Dynamic value of this is taken care of by taking into account of the length

{

break;

}

}

}

}



}