package framework;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	
public static WebDriver getDriver() {
	return driver.get();
	
}

public static void setDriver(Browser browser) {
	driver.set(WebDriverFactory.getWebDriver(browser));
}

public static void unload() {
	driver.remove();
}


	
}
