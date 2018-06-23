package boka.techbuddy;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.BokaTechbuddyConfirmPage;
import pages.BokaTechbuddyCustomerPage;
import pages.BokaTechbuddyHomePage;
import util.BasePage;

public class BokaTechbuddyLogin extends BasePage {
	@Test
	public void testBokaTechbuddyLoginPageOK() {
		BokaTechbuddyHomePage bokaTechbuddyHomePage = new BokaTechbuddyHomePage(driver);
		BokaTechbuddyConfirmPage bokaTechbuddyConfirmPage = bokaTechbuddyHomePage.login("46704445551");

		Assert.assertTrue(bokaTechbuddyConfirmPage.isConfirmPage());

	}

	@Test
	public void testBokaTechbuddyCodePageOK() {
		BokaTechbuddyHomePage bokaTechbuddyHomePage = new BokaTechbuddyHomePage(driver);
		BokaTechbuddyConfirmPage bokaTechbuddyConfirmPage = bokaTechbuddyHomePage.login("46704445551");
		BokaTechbuddyCustomerPage bokaTechbuddyCustomerPage = bokaTechbuddyConfirmPage.enterCode("100100");

		Assert.assertTrue(bokaTechbuddyCustomerPage.isCustomerPage());
	}
}