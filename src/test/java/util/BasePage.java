package util;

import java.util.concurrent.TimeUnit;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BasePage {
	protected WebDriver driver;

	@BeforeClass // Runs this method before the first test method in the current class is invoked
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "D:\\ProgramFiles\\geckodriver-v0.20.0-win64\\geckodriver.exe");

	}

	@BeforeMethod
	public void before() {
		// Create a new instance of the Firefox driver
		driver = new FirefoxDriver();

		// Put an Implicit wait, this means that any search for elements on the page
		// could take the time the implicit wait is set for before throwing exception
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}