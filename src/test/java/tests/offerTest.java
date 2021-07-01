package tests;
import org.testng.Assert;
import org.testng.annotations.Test;

import pages.offerPage;


public class offerTest extends BaseTest {
	@Test
	public void offers() throws Throwable {
		extentTest = extent.startTest(" offers page scenario test");
		offerPage useroffers = new offerPage(driver);

		useroffers.clickOfferButton();

		logger.info("offers Test Case Passed");
		Assert.assertEquals("Offers: Bus Offers, Hotel Discounts & Coupon Codes - redBus", driver.getTitle());
		Thread.sleep(5000);
	}
}
