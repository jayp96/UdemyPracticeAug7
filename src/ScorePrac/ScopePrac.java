package ScorePrac;

import java.util.Iterator;
import java.util.Set;
import java.util.stream.Stream;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScopePrac {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//Scope Practice
		
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		
		//this will limit the webdriver scope
		WebElement footerDriver = driver.findElement(By.xpath("//div[@id = 'gf-BIG']"));
		
		System.out.println(footerDriver.findElements(By.tagName("a")).size());
		
		WebElement columnDriver = footerDriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		System.out.println(columnDriver.findElements(By.tagName("a")).size());
		
		//Click on each of the columns and check if the pages are opening
		//This will open all the tabs
		for(int i =1; i<columnDriver.findElements(By.tagName("a")).size();i++ ) {
			
			String clickOnLinkTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			columnDriver.findElements(By.tagName("a")).get(i).sendKeys(clickOnLinkTab);
			
			
			
		}
		
		Thread.sleep(5000L);
		Set<String> allTabs = driver.getWindowHandles();
		
		Iterator<String> it = allTabs.iterator();
		/*
		while(it.hasNext()) {
			driver.switchTo().window(it.next());
			System.out.println(driver.getTitle());
		}
		*/
		for(String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		
		Stream.of("Abhi","Don","Aja","Aba","rama").filter(s->s.endsWith("a")).map(s->s.toUpperCase());
		
		
		
	}
}
