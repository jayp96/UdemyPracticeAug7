package AjaxActions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesPract {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));
		
		//driver.findElement(By.xpath("//div[@id='draggable']")).click();
		
		Actions actionDragDrop = new Actions(driver);
		
		WebElement source = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement target = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		//actionDragDrop.dragAndDrop(source WebElement, target WebElement)
		actionDragDrop.dragAndDrop(source, target).build().perform();
		
		//actionDragDrop.contextClick(target)
	}
}
