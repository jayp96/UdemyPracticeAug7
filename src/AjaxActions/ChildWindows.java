 package AjaxActions;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		
		driver.findElement(By.xpath("//a[@class='blinkingText']")).click();
		
		Set<String> windows = driver.getWindowHandles(); //[parentID,ChildId, SubChildId]
		
		Iterator<String> it = windows.iterator();
		//Iterator initial index is -1
		
		String parentId = it.next();
		String childId = it.next();
		
		driver.switchTo().window(childId);
		
		String emailPara = driver.findElement(By.xpath("//p[@class = 'im-para red']")).getText();
		
		String emailId = emailPara.split(" ")[4].trim();
		
		driver.switchTo().window(parentId);
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(emailId);
		
		
		
	}

}
