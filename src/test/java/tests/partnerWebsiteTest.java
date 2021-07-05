package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.partnerWebsitePage;
import util.Execution;

public class partnerWebsiteTest extends BaseTest {
	private String sheetName = "Home Page";

	@Test
	public void partnergoibibosite() throws Throwable {
		extentTest = extent.startTest("Valid Goibibo Navigation Test"); // goibibowebsite
		String testcase = "goibibowebsite";
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		//Check Execution Required 
		String executionRequired = data.get("Execution Required").toLowerCase();
		Execution.toCheckExecutionRequired(executionRequired);

		partnerWebsitePage website = new partnerWebsitePage(driver);

		website.GoibiboSite();
		Thread.sleep(1000);
		Assert.assertEquals(
				"Goibibo - Best Travel Website. Book Hotels, Flights, Trains, Bus and Cabs with upto 50% off",
				driver.getTitle());
		logger.info("PartnerWebsitesPage functionality Test Case Passed");
		Thread.sleep(1000);
	}

	@Test
	public void partnerWebsitesmakemytrip() throws Throwable {
		extentTest = extent.startTest("Valid Make My Trip Navigation test");
		String testcase = "makemytripwebsite";

		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		Execution.toCheckExecutionRequired(executionRequired);

		partnerWebsitePage website = new partnerWebsitePage(driver);

		website.MakemytripSite();
		Thread.sleep(1000);
		Assert.assertEquals("MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday", driver.getTitle());
		logger.info("PartnerWebsitesPage functionality Test Case Passed");
		Thread.sleep(1000);
	}
}
