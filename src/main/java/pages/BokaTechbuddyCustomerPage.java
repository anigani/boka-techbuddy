package pages;

import org.openqa.selenium.WebDriver;

import basePage.PageObject;

public class BokaTechbuddyCustomerPage extends PageObject {

	public BokaTechbuddyCustomerPage(WebDriver driver) {
		super(driver);
	}

	public boolean isCustomerPage() {
		String url = driver.getCurrentUrl();

		boolean result = url.contains("customer");

		return result;
	}
}
