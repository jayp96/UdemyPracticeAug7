package com.practice.dropDown;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.Assert;

public class dropDown {



public static void main(String[] args) throws InterruptedException {

// TODO Auto-generated method stub

	System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
	
    WebDriver driver = new ChromeDriver();

    driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); //URL in the browser

//  //a[@value='MAA']  - Xpath for chennai

//  //a[@value='BLR']

    driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

    driver.findElement(By.xpath("//a[@value='BLR']")).click();

    Thread.sleep(2000);

    //driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click();

    //Parent Child relationship
    // first xpath of parent->then xpath of child
    // to uniquely identify the element
    driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

    //driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();
    
    
    //Select Calender
    System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

    driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

    System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

    if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

    {

    System.out.println("its enabled");

    Assert.assertTrue(true);

    }

    else

    {

    Assert.assertTrue(false);

    }
    

}



}