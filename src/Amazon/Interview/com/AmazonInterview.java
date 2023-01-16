package Amazon.Interview.com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Generic function to find all the elements with apple name

public class AmazonInterview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("apple");
		driver.findElement(By.xpath("//input[@id='nav-search-submit-button']")).click();
		
		//div[contains(@class,'s-card-container')]
		//div[contains(@class,'s-card-container')] //div[contains(@class,'s-list-col-right')]
		//div[contains(@class,'s-card-container')] //div[contains(@class,'s-title-instructions-style')] //span[contains(text(),'MacBook')]
		//div[contains(@class,'s-card-container')] //div[contains(@class,'s-title-instructions-style')] //span[contains(text(),'MacBook')]
		List<WebElement> ele = driver.findElements(By.xpath("//div[contains(@class,'s-card-container')] //span[contains(text(),'MacBook')]"));
		
		for(int i=0; i<ele.size();i++) {
			System.out.println(ele.get(i).getText());
		}
		
	}

}
