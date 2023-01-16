package DateAutoPrac;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePrac {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.path2usa.com/travel-companions");
		
		
		driver.findElement(By.xpath("//input[@id='form-field-travel_comp_date']")).click();


		while(!driver.findElement(By.cssSelector("[class='flatpickr-month'] [class='flatpickr-current-month']")).getText().contains("May"))
		{
		driver.findElement(By.cssSelector("[class='flatpickr-next-month']")).click();
		}

		List<WebElement> dates= driver.findElements(By.className("day"));
		//Grab common attribute//Put into list and iterate
		int count=driver.findElements(By.className("day")).size();

		for(int i=0;i<count;i++)
		{
		String text=driver.findElements(By.className("day")).get(i).getText();
		if(text.equalsIgnoreCase("21"))
		{
		driver.findElements(By.className("day")).get(i).click();
		break;
		}
		}
	}
}
