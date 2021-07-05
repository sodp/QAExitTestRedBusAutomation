package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.mobileAppLink;
import util.Execution;

public class mobileAppLinkTest extends BaseTest {
	private String sheetName = "Home Page";

	@Test
	public void InvalidMobileAppLink() throws Exception {
		String testName = "App Link Send  Invalid";
		extentTest = extent.startTest("Invalid App Link Scenario test");
		mobileAppLink mobLink = new mobileAppLink(driver);
		HashMap<String, String> testData = new HashMap<String, String>();
		testData = reader.getRowTestData(sheetName, testName);
		//Check Execution Required 
		String executionRequired = testData.get("Execution Required").toLowerCase();
		String mobile = testData.get("Mobile Number");
		Execution.toCheckExecutionRequired(executionRequired);

		mobLink.sendAppLink(mobile);
		Assert.assertEquals(mobLink.errorInvalidMob.getText(), "Invalid Mobile No");
	}

	@Test
	public void ValidMobileAppLink() throws Exception {
		String testName = "App Link Send  Valid";
		extentTest = extent.startTest("Valid App Link Scenario test");

		mobileAppLink mobLink = new mobileAppLink(driver);
		HashMap<String, String> testData = new HashMap<String, String>();

		testData = reader.getRowTestData(sheetName, testName);
		String executionRequired = testData.get("Execution Required").toLowerCase();
		String mobile = testData.get("Mobile Number");
		Execution.toCheckExecutionRequired(executionRequired);

		mobLink.sendAppLink(mobile);
		Assert.assertEquals(mobLink.validMobMsg.getText(),
				"Sorry ! please try again. We are facing issues in sending SMS");
	}

}