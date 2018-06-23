package basePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class PageObject {
	protected WebDriver driver;

	public PageObject(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void setInput(WebElement element, String mobileNumber) {
		if (element != null && element.isDisplayed()) {
			// element.click();
			element.sendKeys(mobileNumber);
		}
	}

	
}
