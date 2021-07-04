package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.offerPage;
import util.Execution;

public class offerTest extends BaseTest {
	private String sheetName = "Home Page"; 
	@Test
	public void offers() throws Throwable {
		extentTest = extent.startTest(" Offers Page Navigation Test");
		String testcase = "Offer Page"; 
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		Execution.toCheckExecutionRequired(executionRequired);
		
		offerPage useroffers = new offerPage(driver);
		useroffers.clickOfferButton();

		logger.info("offers Test Case Passed");
		Assert.assertEquals("Offers: Bus Offers, Hotel Discounts & Coupon Codes - redBus", driver.getTitle());
		Thread.sleep(5000);
	}
}
