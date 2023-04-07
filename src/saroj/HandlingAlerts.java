package saroj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) {

		String text = "saroj";
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(text);

		driver.findElement(By.cssSelector("[id='alertbtn']")).click();

		// switch to alert form driver
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();

		driver.findElement(By.id("confirmbtn")).click();
		driver.switchTo().alert().dismiss();

	}

}
