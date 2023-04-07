package saroj;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skynetlogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://dev-skynet.resolutiondigital.com.au/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.cssSelector("h2[id='toggle-login-form']")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("skynet-admin-au@yopmail.com");
		
		//driver.findElement(By.linkText("Login with email/password?")).click();
		
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("-M3A8V=");
		
		driver.findElement(By.cssSelector("button[name='button']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//h3[normalize-space()='MBA Tool']")).click();	
		
		//Create MBA
		driver.findElement(By.xpath("//a[@href='#/create/summary']")).click();
		
		//MBA Form
		

	}

}
