import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectorsPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\webdrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		//Implicit wait so that selenium does not throw error as soon as it does not find it but rather it should wait for specific time and then only proceed
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("inputUsername")).sendKeys("jay");
		
		driver.findElement(By.name("inputPassword")).sendKeys("abcd");
		
		driver.findElement(By.className("signInBtn")).click();
		
		//Error will be displayed
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		//***************FORGOT PASSOWORD PAGE*********************
		/*
		 *  //input[@attribute= 'value']
		 */
		
		//The script needs to be paused so that the new form renders on the page
		
		
			Thread.sleep(1000);
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@rda.com");
	    
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
	    
	    //Indexing
	    //When encountering multiple attributes, we can use indexing
	    //indexing starts from 1
	    driver.findElement(By.xpath("//input[@type='text'][2]")).sendKeys("JohnCena@ycsm.com");
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
	    
	    //Child using css
	    driver.findElement(By.cssSelector("input[type='text']:nth-child(4)"));
	    
	    //xpath parent to child way
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("8798798799");
	    
	    
	    //cssSelector
	    driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	    
	    //cssSelector parent child for tags
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	    
	  //Parent to child flow in xpath //div[contains(@class ,'pwd')]/button[contains(@class,'login')]
	    driver.findElement(By.xpath("//div[contains(@class ,'pwd')]/button[1]")).click();
	    
	    
			Thread.sleep(2000);
		
	    //
	    /*
	     * If we run it as it isthe system will give an error
	     * this is because as the page is single page webpage, so once we click on a thing it takes time to render it
	     * 
	     * driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Rahul");
		
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("John@rda.com");
	    
	    driver.findElement(By.cssSelector("input[placeholder='Email']")).clear();
	    
	    //Indexing
	    //When encountering multiple attributes, we can use indexingt
	    //indexing starts from 1
	    driver.findElement(By.xpath("//input[type='text'][2]")).sendKeys("JohnCena@ycsm.com");
	    driver.findElement(By.xpath("//input[@placeholder='Name']")).clear();
	    
	    //Child using css
	    driver.findElement(By.xpath("//input[@type='text']:nth-child(3)"));
	    
	    //xpath parent to child way
	    driver.findElement(By.xpath("//form/input[3]")).sendKeys("8798798799");
	    
	    
	    //cssSelector
	    driver.findElement(By.cssSelector("reset-pwd-btn")).click();
	    
	    //cssSelector parent child for tags
	    System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	    
	     */
	    
	    
	    //**********************BACK TO LOGIN PAGE***************
	    
	    driver.findElement(By.cssSelector("#inputUsername")).sendKeys("jay");
	    //REGEX
	    
	    driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	    
	    driver.findElement(By.id("chkboxOne")).click();
	    
	    
	    driver.findElement(By.xpath("//input[contains(@id,'Two')]")).click();
	    
	    driver.findElement(By.xpath("//button[contains(@class ,'signIn')]")).click();
	    
	    String s = driver.getTitle();
	    
	    System.out.println(s);
	    
	    
	    
	    
	}

}
