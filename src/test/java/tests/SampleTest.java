package tests;

import org.testng.annotations.BeforeTest;

import framework.Browser;
import framework.DriverManager;

public class SampleTest {

	
	@BeforeTest
	public static void OpenBrowser() {
		DriverManager.setDriver(Browser.CHROME);
	}
	
}
