package saroj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderSelection {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();

		driver.findElement(By.xpath("//a[@value='BLR']")).click();

		Thread.sleep(2000);

		

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		//select calender current date
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click(); //selecting with class name
	}

}
