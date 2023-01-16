package AjaxActions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsPractice {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		
		Actions a = new Actions(driver);
		//Build: ready to execute
		//Perform: execute
		
		
		WebElement move = driver.findElement(By.xpath("//a[@id = 'nav-link-accountList']"));
		
		WebElement moveToSearch = driver.findElement(By.xpath("//input[@id = 'twotabsearchtextbox']"));
		
		//Moves to Specific Elemenent
		a.moveToElement(move).contextClick().build().perform();
		
		String input = "hello";
		
		//Composite Action
		a.moveToElement(moveToSearch).click().keyDown(Keys.SHIFT).sendKeys(input).doubleClick().build().perform();
		
		
		
		
	}

}
