import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 /*
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		//Step 1: Invoke the browser(before that use setProperty)
		//One interface webdriver is needed to have same functions for all the browsers
		WebDriver driver = new ChromeDriver();
		//ChromeDriver class is implementing the WebDriver interface
		
		*/
		//ChromeDriver driver = new ChromeDriver();
		//this is not taken as it will only implement the methods of ChromeDriver class
		//this will help the driver object to only focus on webDriver methods
		//otherwise driver obj might not will not be able to use methods explicit to chromrBrowser
		// we want to use only WebDriver methods.
		
		//but this will try to find out the chrome driver
		//from webdriver.chrome.driver
		//but for that we first use System.setProperty step
				
		/*
		System.setProperty("webdriver.gecko.driver","C:\\webdrivers\\geckodriver.exe" );		
		
		WebDriver driver = new FirefoxDriver();
		*/
		
		System.setProperty("webdriver.edge.driver", "C:\\webdrivers\\msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		
		System.out.println(driver.getCurrentUrl());
		
		//driver.
		
		driver.close(); //this will only close the original window that was opened
		//it wont close the windows which opened while we clicked on them
		//for eg clicked on a link at the current browser which opened another window
		
		//another method is there
		//driver.quit()
		//this will close all the associated windows
		
	}

}
