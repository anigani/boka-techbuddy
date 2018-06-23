package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import basePage.PageObject;

public class BokaTechbuddyConfirmPage extends PageObject {

	@FindBy(xpath = "//input[@class='el-input__inner']")
	public WebElement passwordCode;

	@FindBy(xpath = "//button[@class='el-button submit-button el-button--primary']")
	WebElement codeButton;
	
	public BokaTechbuddyConfirmPage(WebDriver driver) {
		super(driver);
	}

	public BokaTechbuddyCustomerPage enterCode(String code) {
		// Input  code
		setInput(passwordCode, code);
		
		codeButton.click();

		return new BokaTechbuddyCustomerPage(driver);
	}
	
	
	public boolean isConfirmPage() {
		String url = driver.getCurrentUrl();

		boolean result = url.contains("verify");

		return result;
	}

}
