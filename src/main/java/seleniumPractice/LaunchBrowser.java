package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromiumdriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username= driver.findElement(By.id("user-name"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement login= driver.findElement(By.id("login-button"));
		username.sendKeys("standard_user");
		password.sendKeys("secret_sauce");
		login.click();
		
		String url="https://www.saucedemo.com/inventory.html";
		String currentUrl= driver.getCurrentUrl();
		
		
		
		
		
	}
	
	public void assertion(String url,String currentUrl) {
		Assert.assertEquals(url,currentUrl,true);
		
	}

}
