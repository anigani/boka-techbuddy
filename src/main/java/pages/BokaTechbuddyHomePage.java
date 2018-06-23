package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.PageObject;

public class BokaTechbuddyHomePage extends PageObject {
	public final String URL = "https://boka.techbuddy.io/#/login";

	public BokaTechbuddyHomePage(WebDriver driver) {
		super(driver);
		// Go to the Boka Techbuddy Home Page
		driver.get(URL);
	}

	@FindBy(xpath = "//input[@class='el-input__inner']")
	WebElement mobilnumberElement;

	@FindBy(xpath = "//button[@class='el-button submit-button el-button--primary']")
	WebElement submitBtnElement;

	public BokaTechbuddyConfirmPage login(String mobileNumber) {
		
		setInput(mobilnumberElement, mobileNumber);

		submitBtnElement.click();
	
		return new BokaTechbuddyConfirmPage(driver);

	}

	
}