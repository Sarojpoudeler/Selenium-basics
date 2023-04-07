package saroj;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EcommerceWebTesting {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		int j= 0;
		String[] Items= {"Brocolli","Beans","Potato","Mango","Almonds"};
		
		List<WebElement> productList = driver.findElements(By.cssSelector("h4.product-name"));
		
		for(int i=0 ; i<=productList.size(); i++)
		{
			String[] productName = productList.get(i).getText().split("-");//getting name of vegitable on the product list and split
			String formatedProduct = productName[0].trim();
			//Convert array into array List for easy search
			List itemsNeeded = Arrays.asList(Items);
			
			//Check whether name extracted is present on the array list or not
			if(itemsNeeded.contains(formatedProduct))
			{
				j++;
				//Click on Add to cart
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==Items.length) {
					break;
				}
			}
			
			
			
		}
		
		//driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();

	}

}
