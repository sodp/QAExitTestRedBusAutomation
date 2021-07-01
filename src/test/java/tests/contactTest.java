package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.contactPage;
import util.commonUtil;

public class contactTest extends BaseTest {
	private String sheetName = "RedbusFunctionality";
	@Test	
	public void ContactRedBus() throws Throwable {
		extentTest = extent.startTest("Valid SearchBus scenario test");

		//String testcase = "ContactRedBus";

		// Fetching all test data from excel file
		//HashMap<String, String> data = new HashMap<String, String>();
		//data = reader.getRowTestData(sheetName, testcase);
		//String executionRequired = data.get("Execution Required").toLowerCase();
		
		contactPage contactus = new contactPage(driver);
		//commonUtil.toCheckExecutionRequired(executionRequired);
		contactus.contactUsButton();
		contactus.ClickForSupport();
		contactus.close();
		
		Assert.assertEquals("red:Care", driver.getTitle());
		logger.info("SearchBus Test Case Passed");

		Thread.sleep(9000);

	}

}
