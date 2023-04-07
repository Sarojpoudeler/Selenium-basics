package saroj;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class ValidationUiElements {

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
		
		// System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled());

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();

		System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));

		if(driver.findElement(By.id("Div1")).getAttribute("style").contains("1"))

		{

		System.out.println("its enabled");

		Assert.assertTrue(true);

		}

		else

		{

		Assert.assertTrue(false);

		}
	}

}
