package framework;

import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverFactory {

	private static Properties properties;

	private WebDriverFactory() {
		// To prevent external instantiation of this class
	}

	

	public static WebDriver getWebDriver(Browser browser) {
		WebDriver driver = null;
		properties = Settings.getProperties();
		switch (browser) {
		case CHROME:
			// Takes the system proxy settings automatically
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case CHROME_HEADLESS:

			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
			break;

		case FIREFOX:
			// Takes the system proxy settings automatically
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;

		case INTERNET_EXPLORER:
			// Takes the system proxy settings automatically

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		case EDGE:
			// Takes the system proxy settings automatically

			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;

		default:
			throw new FrameworkException("Unhandled browser!");
		}

		return driver;

}
	public static RemoteWebDriver 
	
}
