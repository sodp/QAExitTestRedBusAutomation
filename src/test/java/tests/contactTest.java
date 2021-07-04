package tests;

import java.util.HashMap;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.contactPage;
import util.Execution;

public class contactTest extends BaseTest {
	private String sheetName = "Home Page";  
	@Test	
	public void ContactRedBus() throws Throwable {
		extentTest = extent.startTest("Valid SearchBus scenario test");

		String testcase = "Contact Page"; 
		HashMap<String, String> data = new HashMap<String, String>();
		data = reader.getRowTestData(sheetName, testcase);
		String executionRequired = data.get("Execution Required").toLowerCase();
		contactPage contactus = new contactPage(driver);
		Execution.toCheckExecutionRequired(executionRequired);
		contactus.contactusButton();
		contactus.clickSupport();
		contactus.close();
		
		Assert.assertEquals("red:Care", driver.getTitle());
		logger.info("SearchBus Test Case Passed");

		Thread.sleep(1000);

	}

}
