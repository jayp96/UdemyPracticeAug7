import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class selectors2 {
	public static void main(String[] args) throws InterruptedException {
		
		String name = "jay";
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		
		//Implicit wait so that selenium does not throw error as soon as it does not find it but rather it should wait for specific time and then only proceed
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password = findPassword(driver);
		
		System.out.println(password);
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		
		driver.findElement(By.className("signInBtn")).click();
		
		Thread.sleep(2000);
		
		System.out.println(driver.getTitle());
		
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'login-container')]/p")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class,'login-container')]/p")).getText(), "You are successfully logged in.");
		System.out.println(driver.findElement(By.xpath("//div[contains(@class,'login-container')]/h2")).getText());
		Assert.assertEquals(driver.findElement(By.xpath("//div[contains(@class,'login-container')]/h2")).getText(), "Hello "+ name+ ",");
		
		//For the buttons , you have a method in xpath called //button[text()='log out']
		//Also for xpath if you want to find all the elements with that value you can use //*[text()='Log out']
		System.out.println(driver.findElement(By.xpath("//*[text()='Log Out']")).getText());
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		//System.out.println(driver.getTitle());
		
		//System.out.println(driver.getTitle());
		
		driver.close();
		
		
	}
	
	
	public static String findPassword(WebDriver driver) throws InterruptedException {
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.xpath("//div[contains(@class,'forgot-pwd-container')]/a")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[contains(@class,'reset-pwd-btn')]")).click();
		
		String resetPwEle = driver.findElement(By.xpath("//p[contains(@class,'infoMsg')]")).getText();
		
		String[] resetPwArr = resetPwEle.split("'");
		
		String password = resetPwArr[1].split("'")[0]; //avoid using indexes
		//String[] resPwAnsArr = resetPwArr[1].split("'");
		
		//String resPw = resetPwArr[0];
		
		return password;
	}
	
}
